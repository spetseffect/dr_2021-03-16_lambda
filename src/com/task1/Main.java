package com.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main{
    public static void main(String[] args) throws ParseException {
        Predicate<Integer> year=(y)->y%4==0;
        System.out.println("Вискосный год 2020: "+year.test(2020));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dd1="09.01.1985",dd2="17.03.2021";
        Date date1 = dateFormat.parse(dd1);
        Date date2 = dateFormat.parse(dd2);
        IDateDiffDays ddd=(d1, d2)->{
            long ms=d2.getTime()-d1.getTime();
            return (int)(ms/1000/60/60/24);
        };
        System.out.println("Количество дней между датами '"+dd1+"' и '"+dd2+"' = "+ddd.apply(date1,date2));

        IDateDiffWeeks ddw=(d1, d2)->{
            long ms=d2.getTime()-d1.getTime();
            return (int)(ms/1000/60/60/24/7);
        };
        System.out.println("Количество полных недель между датами '"+dd1+"' и '"+dd2+"' = "+ddw.apply(date1,date2));

        LocalDate date = LocalDate.now();
        Supplier<String> wd=()->{
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            return dayOfWeek.toString();
        };
        System.out.println("День недели сегодня: "+wd.get());
    }
}
