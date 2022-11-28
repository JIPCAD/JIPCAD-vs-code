grammar Simple;

program: line* EOF;
line: statement | ifBlock | whileBlock;

statement: (assignment | functionCall) ';';

ifBlock: 'if' expression block ('else' block);


WS: [\t\r\n]* -> skip;
/* This is a delimiter for the language */
/* -> is basically a pointer */

