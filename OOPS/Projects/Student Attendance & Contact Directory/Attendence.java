import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Attendence extends Students{

    public Attendence(int id, String Name, String Email) {
        super(id, Name, Email);
    }
    Map<LocalDate , Set<Students>> studentMap = new HashMap<>();
    Set<Students> registeredStudents = new HashSet<>();
    Set<Students> preventStudentIds = new HashSet<>();

    public int presentToday(){
        int presentStudents = preventStudentIds.size();
        return presentStudents;
    }
    public void registerStudent(Students student){
        registeredStudents.add(student);
    }

    public boolean markAttendance(int studentId){
        for (Students student : registeredStudents) {
            if (student.getId() == studentId) {
                LocalDate today = LocalDate.now();
                if (!studentMap.containsKey(today)) {
                    studentMap.put(today, new HashSet<>());
                }
                if (!studentMap.get(today).add(student)) {
                    return false;
                }
                preventStudentIds.add(student);
                return true;
            }
        }
        return false;
    }

    public boolean hasStudent(int studentId){
        for (Students student : registeredStudents) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public boolean isPresent(int studentId){
        for (Students student : preventStudentIds) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public Set<Students> getRegisteredStudents(){
        return registeredStudents;
    }

    public Set<Students> getPresentStudents(){
        return preventStudentIds;
    }

}
 