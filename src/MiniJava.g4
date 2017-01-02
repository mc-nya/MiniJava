grammar MiniJava;
options{

  language=Java;
  }
goal:mainClass( classDeclaration)* EOF    #LabelGoal
;
mainClass:'class'Identifier'{''public''static''void''main''(''String''['']'Identifier')''{'statement'}''}'  #LabelMainClass
;
classDeclaration:'class'Identifier('extends'Identifier)?'{'(varDeclaration)* ( methodDeclaration )*'}'  #DclrClass
;
varDeclaration: type Identifier ';'     #DclrVar
;
methodDeclaration:	'public' type Identifier '(' ( type Identifier ( ',' type Identifier )* )?
 ')' '{' ( varDeclaration )* ( statement )* 'return' expression ';' '}'     #DclrMethod
 ;
type	:	'int' '[' ']'   #TypeArray
|	'boolean'   #TypeBool
|	'int'   #TypeInt
|	Identifier     #TypeId
;
statement	:	'{' ( statement )* '}'      #StmBrace
|	'if' '(' expression ')' statement 'else' statement  #StmIf
|	'while' '(' expression ')' statement    #StmWhile
|	'System.out.println' '(' expression ')' ';' #StmOut
|	Identifier '=' expression ';'   #StmAssign
|	Identifier '[' expression ']' '=' expression ';'   #StmArrayAssign
;
expression	:	expression op=( '&&' | '<' | '+' | '-' | '*' ) expression      #ExpCalc
|	expression '[' expression ']'   #ExpArray
|	expression '.' 'length'  #ExpLength
|	expression '.' Identifier '(' ( expression ( ',' expression )* )? ')'   #ExpCall
|	INTEGER_LITERAL     #ExpInt
|	'true'          #ExpTure
|	'false'         #ExpFalse
|	Identifier      #ExpId
|	'this'      #ExpThis
|	'new' 'int' '[' expression ']'  #ExpArrayDefine
|	'new' Identifier '(' ')'        #ExpIdDefine
|	'!' expression      #ExpNot
|	'(' expression ')'     #ExpBracket
;

INTEGER_LITERAL:[0-9]+;
Identifier:[a-zA-Z_][a-zA-Z0-9_]*;
WS:[ \n\r\t']+ -> skip;
MUL:'*';
ADD:'+';
SUB:'-';
AND:'&&';
LT:'<';