/*Write a java program to display the system date and time in various formats shown below:
Current date is : 31/07/2015
Current date is : 07-31-2015
Current date is : Friday July 31 2015
Current date and time is : Fri July 31 16:25:56 IST 2015
Current date and time is : 31/07/15 16:25:56 PM +0530
Current time is : 16:25:56
Current week of year is : 31
Current week of month : 5
Current day of the year is : 212
Note: Use java.util.Date and java.text.SimpleDateFormat class */

import java.util.*;
import java.text.*;

public class DateFormat
 {
    public static void main(String[] args)
     {
        // Create Date object for current date and time
        Date date = new Date();

        // Create SimpleDateFormat objects for different formats
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");

        // Create Calendar object to get week/year info
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // Display the various formats
        System.out.println("Current date is : " + sdf1.format(date));
        System.out.println("Current date is : " + sdf2.format(date));
        System.out.println("Current date is : " + sdf3.format(date));
        System.out.println("Current date and time is : " + sdf4.format(date));
        System.out.println("Current date and time is : " + sdf5.format(date));
        System.out.println("Current time is : " + sdf6.format(date));
        System.out.println("Current week of year is : " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Current week of month : " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current day of the year is : " + cal.get(Calendar.DAY_OF_YEAR));
    }
}
