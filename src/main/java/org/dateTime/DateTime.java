package org.dateTime;
import java.time.*;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("today's date is :-"+date);
        LocalTime time = LocalTime.now();
        System.out.println("current time is :-"+time);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yy);
        LocalDateTime localDateTime = LocalDateTime.of(2011, Month.JANUARY,11,4,30);
        System.out.println("local date time is :-"+localDateTime);
        System.out.println("after six months :-"+localDateTime.plusMonths(6));
        System.out.println("before six months :-"+localDateTime.minusMonths(6));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt() ;
        System.out.println("enter month");
        String month = sc.next().toUpperCase() ;
        System.out.println("enter day");
        int dayOfMonth = sc.nextInt() ;
        LocalDate birthday = LocalDate.of(year, Month.valueOf(month),dayOfMonth);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday,today);
        System.out.printf("age is %d years %d months and %d days old",p.getYears(),p.getMonths(),p.getDays());
//        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println("/n our system zone is :"+zoneId);

    }
}
