package studentlist;

/**
 * This class represents a Student
 *
 * @author Paul Bonenfant May 28
 */
public class Student {

    private String name;
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

