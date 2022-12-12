const vscode = require('vscode');

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context) {
    const EXTENSION_ID = 'nome';
    const CONFIG = vscode.workspace.getConfiguration(EXTENSION_ID);
    console.log(`'${EXTENSION_ID}' is now activated!`);

    let seeDocumentation = vscode.commands.registerCommand('nome.seeDocumentation', function () {
        let uri = vscode.Uri.parse('https://jipcad.github.io/docs/lang-ref/configuration');
        const thing = vscode.env.openExternal(uri);
        thing.then(function (value) {
            vscode.window.showInformationMessage('Website Loaded');
            // console.log(value);
        }, function (error) {
            vscode.window.showInformationMessage('Website Failed to Load: ' + error);
        });
    });

    let setExecutable = vscode.commands.registerCommand('nome.setExecutable', function () {
        vscode.window.showOpenDialog({
            title: 'Select Nome3 executable',
            canSelectFiles: true,
        }).then(files => {
            if (files) {
                fp = files[0].fsPath;
                CONFIG.update('executable', fp);

                if (vscode.extensions.getExtension('formulahendry.code-runner')) {
                    let CR_CONF = vscode.workspace.getConfiguration('code-runner');
                    if (CR_CONF === undefined) {
                        vscode.workspace.getConfiguration().update('code-runner.executorMap', {});
                    }

                    map = CR_CONF.inspect('executorMap').workspaceFolderValue;
                    if (map === undefined) {
                        CR_CONF.update('executorMap', { 'nome': fp });
                    } else {
                        map['nome'] = fp;
                        CR_CONF.update('executorMap', map);
                    }
                }
                console.log(`Saved executable path: ${fp}`);
            }
        });
    });

    let runCode = vscode.commands.registerCommand('nome.runCode', function () {
        if (!CONFIG.get('executable')) {
            vscode.window.showErrorMessage('Nome3 executable not set!');
        } else {
            const editor = vscode.window.activeTextEditor;
            const cmd = `${CONFIG.get('executable')} ${editor.document.fileName}`;
            let terminal = vscode.window.createTerminal("Nome3 execution");
            terminal.sendText(cmd);
        }
    });

    context.subscriptions.push(seeDocumentation);
    context.subscriptions.push(runCode);
    context.subscriptions.push(setExecutable);
}

function deactivate() { }

module.exports = {
    activate,
    deactivate
};

