import java.time.LocalDate;

public class Loan {

  private Date loanDate;

  private Date returnDate;

    public Book myBook;
    public Member myMember;

  public Date getLoanDate() {
  return null;
  }

  public Date getReturnDate() {
  return null;
  }
  // method for borrow book
  public static Loan borrowBook(Book book, Member member, int loanDurationDays) {
    if (!book.isAvailable()) {
        throw new IllegalStateException("Cannot borrow: Book is already checked out");
    }
    book.setAvailable(false); // Mark book as checked out
    return new Loan(book, member, LocalDate.now(), loanDurationDays);
}

    // method for return book
    public boolean returnBook() {
      if (isReturned) {
          return false; // Book was already returned
      }
      
      this.returnDate = LocalDate.now();
      this.isReturned = true;
      this.myBook.setAvailable(true); // Mark book as available again
      return true;
  }
}