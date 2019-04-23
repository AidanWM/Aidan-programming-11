public class Student {
    private String firstname;
    private String lastname;
    private int grade;
    private static int studentNum = 1;
    private int idNum;

    Student(){
        firstname ="";
        lastname ="";
        grade = 8;
        idNum = studentNum;
        studentNum++;
    }
    Student(String firstname, String lastname, int grade, int idNum){
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
        this.idNum = studentNum;
        studentNum++;
    }
    //getters and setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

}