package conversion_centigrados_farengeith;

import java.util.Scanner;

/**
 *
 * @author JUAN CARLOS
 */
public class Conversion_Centigrados_farengeith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double gradosCelsius = scanner.nextDouble();

        double gradosFahrenheit = (gradosCelsius * 9 / 5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + gradosFahrenheit);

        scanner.close();
    }

}
