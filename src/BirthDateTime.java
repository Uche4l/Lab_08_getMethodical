import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean leapYear = false;

        int birthYear = SafeInput.getRangedInt(in,"Please enter a year between 1950 and 2015: ",1950,2015);
        if (birthYear % 4 == 0) //checks if birth year is a leap year
            leapYear = true;

        int birthMonth = SafeInput.getRangedInt(in,"Please enter a month between 1 and 12: ",1,12);
        int birthDay = 0;
        switch (birthMonth) {

            case 1:  // January

            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                birthDay = SafeInput.getRangedInt(in,"Please enter a day between 1 and 31: ",1,31);

                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                birthDay = SafeInput.getRangedInt(in,"Please enter a day between 1 and 31: ",1,30);
                break;
            case 2:  // February

                if (leapYear){
                    birthDay = SafeInput.getRangedInt(in,"Please enter a day between 1 and 29: ",1,29);
                }
                else{
                    birthDay = SafeInput.getRangedInt(in,"Please enter a day between 1 and 28: ",1,28);
                }

                break;

        }




        int birthHour = SafeInput.getRangedInt(in,"Please enter a hour between 1 and 24: ",1,24);
        int birthMinute = SafeInput.getRangedInt(in,"Please enter a minute between 1 and 59: ",1,59);

        if (birthMinute > 9) { //adds a "0" in front of a single character int
            System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
        }else{
            System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":0" + birthMinute);
        }

    }
}
