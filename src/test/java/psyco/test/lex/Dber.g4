grammar Dber;
//file : clazz* ;
//clazz : 'class' ID '{' ignore '}' ;
//ignore : (method|clazz|.)*? ; // <- only change is to add clazz alt here
//method : type ID '()' block ;
//type : 'int' | 'void' ;
//block : '{' (block | .)*? '}' ;
//ID : [a-zA-Z] [a-zA-Z0-9]* ;
//ANY : . ;


INT	:[0-9]+;  //token大写，rule小写
LONG:INT 'l';
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
NULL    : 'null' | 'NULL';
STRING	: '\''.*?'\'';

num :INT    //{java.lang.Number x = $INT.int;}
    | LONG // {java.lang.Number x = java.lang.Long.parseLong($LONG.text);}
    ;
value   : num |STRING| NULL ;

VAR_PREFIX : '#' | '$';
varExpr: VAR_PREFIX '{' vars +=ID ('.' vars+=ID)* '}';  //在Context里弄成数组 List<Token> vars = new ArrayList<Token>()

calVar  : vars +=ID ('.' vars+=ID)*
        |value;
cal:    cal op cal
        |calVar
        ;       //a > 3  , 3==2


predict: predict andOr predict
        |cal
        ;      //a>3 && 4 > 4 or 1< a


constIf :'if'; //IF 不能在g4中定义，转化为java src会挂掉

exprSimple:varExpr|.;
predictBodyTrue :exprSimple;
predictBodyFalse :exprSimple;
exprPredict:  constIf '{' predict '->' predictBodyTrue*? ('else' '->'  predictBodyFalse*?)?  '}';



GET     : '>=';
GT      : '>';
LT      : '<';
LET     : '<=';
EQ      : '=';
NOT_EQ  : '!=' ;
op      : GET|GT|LT|LET|EQ|NOT_EQ;  //这是个rule 要小写！！！

AND     :'&&';
OR      :'||';
andOr  : AND | OR;      //这是个rule 要小写！！！

NEWLINE : '\r'? '\n' -> skip ;
WS      : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
EMPTY   : NEWLINE |WS;


BLOCK_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;


sentence :(exprPredict|varExpr|.)+?
        ;
