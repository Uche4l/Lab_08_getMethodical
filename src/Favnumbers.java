import java.util.Scanner;
public class Favnumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favoriteInt = SafeInput.getInt(in,"Please enter an int: ");

        double  favoriteDouble = SafeInput.getInt(in,"Please enter an double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);


    }
}
