const vscode = require('vscode');

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context){
    
    console.log('Congratulations, your extension "nome3" is now active!');

	let seeDocumentation = vscode.commands.registerCommand('nome.seeDocumentation', function () {
		let uri = vscode.Uri.parse('https://jipcad.github.io/docs/lang-ref/configuration');
		const thing = vscode.env.openExternal(uri);
		thing.then(function(value) {
			vscode.window.showInformationMessage('Website Loaded');
			console.log(value);
		}, function(error){
			vscode.window.showInformationMessage('Website Failed to Load');
			console.log(error);
		});
		
	});

	let runNomeCode = vscode.commands.registerCommand('nome.runNomeCode', function () {
		let terminal = vscode.window.createTerminal("Nome3 execution");
		terminal.show(true);
		// terminal.sendText("D:");
		// terminal.sendText("cd DEV_JIPCAD/vscode_extension/nome3language")
		terminal.sendText("cd JIPCAD");
		terminal.sendText("Nome3.exe")

		// let uri = vscode.Uri.parse('.\\JIPCAD\\Nome3.exe');
		// const thing = vscode.env.openExternal(uri);
		// thing.then(function(value) {
		// 	vscode.window.showInformationMessage('Code Run successfully!');
		// 	console.log(value);
		// }, function(error){
		// 	vscode.window.showInformationMessage('Code Failed to Run');
		// 	console.log(error);
		// });
		// let variable = new ActiveXObject("Shell.Application");
		// let command = "src\JIPCAD\Nome3.exe";
		// const thing = variable.ShellExecute(command,"","","open","1");
		// thing.then(function(value) {
		// 	vscode.window.showInformationMessage('Code Run successfully!');
		// 	console.log(value);
		// },function(error){
		// 	vscode.window.showInformationMessage('Code Failed to Run');
		// 	console.log(error);
		// })
	});
	context.subscriptions.push(seeDocumentation);
	context.subscriptions.push(runNomeCode);
}
const provider = {
    provideDocumentSemanticTokens(document) {
    // analyze the document and return semantic tokens

    const tokensBuilder = new vscode.SemanticTokensBuilder(legend);
    // on line 1, characters 1-5 are a class declaration
    tokensBuilder.push(
      new vscode.Range(new vscode.Position(1, 1), new vscode.Position(1, 5)),
      'class',
      ['declaration']
    );
    return tokensBuilder.build();
  }
};

const selector = { language: 'java', scheme: 'file' }; // register for all Java documents from the local file system

vscode.languages.registerDocumentSemanticTokensProvider(selector, provider, legend);


function deactivate() {}
module.exports = {
    activate,
    deactivate
};