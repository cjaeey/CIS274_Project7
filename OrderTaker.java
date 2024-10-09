// Carlos John Escala
// September 11, 2024
// Lab 7, Calculating a bill for sandwiches
// This project determines a sandwich bill

import java.util.Scanner;

public class OrderTaker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Sandwiches do you want? ");
        int count = scanner.nextInt();
        System.out.print("Enter the type of sandwich (H, C, R, T, V): ");
        char sandwichType = scanner.next().toUpperCase().charAt(0);
        String sandoName = "";
        double Price = 0.0;

        switch (sandwichType)
        {
            case 'H':
                sandoName = "ham";
                Price = 8.50;
                break;
            case 'C':
                sandoName = "chicken";
                Price = 8.00;
                break;
            case 'R':
                sandoName = "roast beef";
                Price = 10.00;
                break;
            case 'T':
                sandoName = "tuna";
                Price = 9.00;
                break;
            case 'V':
                sandoName = "vegetarian";
                Price = 8.50;
                break;
            default:
                System.out.println("Invalid sandwich type.");
                return;
        }

        double totalCost = count * Price;
        System.out.println("You bought " + count + " " + sandoName + " for " + "$" + totalCost);
    }
}
