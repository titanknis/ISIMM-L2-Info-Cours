%{
%}
%option noyywrap
capital [A-Z][A-Za-z]*
%%
{capital} printf("Mot qui commence par un majuscule: %s\n",yytext);
[a-zA-Z]*er printf("Mot qui termine par er: %s\n",yytext);
[j][a-zA-Z]*[r] printf("Mot qui commence par j et se termine par r: %s\n",yytext);
.|\n 
%%
int main(void) {
yylex() ;
return 0;
}
