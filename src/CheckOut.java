import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        boolean checkOut = false;
        double totalPrice = 0;

        while (!checkOut)
        {
            double totalCost = SafeInput.getRangedDouble(in, "enter price of item: ", .50, 10.00);
            totalPrice += totalCost;
            checkOut = SafeInput.getYNConfirm(in, "do you have anymore items?(Y/N): ");
        }
        System.out.printf("Your cart total is %.2f%n", totalPrice);

    }
}
