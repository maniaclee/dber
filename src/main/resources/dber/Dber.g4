grammar Dber;
//file : clazz* ;
//clazz : 'class' ID '{' ignore '}' ;
//ignore : (method|clazz|.)*? ; // <- only change is to add clazz alt here
//method : type ID '()' block ;
//type : 'int' | 'void' ;
//block : '{' (block | .)*? '}' ;
//ID : [a-zA-Z] [a-zA-Z0-9]* ;
//ANY : . ;



INT	:[0-9]+;    //token大写，rule小写
LONG:INT 'l';
ID : [a-zA-Z] [a-zA-Z0-9]* ;
NULL    : 'null' | 'NULL';
STRING	: '\''.*?'\'';

num :INT | LONG;
value   : num |STRING| NULL| ;

VAR_PREFIX : '#' | '$';
varExpr: VAR_PREFIX '{' ID '}';

cal:    cal OP cal
        |value
        |ID
        ;       //a > 3  , 3==2


predict: predict AND_OR predict
        |cal
        ;      //a>3 && 4 > 4 or 1< a

//exprSimple:(varExpr|any)+;

IF :'if';
exprPredict: IF '{' predict '->' (varExpr|.)*? '}';


any:.|'>'|'='; //.不能包括 > = 这些字符 ！

//sentence :    (exprPredict|varExpr|.)+?
sentence :    predict
        ;

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

NEWLINE : '\r'? '\n' -> skip ;
WS      : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
EMPTY   : NEWLINE |WS;

//
//BLOCK_COMMENT
//    : '/*' .*? '*/' -> channel(HIDDEN)
//    ;
//LINE_COMMENT
//    : '//' ~[\r\n]* -> channel(HIDDEN)
//    ;