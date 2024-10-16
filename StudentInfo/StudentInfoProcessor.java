package StudentInfo;
import java.util.Scanner;
public class StudentInfoProcessor{
 public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your first name: ");
String firstname = scanner.nextLine();
System.out.print("Enter your last name: ");
String lastname = scanner.nextLine();
System.out.print("Enter your age: ");
int age = scanner.nextInt();
System.out.print("Enter your GPA: ");
double gpa = scanner.nextDouble();
String fullname = firstname + " " + lastname;
int birthYear = 2024-age;
double percentage = (gpa/4.0) * 100;
System.out.println("Fullname: " + fullname);
System.out.println("Age: " + age + " , Birth Year: " + birthYear);
System.out.println("GPA: " + gpa + " , Percentage: " + percentage + "%");
scanner.close();
 }
    
}