package gross_calculator;



public class UseAccount {
    public static void main(String args[]) {
        Account wife;
        Account habby;
        wife = new Account();
        habby = new Account();

        wife.name = "ABC";
        wife.address = "xyz";
        wife.balance = 10000;

        habby.name = "PQR";
        habby.address = "lmn";
        habby.balance = 4000;

        System.out.println(wife.name +" ("+ wife.address+ ")" + " has $ "+ wife.balance);
        System.out.println(habby.name +" ("+ habby.address+ ")" + " has $ "+ habby.balance);

    }
}


