public class GradStudent extends Student {
    private int office;
    private String officeHours;
    

    public int getOffice () {
        return office;
    }
    public void setOffice (int newOffice) {
        office = newOffice;
    }

    public String getOfficeHours () {
        return officeHours;
    }
    public void SetOfficeHours (String newOfficeHours) {
        officeHours = newOfficeHours;
    }

    public GradStudent (String firstName, String lastName, double GPA, String ID, int office, String officeHours) {
        super(firstName,lastName,GPA,ID);
        this.office = office;
        this.officeHours = officeHours;
    }

    @Override public String toString () {
        return getLastName() + ", " + getFirstName() + "; GPA: " + getGPA() + "; ID: " + getID() + "; Office: " + getOffice() + "; Office Hours: " + getOfficeHours();
    }


}