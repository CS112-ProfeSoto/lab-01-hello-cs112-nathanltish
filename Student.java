/**
 * Class representing a Student for Part 3 of Lab 01
 * 
 *  @author Nathan Tshishimbi <W7404862@student.miracosta.edu>
 *  @version 1.0 (06/12/25)
 */
public class Student {
    
    /** INSTANCE VARIABLES **/
    String idNumber;
    String major;
    int year;
    double gpa;

    /** FULL CONSTRUCTOR **/
    public Student(String idNumber, String major, int year, double gpa) {
        this.setIdNumber(idNumber);
        this.setMajor(major);
        this.setYear(year);
        this.setGpa(gpa);
    }

    /** DEFAULT CONSTRUCTOR **/
    public Student() {
        this("W000000", "Undeclared", 1, 0.0);
    }

    /** COPY CONSTRUCTOR **/
    public Student(Student original) {
        if (original == null) {
            System.out.println("ERROR: Trying to copy a null object");
            System.exit(0);
        } else {
            this.setIdNumber(original.idNumber);
            this.setIdNumber(original.idNumber);
            this.setYear(original.year);
            this.setGpa(original.gpa);
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + idNumber +
           ", Major: " + major +
           ", Year: " + year +
           ", GPA: " + gpa;
}


    /** MUTATORS **/
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    /** ACCESSORS **/
    public String getIdNumber() {
        return idNumber;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean equals(Student other) {
        if (other == null) {
            return false;
        }

        return this.idNumber.equals(other.idNumber) && this.major.equals(other.major) && this.year == other.year && this.gpa == other.gpa;
    }
}
