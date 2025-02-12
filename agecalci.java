import java.util.Calendar;
import java.util.Scanner;
class AgeCalculator {
public static void main(String[]args) {
int currentYear = Calendar.getInstance().get(Calendar.YEAR);
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your birth year: ");
int birthYear = scanner.nextInt();
int age = currentYear-birthYear;
System.out.println("Your age is: "+ age + "years");
}
}