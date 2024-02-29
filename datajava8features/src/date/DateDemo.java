package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
//        Scanner s=new Scanner(System.in);
//        String dob=s.next();

//        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//        Date date=sdf.parse("14-03-2021 11:15:45");
//        System.out.println(date);
//        System.out.println(new java.sql.Date(date.getTime()));
//        SimpleDateFormat sdf1=new SimpleDateFormat("dd MMM yyyy");
//        String s=sdf1.format(date);
//        System.out.println(s);
        //14 mar 2021
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(LocalDate.of(2020, Month.DECEMBER,23));












    }
}
