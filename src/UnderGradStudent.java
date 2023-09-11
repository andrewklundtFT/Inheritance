public class UnderGradStudent extends Student {
    public UnderGradStudent (String firstName, String lastName, double GPA, String ID) {
        super(firstName,lastName,GPA,ID);
    }
    public String getDegree() {
        return "2 or 4 year degree";
    }
}