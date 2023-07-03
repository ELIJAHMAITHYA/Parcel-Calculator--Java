import java.util.Scanner;

public class DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentinel = 1;

        while (sentinel != 0) {
            System.out.print("Enter the parcel weight (0 to exit): ");
            double weight = scanner.nextDouble();

            if (weight == 0) {
                sentinel = 0;
                break;
            }

            double deliveryCharge;
            if (weight < 3) {
                deliveryCharge = 8.00;
            } else if (weight <= 5) {
                deliveryCharge = 12.00;
            } else {
                double additionalWeight = weight - 5;
                double additionalCharge = additionalWeight * 1.50;
                deliveryCharge = 12.00 + additionalCharge;
            }

            System.out.println("Delivery charge: $" + deliveryCharge);
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
