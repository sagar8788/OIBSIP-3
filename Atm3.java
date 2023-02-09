import java.util.Scanner;

public class Atm3 {
    public static void main(String args[]) {
        Atm2 op = new Atm2();
        int userid = 57825;
        int userpin = 1975;
        Scanner in = new Scanner(System.in);

        System.out.println("***** Welcome to ATM Machine ***** \n");
        System.out.println("Enter userid: ");
        int id =in.nextInt();
        System.out.println("Enter pin: ");
        int pin = in.nextInt();
        if((userid==id)&&(userpin==pin)){
            while (true){
                System.out.println("1.View balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Transaction\n 5.Exit");
                System.out.println("Enter choice: ");
                int ch = in.nextInt();
                if (ch==1) {
                    op.viewbalance();
                    System.out.println("\n");
                }
                else if (ch==2){
                    System.out.println("Enter Amount to withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    System.out.println("\n");
                }
                else if (ch==3) {
                    System.out.println("Enter Amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                    System.out.println("\n");
                } else if (ch==4) {
                    op.viewTransaction_history();
                    System.out.println("\n");
                } else if (ch==5) {
                    System.out.println("Thank you for using atm");
                    System.out.println(0);
                    System.out.println("\n");
                }
                else {
                    System.out.println("Please enter correct choice: ");
                    System.out.println("\n");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm pin");
            System.exit(0);
        }

    }

}
