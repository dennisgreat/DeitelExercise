package chapterTwo;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius temperature");
        double Celsius;
        Celsius = input.nextDouble();
        double FahrenheitResult;
        FahrenheitResult = (9.0/5) * Celsius + 32;
        System.out.printf("The Fahrenheit value of %f is %n%f%n", Celsius, FahrenheitResult);

    }



}
