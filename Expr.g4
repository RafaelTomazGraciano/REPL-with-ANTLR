grammar Expr;

prog:   VAR '=' expr | expr;

expr: term ('+' expr | '-' expr)?;

term: fact ('*' term | '/' term)?;

fact: '(' expr ')'| INT | VAR;

VAR  :   [a-zA-Z_][a-zA-Z_0-9]* ;
INT  :   [0-9]+ ;
WS   :   [ \t\r\n]+ -> skip ;
