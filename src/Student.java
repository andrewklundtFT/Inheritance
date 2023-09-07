public class Student implements Serializable 
{
    private String firstName;
    private String lastName;
    private double GPA;
    private String ID;

    // getters and setters for firstName, lastName, GPA, and ID
    public String getFirstName () {
        return firstName;
    }
    public void setFirstName (String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName () {
        return lastName;
    }
    public void setLastName (String newLastName) {
        lastName = newLastName;
    }

    public double getGPA () {
        return GPA;
    }
    public void setGPA (double newGPA) {
        GPA = newGPA;
    }
    
    public String getID () {
        return ID;
    }
    public void setID (String newID) {
        ID = newID;
    }

    public Student (String firstName, String lastName, double GPA, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.ID = ID;
    }

    public String toString() {
        return getLastName() + ", " + getFirstName() + "; GPA: " + getGPA() + "; ID: " + getID(); 
    }

    public String getSerialData() {
        return firstName + "," + lastName + "," + GPA;
    }
}
