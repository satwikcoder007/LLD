package SingletonePattern;

public class Main{
    public static void main(String[] args) {
        StudentRecord ob  = StudentRecord.getInstance();
        ob.addStudent(new Student("Satwik",123,"CS"));
        ob.addStudent(new Student("Biswas",321,"IT"));
        ob.removeStudent(321);
    }
}