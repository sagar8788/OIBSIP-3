
import java.util.HashMap;
import java.util.Map;

public class Atm2 implements Atm1 {
    Atm a = new Atm();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewbalance() {
        System.out.println("Available balance is: "+a.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0){
            if (withdrawAmount <= a.getBalance()){
                ministmt.put(withdrawAmount, "Amount withdrawn");
                System.out.println("collect the cash"+withdrawAmount);
                a.setBalance(a.getBalance() - withdrawAmount);
                viewbalance();
            }
            else{
                System.out.println("insufficient balance");
            }
        }
        else {
            System.out.println("Please enter the amount in multiple of 500");
        }

    }


    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount Deposited");
        System.out.println(depositAmount+"Amount Deposited");
        a.setBalance(a.getBalance() + depositAmount);
        viewbalance();

    }

    @Override
    public void viewTransaction_history() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
