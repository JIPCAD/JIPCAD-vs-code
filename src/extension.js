const vscode = require('vscode');

function activate(context){
    
    console.log('Congratulations, your extension "nome3" is now active!');

	let seeDocumentation = vscode.commands.registerCommand('nome3.seeDocumentation', function () {
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
	let runNomeCode = vscode.commands.registerCommand('nome3.runNomeCode', function () {
		vscode.window.showInformationMessage('Code Run successfully!');
	});

	context.subscriptions.push(seeDocumentation);
	context.subscriptions.push(runNomeCode);
}
function deactivate() {}
module.exports = {
    activate,
    deactivate
};

