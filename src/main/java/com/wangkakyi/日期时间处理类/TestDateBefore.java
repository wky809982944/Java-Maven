package com.wangkakyi.日期时间处理类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class TestDateBefore {
    public static void main(String args[]) {
       /* Date today=new Date();
        System.out.println(today);
        long current =System.currentTimeMillis();
        System.out.println(current);
        Date date2=new Date(current-30000000000L);
        System.out.println(date2);*//**//*
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(calendar.get(Calendar.YEAR)).append("年");
        stringBuffer.append(calendar.get(Calendar.MONTH)).append("月");
        stringBuffer.append(calendar.get(Calendar.DAY_OF_MONTH)).append("日");
        stringBuffer.append(calendar.get(Calendar.HOUR_OF_DAY)).append("时");
        stringBuffer.append(calendar.get(Calendar.MINUTE)).append("分");
        stringBuffer.append(calendar.get(Calendar.SECOND)).append("秒");
        System.out.println(stringBuffer);
        String pattern="yyyy年MM月dd日 HH:mm:ss.SSS";
        SimpleDateFormat sdf =new SimpleDateFormat(pattern);
        String string = sdf.format(new Date());
        System.out.println("当前时间被格式化为"+string);
        String srcDate="2017-08-15";
        String pattern2="yyyy-MM-dd";
        SimpleDateFormat sdf2=new SimpleDateFormat(pattern2);
        try {
            Date destDate =sdf2.parse(srcDate);
            System.out.println(destDate);
            System.out.println("2017-08-15与1970-01-01相距："+destDate.getTime()+"毫秒");
            Calendar calendar2=Calendar.getInstance();
            calendar2.setTime(destDate);
            System.out.println(calendar2.get(Calendar.YEAR));


        } catch (ParseException e) {
            e.printStackTrace();
        }
*//*
        LocalDate today=LocalDate.now();
        System.out.println("今天是："+today);
        LocalTime current=LocalTime.now();
        System.out.println("当前时刻:"+current);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("当前日期时刻"+localDateTime);
        int year=localDateTime.getYear();
        int month=localDateTime.getMonthValue();
        int day=localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek=localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(year+"年"+month+"月"+day+"日");
        */
        LocalDate birthday=LocalDate.of(1987,8 ,8 );
        LocalTime newTime =LocalTime.of(23,23,45 );
        LocalDate newDate=LocalDate.parse("2001-01-09");
        System.out.println(birthday);
        System.out.println(newTime);
        System.out.println(newDate);
System.out.println(LocalDate.now().format((DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL))));
System.out.println(birthday.format((DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))));
String pattern="MM-dd-yyyy";
System.out.println(birthday.format(DateTimeFormatter.ofPattern(pattern)));
LocalDate  tomBirthday=LocalDate.of(1978,8 ,20);
LocalDate  jackBirthday=LocalDate.of(1978,8 ,20 );
System.out.println(tomBirthday.equals(jackBirthday));
/*LocalDate otherDay =LocalDate.now().plusDays(25);*/
LocalDate otherDay =LocalDate.now().plusWeeks(3);
System.out.println(otherDay);






    }
}
