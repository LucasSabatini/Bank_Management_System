package Bank.Management.System;

import static Bank.Management.System.AccountType.accountType;

public class AccountDetails {

    //Mostrar informa��es da conta
    protected static void getAccDetails(char accDet){
        if(accountType == 'a'){
            System.out.println("Voc� possui uma Conta Corrente:");
            System.out.println(" - Limitado a 24 saques por m�s;");
            System.out.println(" - Limitado a realizar 4 transfer�ncias;");
            //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$1000,00");
            System.out.println(" - Tarifa de R$14,60 ao m�s;\n");
        }
        else if (accountType == 'b') {
            System.out.println("Voc� possui uma Conta Poupan�a:");
            System.out.println(" - Limitado a 8 saques por m�s;");
            System.out.println(" - Limitado a realizar 3 transfer�ncias;");
            //System.out.println(" - Esse tipo de conta n�o possui cheque especial.");
            System.out.println(" - Taxa de rendimento de 0,5% ao m�s;\n");
        }
        else if (accountType == 'c'){
            System.out.println("Voc� possui uma Conta Universit�ria:");
            System.out.println(" - Limitado a 16 saques por m�s;");
            System.out.println(" - Limitado a realizar 2 transfer�ncias;");
            //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$800,00");
            System.out.println(" - Tarifa de R$4,55 ao m�s;\n");
        }
    }
}
