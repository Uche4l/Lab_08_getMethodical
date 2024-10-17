import java.util.Scanner;

public class SafeInput
{
    /**
     * Get a string value from the user which must be atleast one character
     *
     * @param pipe scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return String that is atleast one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty())
            {
                System.out.println("you must enter atleast one character");
            }
        }while (retVal.isEmpty());
        return retVal;
    }

    
}
