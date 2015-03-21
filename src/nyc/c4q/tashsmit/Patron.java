package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/21/15.
 */
public class Patron {

    String patron;
    int pocket;
    BankAccount account;



    public Patron(String patron) {
        this.patron = patron;
    }

    public Patron(String patron, int pocket, BankAccount account) {
        this.patron = patron;
        this.pocket = pocket;
        this.account = new BankAccount(pocket);
    }

    



}
