package Bank.Management.System;

import java.text.DecimalFormat;
import static Bank.Management.System.AccountType.accountType;

public class AccountBalance {

    protected static double balance;
    protected static double balanceCU;

    //Show account balance
    protected static void showBalance() {
        DecimalFormat dc = new DecimalFormat("0.00"); //Formata��o usando duas casas ap�s a v�rgula
        if (accountType == 'b') {
            System.out.println("O seu saldo �: R$" + dc.format(balanceCU + (balanceCU * 0.05)));
            balanceCU += (balanceCU * 0.05);
            System.out.println("Taxa de rendimento de 0,5% ao m�s.");
        }
        else {
            System.out.println("O seu saldo �: R$" + dc.format(balance));
        }
    }
}
