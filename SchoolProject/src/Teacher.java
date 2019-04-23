public class Teacher {
    private String firstname;
    private String lastname;
    private String subject;

    Teacher(){
        firstname ="";
        lastname ="";
        subject = "english";
    }
    Teacher(String firstname, String lastname, String subject){
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
