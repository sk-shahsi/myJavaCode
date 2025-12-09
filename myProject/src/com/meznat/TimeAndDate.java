package com.meznat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeAndDate {
    public static void main(String[] args) throws Exception  {
        Calendar cal = Calendar.getInstance();
        System.out.println("Enter Date (dd-MM-yyyy)");
        Scanner scanner = new Scanner(System.in);
        String tempdate = scanner.nextLine();
        Date date= new SimpleDateFormat("dd-MM-yyyy").parse(tempdate);
        cal.setTime(date);

        if(isValid(tempdate)) {
            System.out.println("Week Of Year " + cal.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Day Of Month "+cal.get(Calendar.DAY_OF_MONTH));
            System.out.println("Week Of Month " + cal.get(Calendar.WEEK_OF_MONTH));
        }
        else
        {
            System.out.println("Invalid date");
        }



    }

    public static boolean isValid(String strDate) throws ParseException
    {
        if (strDate.trim().equals(""))
        {
            System.out.println("1");
            return true;
        }
        else
        {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
            try {
                sdfrmt.setLenient(false);
                Date javaDate = sdfrmt.parse(strDate);
                return true;
            }catch(Exception e)
            {
                return false;
            }
        }

    }

}
