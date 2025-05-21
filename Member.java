import java.util.Vector;

public class Member {

    private String name;
    private String lastName; // added
    private int memberId;
    private Vector<Loan> myLoan; // generic

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMemberId() {
        return memberId;
    }

    // Optionally remove getMemberId1()