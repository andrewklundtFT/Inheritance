import java.util.ArrayList;
import java.util.List;

public class App {
     public static void main(String[] args) throws Exception {
        Student a = new Student("andrew", "klundt", 4.0, "2300");
        Student b = new Student("grayson", "smallwood", 2.0, "2301");
        GradStudent c = new GradStudent("abraham", "khan", 4.0,"2302", 1, "1");
        GradStudent d = new GradStudent("matthew", "maddox", 4.0,"2303", 2, "1");
        a.setFirstName("drewski");
        b.setGPA(1.6);
        List<Student> studentList = new ArrayList();
        studentList.add(a);
        studentList.add(b);
        studentList.add(c);
        studentList.add(d);
        for (Student k : studentList) {
            System.out.println(k);
        }
     }
}