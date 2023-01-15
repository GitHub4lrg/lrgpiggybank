public class PiggyBankService {
    PiggyBank bank;
    //this object is null until we instantiate it

    /**
     * here we are instantiating it(PiggyBankService)
     * no-args constructor for the service class that will also instatntiate the PiggyBank with it
     */
    public PiggyBankService(){
        bank = new PiggyBank();
    }
    /**
     * food for thought: if a new bank already exists, we can use it
     * @param bank an already instantiated piggy bank
     */
    public PiggyBankService(PiggyBank bank){
        this.bank = bank;
    }
    /*
     * if the bank has not be broken yet
     * starting from the bank's starting balance, add a quarter, and then update the piggy bank object's balance
     */
    public void depositQuarter(){
        if(bank.broken == false){
            double oldamount = bank.amount;
            double newamount = oldamount + .25;
            bank.amount = newamount;
        }
    }
    /*
     * set bank broken to true and return the dollar amount it contained
     */
    public double breakPiggyBankAndReturnBalance(){
        bank.broken = true;
        return bank.amount;
    }
}
