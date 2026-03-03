import java.util.ArrayList;
import java.util.List;
        
class student {
    private String id;
    private String name;
    private double gpa;
    
    public student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    public String getID() {
        return id;
}
    public void setID(String id) {
        this.id = id;
    }
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}
public double getgpa() {
    return gpa;
}
public void setgpa(double gpa) {
    this.gpa = gpa;
}


@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}


class StudentManager<T> {
      private List<T> data;

public StudentManager() {
    data = new ArrayList<>();
}
public void add(T item) {
    data.add(item);
}
public List<T>getAll() {
    return data;
}
}

public class main {
    public static void main(String[] args) {
        StudentManager<student> manager = new StudentManager<>();
        manager.add(new student("SV01", "Do Dang Viet Hoang", 3.6));
        manager.add(new student("SV02", "Nguyen Duc Khanh", 1.8));
        manager.add(new student("SV03", "Tran Nguyen Lam Huy", 1.0));
        
        for (student s : manager.getAll()) {
            System.out.print(s);
        }
    }
}