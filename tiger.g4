grammar tiger;

// Start rule
tigerProgram: 'main' 'let' declarationSegment 'in' 'begin' statSeq 'end';

// Declaration segment
declarationSegment: varDeclarationList functDeclarationList;

varDeclarationList: varDeclaration*;

varDeclaration: 'var' idList ':' type optionalInit ';';

functDeclarationList: functDeclaration*;

functDeclaration: 'function' ID '(' paramList ')' retType 'begin' statSeq 'end';

// Types
type: typeId
    | 'array' '[' INTLIT ']' 'of' typeId
    ;

typeId: 'int' | 'float';

// ID lists
idList: ID (',' ID)*;

// Optional initialization
optionalInit: (':=' const)?;

// Parameters
paramList: (param (',' param)*)?;

param: ID ':' type;

retType: (':' type)?;

// Statement sequence
statSeq: stat+;

// Statements
stat: lvalue ':=' expr ';'
    | 'if' expr 'then' statSeq 'endif' ';'
    | 'if' expr 'then' statSeq 'else' statSeq 'endif' ';'
    | 'while' expr 'do' statSeq 'enddo' ';'
    | 'for' ID ':=' expr 'to' expr 'do' statSeq 'enddo' ';'
    | optPrefix ID '(' exprList ')' ';'
    | 'break' ';'
    | 'return' expr ';'
    | 'let' declarationSegment 'in' statSeq 'end'
    ;

optPrefix: (lvalue ':=')?
    ;

// Expressions (this will need fixing later for precedence/associativity)
expr: const
    | lvalue
    | expr binaryOperator expr
    | '(' expr ')'
    ;

const: INTLIT | FLOATLIT;

binaryOperator: '+' | '-' | '*' | '/' | '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|';

// Expression lists
exprList: (expr (',' expr)*)?;

// L-values
lvalue: ID lvalueTail;

lvalueTail: ('[' expr ']')?
    ;

// ========== LEXER RULES (TOKENS) ==========

// Keywords (must come before ID)
MAIN: 'main';
ARRAY: 'array';
BREAK: 'break';
DO: 'do';
IF: 'if';
ELSE: 'else';
FOR: 'for';
FUNCTION: 'function';
LET: 'let';
IN: 'in';
OF: 'of';
THEN: 'then';
TO: 'to';
VAR: 'var';
WHILE: 'while';
ENDIF: 'endif';
BEGIN: 'begin';
END: 'end';
ENDDO: 'enddo';
RETURN: 'return';
INT: 'int';
FLOAT: 'float';

// Operators and punctuation (order matters - longer operators first)
ASSIGN: ':=';
LE: '<=';
GE: '>=';
NE: '<>';
LT: '<';
GT: '>';
EQ: '=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
AND: '&';
OR: '|';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';

// Identifiers and literals
ID: [a-zA-Z][a-zA-Z0-9_]*;

INTLIT: [0-9]+;

FLOATLIT: [0-9]+ '.' [0-9]*;

// Comments and whitespace
COMMENT: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;
