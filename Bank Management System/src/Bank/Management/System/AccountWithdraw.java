package Bank.Management.System;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Bank.Management.System.AccountBalance.*;
import static Bank.Management.System.AccountType.accountType;

public class AccountWithdraw {

    //Make a withdraw
    protected static void getWithdraw(double amountWit){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); //Formata��o usando duas casas ap�s a v�rgula

        System.out.println("Confirmar saque de R$" + dc.format(amountWit));
        System.out.println("a) Sim\nb) N�o");
        char confirmWit = sc.next().charAt(0);
        System.out.println("\n");
        if(confirmWit == 'a' && amountWit > 0 && balance >= amountWit && accountType != 'b') {
            System.out.println("Seu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balance -= amountWit;
            System.out.println("Seu novo saldo � de R$" + dc.format(balance));
        }
        else if (confirmWit == 'a' && amountWit > 0 && balanceCU >= amountWit && accountType == 'b') {
            System.out.println("Seu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balanceCU -= amountWit;
        }
        else if(confirmWit == 'b'){
            System.out.println("Saque cancelado.");
        }
        else  if(amountWit <= 0){
            System.out.println("Digite um valor v�lido para sacar.");
        }
        else if(balance < amountWit || balanceCU <= amountWit){
            System.out.println("Voc� n�o possui saldo suficiente para realizar este saque.");
        }
    }
}
