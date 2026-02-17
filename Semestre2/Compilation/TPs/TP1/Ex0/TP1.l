%{
int nbVoyelles, nbConsonnes, nbPonct ;
%}
%option noyywrap
consonne [b-df-hj-np-xz]
ponctuation [, ;:?!\,]
%%
[aeiouy] nbVoyelles++ ;
{consonne} nbConsonnes++ ;
{ponctuation} nbPonct++ ;
.|\n //ne rien faire
%%
int main(void) {
nbVoyelles = nbConsonnes = nbPonct = 0 ;
yylex() ;
printf("Il y a %d voyelles, %d consonnes, %d signes de ponctuations.\n ",
nbVoyelles, nbConsonnes, nbPonct) ;
return 0;
}
