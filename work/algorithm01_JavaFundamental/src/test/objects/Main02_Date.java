package test.objects;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main02_Date {
    public static void main(String[] args) {

        //1.java.util.Date
        Date d = new Date();
        System.out.println(d);

        //2.java.sql.Date(주의:동일클래스명을 사용시 동시 import불가능,절대경로명시)
        java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(d2);

        //3.원하는 포멧(Mon Mar 17 14:15:41 KST 2025 >> yyyy-MM-dd HH:mm:ss:SSS)변경하기.
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(sdf.format(d));

        //4.java.sql.Timestamp
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);
        System.out.println();

        //5.특정 일자 및 시간 설정(주의:월표기는 0월부터11월까지 설정-12로설정하면 해가넘어가서 0월이됨)
        GregorianCalendar gc = new GregorianCalendar(2025,12,27,17,50,10);
        System.out.println(gc);
        System.out.println("gc.get(Calendar.YEAR) : "+gc.get(Calendar.YEAR));
        System.out.println("gc.get(Calendar.MONTH) : "+gc.get(Calendar.MONTH));
        System.out.println("gc.get(Calendar.DAY_OF_MONTH) : "+gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("gc.get(Calendar.HOUR_OF_DAY) : "+gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("gc.get(Calendar.MINUTE) : "+gc.get(Calendar.MINUTE));
        System.out.println("gc.get(Calendar.SECOND) : "+gc.get(Calendar.SECOND));
        System.out.println("gc.get(Calendar.MILLISECOND) : "+gc.get(Calendar.MILLISECOND));
        System.out.println();

        gc = new GregorianCalendar();//시스템날짜
        System.out.println(gc);
        System.out.println("gc.get(Calendar.YEAR) : "+gc.get(Calendar.YEAR));
        System.out.println("gc.get(Calendar.MONTH) : "+gc.get(Calendar.MONTH));
        System.out.println("gc.get(Calendar.DAY_OF_MONTH) : "+gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("gc.get(Calendar.HOUR_OF_DAY) : "+gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("gc.get(Calendar.MINUTE) : "+gc.get(Calendar.MINUTE));
        System.out.println("gc.get(Calendar.SECOND) : "+gc.get(Calendar.SECOND));
        System.out.println("gc.get(Calendar.MILLISECOND) : "+gc.get(Calendar.MILLISECOND));


    }//end main
}//end class
