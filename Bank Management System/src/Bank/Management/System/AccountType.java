package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class AccountType {

    //Choosing an account type
    protected static char accountType;

    //Constructor
    static char getAccountType() throws IOException {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite a letra associada ao tipo de conta que voc� deseja contratar: ");
            System.out.println("a) Conta Corrente");
            System.out.println("b) Conta Poupan�a");
            System.out.println("c) Conta Universit�ria");
            System.out.print("Op��o desejada: ");
            accountType = sc.next().charAt(0);

            switch (accountType) {
                case 'a':
                    System.out.println("Informa��es da Conta Corrente:");
                    System.out.println(" - Limitado a 24 saques por m�s;");
                    System.out.println(" - Limitado a realizar 4 transfer�ncias;");
                    //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$1000,00");
                    System.out.println(" - Tarifa de R$14,60 ao m�s;\n");
                    System.out.println("Voc� deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) N�o");
                    System.out.print("Op��o desejada: ");
                    char confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("Parab�ns! Voc� possui uma Conta Corrente.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                case 'b':
                    System.out.println("Informa��es da Conta Poupan�a:");
                    System.out.println(" - Limitado a 8 saques por m�s;");
                    System.out.println(" - Limitado a realizar 3 transfer�ncias;");
                    //System.out.println(" - Esse tipo de conta n�o possui cheque especial.");
                    System.out.println(" - Taxa de rendimento de 0,5% ao m�s;\n");
                    System.out.println("Voc� deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) N�o");
                    System.out.print("Op��o desejada: ");
                    confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("\nParab�ns! Voc� possui uma Conta Poupan�a.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                case 'c':
                    System.out.println("Informa��es da Conta Universit�ria:");
                    System.out.println(" - Limitado a 16 saques por m�s;");
                    System.out.println(" - Limitado a realizar 2 transfer�ncias;");
                    //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$800,00");
                    System.out.println(" - Tarifa de R$4,55 ao m�s;\n");
                    System.out.println("Voc� deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) N�o");
                    System.out.print("Op��o desejada: ");
                    confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("\nParab�ns! Voc� possui uma Conta Universit�ria.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                default:
                    System.out.println("Digite uma op��o v�lida.");
                    break;
            }
        }while (accountType != 'a' && accountType != 'b' && accountType != 'c');

        return accountType;
    }

}
