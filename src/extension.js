const vscode = require('vscode');

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context) {
    console.log('Congratulations, your extension "nome3" is now active!');
    let path; // define path variable
    let seeDocumentation = vscode.commands.registerCommand('nome.seeDocumentation', function () {
        let uri = vscode.Uri.parse('https://jipcad.github.io/docs/lang-ref/configuration');
        const thing = vscode.env.openExternal(uri);
        thing.then(function (value) {
            vscode.window.showInformationMessage('Website Loaded');
            console.log(value);
        }, function (error) {
            vscode.window.showInformationMessage('Website Failed to Load');
            console.log(error);
        });

    });

    let runNomeCode = vscode.commands.registerCommand('nome.runNomeCode', function () {
        let terminal = vscode.window.createTerminal("Nome3 execution");
        if (path === undefined) {
            terminal.show(true);
            terminal.sendText("cd JIPCAD");
            terminal.sendText("Nome3.exe");
        } else {
            terminal.show(true);
            terminal.sendText("cd " + path);
            terminal.sendText("Nome3.exe");
        }
    });

    let configurePath = vscode.commands.registerCommand('nome.configurePath', function () {
        let options = {
            prompt: "Please input the path to the NOME executable: ",
            placeHolder: "E.g. C:\\Users\\Home\\JIPCAD"
        };

        vscode.window.showInputBox(options).then(value => {
            if (!value) { return; }
            path = value;
        });
    });
    context.subscriptions.push(seeDocumentation);
    context.subscriptions.push(runNomeCode);
    context.subscriptions.push(configurePath);
}

function deactivate() { }

module.exports = {
    activate,
    deactivate
};

