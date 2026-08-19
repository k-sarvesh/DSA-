

public class Students {
    int id ;
    String Name ;
    String Email;

    public Students(int id , String Name, String Email){
        this.id = id;
        this.Name = Name;
        this.Email = Email;
    }
    void setName(String Name){
        this.Name = Name;
    }
    void setEmail(String Email){
        this.Email = Email;
    }
    void setId(int id){
        this.id = id;
    }
    String getName(){
        return this.Name;
    }
    String getEmail(){
        return this.Email;
    }
    int getId(){
        return this.id;
    }
    @Override
    
    public String toString(){
        return "Student ID : " + this.id + "\nStudent Name : " + this.Name + "\nStudent Email : " + this.Email;
    }

}
