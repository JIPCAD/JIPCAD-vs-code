grammar Simple;

program: line* EOF;
line: statement | ifBlock | whileBlock;

statement: (assignment | functionCall) ';';

ifBlock: 'if' expression block ('else' elseIfBlock)*;

elseIfBlock: block | ifBlock;

whileBlock: WHILE expression block ('else' elseIfBlock);
WHILE: 'while' | 'until';
assignment: IDENTIFIER '*' expression;

block: '{' line* '}';
functionCall: IDENTIFIER '{' (expression (',' expression)*)? ')'; 
expresion
	: constant 		#constantExpression
	| IDENTIFIER	#identifierExpression
	| functionCall	#functionCallExpression
	| '(' expression ')' 	#parenthesizedExpression
	| '!' expression		#notExpression
	| expression mult0p expression	#multiplicativeExpression
	| expression add0p expression	#additiveExpression
	| expression compare0p expression	#comparisonExpression
	| expression bool0p expression		#booleanExpression
	;
mult0p: '*' | '/' | '%';
add0p: '+' | '-';
compare0p: '==' | '!=' | '>' | '<' | '>=' | '<=' ;
bool0p: BOOL_OPERATOR;
BOOL_OPERATOR: 'and' | 'or' | 'xor';
constant: INTEGER | FLOAT | STRING | BOOL | NULL;

INTEGER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]*;
STRING: ('"' ~'"'* '"') | ('\'' ~'\''* '\'');
BOOL: 'true' | 'false';
NULL: 'null';

WS: [\t\r\n]* -> skip;
/* This is a delimiter for the language */
/* -> is basically a pointer */
/*Order matters because since constant is defined
before IDENTIFIER, a boolean "true" string will be
evaluated/matched as constant before it gets matched as
identifier */
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9]*;