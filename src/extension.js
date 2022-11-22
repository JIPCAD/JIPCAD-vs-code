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
		let uri = vscode.Uri.parse('.src\\JIPCAD\\Nome3.exe');
		const thing = vscode.env.openExternal(uri);
		thing.then(function(value) {
			vscode.window.showInformationMessage('Code Run successfully!');
			console.log(value);
		}, function(error){
			vscode.window.showInformationMessage('Code Failed to Run');
			console.log(error);
		});
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
function deactivate() {}
module.exports = {
    activate,
    deactivate
};

