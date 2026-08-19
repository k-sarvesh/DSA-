package Exception;

public class MaxBorrowLimitReachedException extends LibraryException {
    public MaxBorrowLimitReachedException(String userId ,int limit) {
        super("Max borrow limit reached for user: " + userId + " (limit: " + limit + ")");
    }
    
}
