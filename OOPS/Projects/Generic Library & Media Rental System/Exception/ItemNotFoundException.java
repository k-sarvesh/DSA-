package Exception;

public class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException(String id) {
        super("Item not found: " + id);
    }
    
}
