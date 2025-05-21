import java.util.Vector;

public class Member {

  private String name;
  private int memberId; // Fixed typo: integer -> int

  /**
   * 
   * @element-type Loan
   */
  public Vector myLoan;

  // Constructor with validation
  public Member(String name, int memberId) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty.");
    }
    if (memberId <= 0) {
      throw new IllegalArgumentException("Member ID must be positive.");
    }
    this.name = name;
    this.memberId = memberId;
    this.myLoan = new Vector();
  }

  public String getName() {
    return name;
  }

  public String getNewName() {
    return name;
  }

  public int getMemberId() {
    return memberId;
  }

}