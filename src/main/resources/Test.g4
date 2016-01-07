grammar Test;

stat: 'return' e ';' # Return
    | 'break' ';' # Break
    ;
e   : e MUL e # Mult
    | e PLUS e # Add
    | INT # Int
    ;

predict : predict '>=' predict #Get
    |   predict '>' predict #Gt
    |   predict '<' predict #Lt
    |   predict '<=' predict #Let
    |   predict '!=' predict #Ne
    |   predict '==' predict #Eq
    |  INT  #Var
    ;
AND_OR: 'and' | 'or';

predicts :predicts AND_OR predicts
    |predict
    ;

MUL : '*';
PLUS: '+';
array : '{' el+=INT (',' el+=INT)* '}' ;   //context里  public List<Token> el = new ArrayList<Token>();
INT	:[0-9]+;    //token大写，rule小写


NEWLINE : '\r'? '\n' -> skip ;
WS      : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;


BLOCK_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> channel(HIDDEN)
    ;

tell: predicts;