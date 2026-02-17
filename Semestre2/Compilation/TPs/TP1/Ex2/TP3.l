%{
%}
%option noyywrap
%%
[01]*011[01]* printf("chaine qui contient le facteur 011: %s\n",yytext);
[01]*00 printf("chaine qui termine par 00: %s\n",yytext);
1[01]*10 printf("chaine qui commance par 1 et termine par 10: %s\n",yytext);
.|\n 
%%
int main(void) {
yylex() ;
return 0;
}
