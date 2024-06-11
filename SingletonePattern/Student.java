package SingletonePattern;

public class Student{
    String name;
    int reNo;
    String Course;
    Student(String s,int n,String c){
        this.name = s;
        this.Course = c;
        this.reNo = n;
    }
}

//Single tone pattern ensures that a class should have only one instance and should have a single
//and global point of access to it

//The class is made responsible for keeping track of the instance

//The downside of this pattern is its issue with thread safety.


//Lazy initialisation: i.e. we do not create an instance until asked this is better than global variable