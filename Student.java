public class Student{
    private String FirstName;
    private String LastName;
    private double Grade;


    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public void setGrade(double Grade){
        this.Grade = Grade;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public double getGrade(){
        return Grade;
    }

    public void promoteStudent (){
        if (Grade > 3.5){
            System.out.println("Promote to the next class");
            
        }
    }


}