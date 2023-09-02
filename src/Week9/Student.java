package Week9;

public class Student {
    private String Name;
    private String ID;
    private String Email;

    public Student(String n, String id, String e){
        Name = n;
        ID = id;
        Email = e;
    }

    public void setName(String name){
        name = Name;
    }
    public void setID(String i){
        i = ID;
    }
    public void setEmail(String email){
        email = Email;
    }
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public String getEmail(){
        return Email;
    }
}

