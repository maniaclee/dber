grammar Dber;

INT     : [0-9]+ ;
NULL    : 'null' | 'NULL';
VAR     : [_a-zA-Z]+[_0-9a-zA-Z]+ ;
STRING	: '\''.*'\'';
VALUE   : INT |STRING| NULL| ;

GET     : '>=';
GT      : '>';
LT      : '<';
LET     : '<=';
EQ      : '=';
NOT_EQ  : '!=' ;
OP      : GET|GT|LET|EQ|NOT_EQ;

AND     :'&&';
OR      :'||';
AND_OR  : AND | OR;

//
//predict  : VAR OP VALUE;
//
//predicts:  (predict (AND_OR predict)*)  ;
//
//exprVar  :  '#{' VAR '}' ;
//exprSentence  :  (exprVar | ~WS)+  ;
//exprIf  :  'if{'  (VAR | predicts)  '}' '->' exprSentence;
//
NEWLINE : '\r'? '\n' -> skip ;
WS      : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
//
//all		:		exprIf |exprSentence;
//all		:VAR OP VALUE;
all		:INT;
