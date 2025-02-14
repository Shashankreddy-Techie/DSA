import java.util.Scanner;
class TemperatureConversion {
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enetr the temperature value:");
double temperature=scanner.nextDouble();
System.out.println("Enter the temperature scale (C for Celsius,F for Fahrenheit):");
String scale = scanner.next().toUpperCase();
double convertedTemperature;
if(scale.equals("C")) {
convertedTemperature =(temperature * 9 / 5 )+32;
System.out.println(temperature +"0C is equal to "+convertedTemperature+"0F.");
}
else if (scale.equals("F")) {
convertedTemperature =(temperature - 32) * 5/9 ;
System.out.println(temperature + "0F is equal to " + convertedTemperature+ "0C.");
}
else {
System.out.println("Invalid temperature scale.");
}
}
}
