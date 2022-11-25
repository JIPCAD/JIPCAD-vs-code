(ns terminal-demo 
(:require ["vscode" :as vscode]))


(def terminal (vscode/window.createTerminal "Joyride demo"))


(.show terminal true)
(.sendText terminal "echo hello bash world")
(.sendText terminal "node")
(.sendText terminal "console.log('hello node world')")
(.sendText terminal ".exit")
(.sendText terminal "exit")
