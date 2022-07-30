package Bank.Management.System;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Bank.Management.System.AccountBalance.*;
import static Bank.Management.System.AccountType.accountType;

public class AccountDeposit {

    //Make a deposit
    protected static void getDeposit(double amountDep) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); //Formata��o usando duas casas ap�s a v�rgula

        if (amountDep > 0) {
            System.out.println("Deseja confirmar o dep�sito no valor de R$" + dc.format(amountDep));
            System.out.println("a) Sim\nb) N�o");
            char confirmDpt = sc.next().charAt(0);
            if(confirmDpt == 'a') {
                if(accountType == 'b'){
                    System.out.println("Seu dep�sito de R$" + dc.format(amountDep) + " foi realizado");
                    balanceCU += amountDep;
                    System.out.println("Seu novo saldo � de R$" + dc.format(balanceCU));
                }
                else {
                    System.out.println("Seu dep�sito de R$" + dc.format(amountDep) + " foi realizado.");
                    balance += amountDep;
                    System.out.println("Seu novo saldo � de R$" + dc.format(balance));
                }
            }
        } else {
            System.out.println("Digite um valor v�lido para o dep�sito.");
        }
    }
}
