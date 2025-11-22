grammar tiger;

// Parser Rules

tigerProgram: 'main' 'let' declarationSegment 'in' 'begin' statSeq 'end';

declarationSegment: varDeclarationList functDeclarationList;

varDeclarationList: varDeclaration*;

varDeclaration: 'var' idList ':' type optionalInit ';';

functDeclarationList: functDeclaration*;

functDeclaration: 'function' ID '(' paramList ')' retType 'begin' statSeq 'end';

type: typeId
    | 'array' '[' INTLIT ']' 'of' typeId
    ;

typeId: 'int' | 'float';

idList: ID (',' ID)*;

optionalInit: (':=' const)?;

paramList: (param (',' param)*)?;

param: ID ':' type;

retType: (':' type)?;

statSeq: stat+;

stat: 'if' expr 'then' statSeq statIfTail
    | 'while' expr 'do' statSeq 'enddo' ';'
    | 'for' ID ':=' expr 'to' expr 'do' statSeq 'enddo' ';'
    | 'break' ';'
    | 'return' expr ';'
    | 'let' declarationSegment 'in' statSeq 'end'
    | ID statIdTail
    ;

statIfTail: 'endif' ';'
          | 'else' statSeq 'endif' ';'
          ;

statIdTail: ':=' expr ';'
          | '[' expr ']' ':=' expr ';'
          | '(' exprList ')' ';'
          ;

expr: exprOr;

exprOr: exprAnd ('|' exprOr)?;

exprAnd: exprRel ('&' exprAnd)?;

exprRel: exprAdd (opRel exprRel)?;

exprAdd: exprMult (opAdd exprAdd)?;

exprMult: atom (opMult exprMult)?;

atom: const
    | ID atomTail
    | '(' expr ')'
    ;

atomTail: '[' expr ']'
        | '(' exprList ')'
        | 
        ;

const: INTLIT | FLOATLIT;

exprList: (expr (',' expr)*)?;

opRel: '=' | '<>' | '<' | '>' | '<=' | '>=';
opAdd: '+' | '-';
opMult: '*' | '/';

// Lexer Rules

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

ID: [a-zA-Z][a-zA-Z0-9_]*;

INTLIT: [0-9]+;

FLOATLIT: [0-9]+ '.' [0-9]*;

COMMENT: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;
