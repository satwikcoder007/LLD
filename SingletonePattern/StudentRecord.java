package SingletonePattern;
import java.util.*;

public class StudentRecord{
    ArrayList<Student> data;
    private StudentRecord(){
        data = new ArrayList<Student>();
    }
    private static StudentRecord instance = null;
    static StudentRecord getInstance(){
        if(instance==null) instance = new StudentRecord();
        return instance;
    }
    void addStudent(Student ob){
        synchronized (instance){
            data.add(ob);
            System.out.println("New student added");
        }
    }
    void removeStudent(int no){
        synchronized (instance){
            for(int i=0;i<data.size();i++){
                Student s = data.get(i);
                if(s.reNo==no){
                    data.remove(s);
                    System.out.println("Student removed");
                    return;
                }
            }
            System.out.println("No stuent found with the given credentials");
        }
    }
}