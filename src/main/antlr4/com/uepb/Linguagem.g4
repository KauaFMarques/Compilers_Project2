grammar Linguagem;

// Regras de entrada
program : statement* ;
statement : variableDeclaration ';'
          | assignment ';'
          | printStatement ';'
          | ifStatement
          | whileStatement
          ;

// Declaração e atribuição de variáveis
variableDeclaration : 'var' ID ('=' expr)? ;
assignment          : ID '=' expr ;
printStatement      : 'print' '(' expr ')' ;

// Estruturas de controle
ifStatement         : 'if' '(' condition ')' '{' statement* '}' ;
whileStatement      : 'while' '(' condition ')' '{' statement* '}' ;

// Expressões
expr                : expr ('+'|'-') expr      # AddSub
                    | expr ('*'|'/') expr      # MulDiv
                    | '(' expr ')'             # Parens
                    | NUMBER                   # Number
                    | ID                       # Variable
                    ;

// Condicionais
condition           : expr ('<'|'>'|'=='|'>='|'<=') expr ;

// Tokens
ID      : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER  : [0-9]+ ;
WS      : [ \t\n\r]+ -> skip ;
