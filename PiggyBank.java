public class PiggyBank {
    public double amount;
    public boolean broken;
    //this object is null until we instantiate it

    public PiggyBank(){
        this.amount = 0;
        this.broken = false;
        //or call the other constructor from THIS class(equivalent to saying new PiggyBank(0))
        //this(0)
        //this is a more advanced concept
    }
    public PiggyBank(double startingBalance){
        this.amount = startingBalance;
        this.broken = false;
    }
}
