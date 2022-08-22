// Switch Statements
// It's used to check equality of something against a number of values.
//For e.g. What day is today ?
// Mon,Tue,Wed,...,Sun

public class paper6 {
    public static void main(String[] args){

        String day = "Saturday";

        switch(day)
        {
            case "Sunday" : System.out.println("It's Sunday. Yippeee");
            break;
            case "Monday" : System.out.println("It's monday.");
            break;
            case "Tuesday" : System.out.println("It's tuesday");
            break;
            case "Wednesday" : System.out.println("It's tuesday.");
            break;
            case "Thursday" : System.out.println("It's Thursday :/");
            break;
            case "Friday" : System.out.println("It's FRIIIAAADAY");
            break;
            case "Saturday" : System.out.println("It's Saturday :)");
            break;

// break is important .
            // if there were no break then as soon as we find a matching case the comp. will print that and every statement after that too.
// If there is no match then comp. will do nothing. So , we use default.
            default : System.out.println("Day doesn't exist. :/");

        }







    }
}