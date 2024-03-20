package lista02.exercicio02;

// . Grande parte dos programas de computador trabalham com data, que deve ser validada
// para que o usuário não coloque datas que não existam como 31/04/2008, 12/14/2009
// ou 43/05/2000. Faça um programa em Java para imprimir se a data é válida ou não.
// Considerar também a ocorrência de anos bissextos, sabendo que: um ano é bissexto se
// for divisível por 400, ou por 4 e não o for por 100.


public class dataValida {
    int ano;
    int mes;
    int dia;
    String x;

     String  validarData (int ano, int  mes, int dia) {

        if (ano % 4 == 0 && ano % 100 != 0) {
            if( mes == 2 ) {
                if (dia >= 1 && dia <= 29) { 
                    x = "Data válida";
                }
                else { 
                     x = "Data não válida";
                }
                }
                else {
                    if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                        if (dia >= 1 && dia <= 31) { 
                            x = "Data válida";
                        }
                        else { 
                             x = "Data não válida";
                        }
                    }
                    else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                        if (dia >= 1 && dia <= 30) { 
                             x = "Data válida";
                        }
                        else {
                             x = "Data não válida";
                        }
                        }
                        else {
                        x = "Data não válida";
                         }
                }
            }
            else {
                if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                    if (dia >= 1 && dia <= 31) { 
                        x = "Data válida";
                    }
                    else { 
                         x = "Data não válida";
                    }
                }
                else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
                    if (dia >= 1 && dia <= 30) { 
                         x = "Data válida";
                    }
                    else {
                         x = "Data não válida";
                    }
                }
                else {
                    x = "Data não válida";
                }
            }

            return x;
        }
    }
