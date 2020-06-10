import java.util.Scanner;
public class StudentTest{
    
    public static void main(String... args){

        Student obj = new Student();

        System.out.println("Enter First Name: ");
        Scanner input = new Scanner(System.in);
        String FirstName = input.next();
        

        System.out.println("Enter Last Name: ");
        String LastName = input.next();

        System.out.println("Enter Grade");
        double Grade = input.nextDouble();
        System.close();

        obj.setFirstName(FirstName);
        obj.setLastName(LastName);
        obj.setGrade(Grade);

        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        System.out.println(obj.getGrade());
        

    }
}