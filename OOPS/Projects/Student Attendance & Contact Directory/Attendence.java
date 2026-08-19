import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Attendence extends Students{

    public Attendence(int id, String Name, String Email) {
        super(id, Name, Email);
    }
    Map<String , Students> studentMap = new HashMap<>();
    Set<String> preventStudentIds = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    
    


}
 