grammar dber;

INT     : [0-9]+ ;
NULL    : 'null' | 'NULL';
VAR     : [_a-zA-Z]+[_0-9a-zA-Z]+ ;
VALUE   : INT | NULL;

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


predict  : VAR OP VALUE;

predicts:  (predict (AND_OR predict)*)  ;

exprVar  :  '#{' VAR '}' ;
exprSentence  :    ;
exprIf  :  'if{'  (VAR | predicts)  '}' '->' ;





NEWLINE : '\r'? '\n' -> skip ;
WS      : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
