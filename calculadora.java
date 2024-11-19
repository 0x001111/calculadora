import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        System.out.println("Introduce two numbers:");

        Scanner scanner = new Scanner(System.in);

       
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        
        int suma = number1 + number2;
        int resta = number1 - number2;
        double division = (double) number1 / number2;  
  
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La división es: " + division);
    }
}
