package Exception;

public class ItemAlreadyBorrowedException extends LibraryException {
    public ItemAlreadyBorrowedException(String title) {
        super("Item already borrowed: " + title);
    }
    
}
