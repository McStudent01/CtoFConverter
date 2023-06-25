import java.util.Scanner;

public class CtoFConverter
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Celsius temperature: ");
        float celsius = scanner.nextFloat();

        do {
            if (celsius < -273.15f || celsius > 100f)
            {
                System.out.println("The temperature cannot be below -273.15 and 100 degrees Celsius.");
            }
            else
            {
                break;
            }

            System.out.print("Enter the Celsius temperature again: ");
            celsius = scanner.nextFloat();
        }
        while (true);

        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.", celsius, fahrenheit);
    }
}