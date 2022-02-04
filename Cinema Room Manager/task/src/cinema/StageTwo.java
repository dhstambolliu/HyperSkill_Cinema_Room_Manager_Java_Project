package cinema;

import java.util.Scanner;

public class StageTwo {

    private static final Scanner scanner = new Scanner(System.in);

    public void sold() {
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeatsInEachRow = scanner.nextInt();
        scanner.nextLine();

        int totalIncome = ((numberOfRows * numberOfSeatsInEachRow) <= 60) ? (numberOfRows * numberOfSeatsInEachRow * 10) : (((numberOfRows / 2) * numberOfSeatsInEachRow * 10) + ((numberOfRows - (numberOfRows / 2)) * numberOfSeatsInEachRow * 8));
        System.out.println("Total income:\n$" + totalIncome);
    }
}
