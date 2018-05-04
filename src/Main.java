import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number for Prime Factorisation");

        Scanner input = new Scanner(System.in);
        input.hasNext();
        String line = input.nextLine();

        PrimeNumbers primeNumbers = new PrimeNumbers();

        boolean Validate = primeNumbers.validateDataType(line);

        if(Validate){
            System.out.print("working");
            System.exit(0);
        }
        else {
            System.out.print("Invalid input");
            System.exit(0);
        }

    }
}
