import java.util.Scanner;

public class Application{
    public static void main(String[] args){
        PiggyBank b = new PiggyBank(1.50);
        //PiggyBankService pbs = new PiggyBankService(b);

        Scanner sc = new Scanner(System.in);
        PiggyBankService bankService = new PiggyBankService(b);    //instantiating PiggyBankService here
        while(true){
            String input = sc.nextLine();
            if(input.equals("deposit")){
                //deposit a quarter
                bankService.depositQuarter();
            }else if(input.equals("break")){
                //break the piggy bank and display the total amount contained
                double finalbalance = bankService.breakPiggyBankAndReturnBalance();
                System.out.println(finalbalance);
            }
        }
    }
}