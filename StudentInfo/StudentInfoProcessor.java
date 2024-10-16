package StudentInfo;
import java.util.Scanner;
public class StudentInfoProcessor{
 public static void main(String[] args){
// Creating a scanner object
Scanner scanner = new Scanner(System.in);
// Prompt for First Name
System.out.print("Enter your first name: ");
String firstname = scanner.nextLine();
// Prompt for Last Name
System.out.print("Enter your last name: ");
String lastname = scanner.nextLine();
// Prompt for Age
System.out.print("Enter your age: ");
int age = scanner.nextInt();
// Prompt for GPA
System.out.print("Enter your GPA: ");
double gpa = scanner.nextDouble();
// Combination of First Name and Last Name to a string
String fullname = firstname + " " + lastname;
//Calculate the birth year(2024-age)
int birthYear = 2024-age;
//Converting the GPA to a percentage 
double percentage = (gpa/4.0) * 100;
System.out.println("Fullname: " + fullname);
System.out.println("Age: " + age + " , Birth Year: " + birthYear);
System.out.println("GPA: " + gpa + " , Percentage: " + percentage + "%");
scanner.close();
 }
    
}