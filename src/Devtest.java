import java.util.Scanner;

public class Devtest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = getRegExString(in, "enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("your SSN is: " + SSN);

/*
String name = getNonZeroLenString(in,"Enter your name: " );
        System.out.println("name is " + name);

        int age = getInt(in, "enter your age");
        System.out.print("you said your age is " + age);


        double salary = getdouble(in, "Enter salary");
        System.out.println("your salary is " + salary);

        int favNum = getRangedInt(in, "enter your fav num", 1,10);
        System.out.println("Your fav num is " + favNum);

        double income = getRangedDouble(in, "enter your income", 5000, 100000);
        System.out.println("you said the income is " + income);


        boolean leaveClass = getYNConfirm(in, "are you ready to leave class?");
        System.out.println(leaveClass);

 */
    }

    /**
     * Get a string value from the user which must be atleast one character
     *
     * @param pipe   scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return String that is atleast one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty()) {
                System.out.println("you must enter atleast one character");
            }
        } while (retVal.isEmpty());
        return retVal;
    }

    /**
     * Gets an unconstrained int value from the user
     *
     * @param pipe   scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNext()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("you must enter a valid integar not " + trash);
            }

        } while (!done);
        return retVal;
    }

    /**
     * Gets an unconstrained double value from the user
     *
     * @param pipe   scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained double value
     */
    public static double getdouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;


        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNext()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("you must enter a valid double not " + trash);
            }

        } while (!done);
        return retVal;
    }

    /**
     * Gets an int value from the user within the specified inclusive range
     *
     * @param pipe   scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return a int value within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        {
            int retVal = 0;
            String trash = "";
            boolean done = false;


            do {
                System.out.print(prompt + ": ");
                if (pipe.hasNext()) {
                    retVal = pipe.nextInt();
                    pipe.nextLine();
                    if (retVal >= low && retVal <= high) {
                        done = true;
                    } else {
                        System.out.println("you must enter a valid int in range [" + low + " - " + high + "]: ");
                    }
                } else {
                    trash = pipe.nextLine();
                    System.out.println("you must enter a valid integar not " + trash);
                }

            } while (!done);
            return retVal;
        }
    }

    /**
     * Gets a double value from the user within the specified inclusive range
     *
     * @param pipe   scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return a double value within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        {
            double retVal = 0;
            String trash = "";
            boolean done = false;


            do {
                System.out.print(prompt + ": ");
                if (pipe.hasNext()) {
                    retVal = pipe.nextDouble();
                    pipe.nextLine();
                    if (retVal >= low && retVal <= high) {
                        done = true;
                    } else {
                        System.out.println("you must enter a valid double in range [" + low + " - " + high + "]: ");
                    }
                } else {
                    trash = pipe.nextLine();
                    System.out.println("you must enter a valid double not " + trash);
                }

            } while (!done);
            return retVal;
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input = "";
        boolean retVal = false; // Use primitive boolean here instead of Boolean
        boolean done = false;

        do {
            System.out.print(prompt + "[YyNn]: ");
            input = pipe.nextLine();

            if (input.isEmpty()) {
                System.out.println("You must enter Y or N!");
            } else if (input.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (input.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter Y or N!");
            }
        } while (!done);

        return retVal;
    }

    /**
     * Gets a string val from the user of [YyNn]
     *
     * @param pipe scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return true for yes
     */


    /**
     * Gets a string val from that matches a regular expression
     *
     * @param pipe scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @param regEx String - regualar expression patetrn to match
     * @return true for ye
     *
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + regEx + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
               done = true;
            }
            else
            {
                System.out.println("You must enter a value that matches pattern " + regEx + "not" + retVal);
            }
        } while (!done);
        return retVal;
    }
}
