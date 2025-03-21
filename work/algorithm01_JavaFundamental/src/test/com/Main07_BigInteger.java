package test.com;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Main07_BigInteger {
    public static void main(String[] args) {

        //큰 정수 또는 큰 실수들의 연산

        //1. 큰정수

        //Integer 또는 Long에 할당할 수 있는 값을 벗어날 경우에 대한 처리객체가 필요하다.
        System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        long i1 = Integer.MAX_VALUE + 1;
        System.out.println(i1); //4byte 범위를 벗어날 수 없다.

        long l1 = 9223372036854775807L;
        System.out.println(l1 + 1); //8byte 범위를 벗어날 수 없다.
        System.out.println();

        BigInteger bi1 = new BigInteger("2147483647");
        BigInteger bi2 = new BigInteger("1000");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        System.out.println(bi1.remainder(bi2));

        bi1 = new BigInteger("9223372036854775807");
        bi2 = new BigInteger("1000");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        System.out.println(bi1.remainder(bi2));
        System.out.println(bi1.compareTo(bi2)); //값 비교 같으면 0
        System.out.println();

        //2. 큰 실수
        BigDecimal bd1 = new BigDecimal("2147483647.123456789");
        BigDecimal bd2 = new BigDecimal("10000");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
        System.out.println(bd1.remainder(bd2));
        System.out.println(bd1.compareTo(bd2)); //값 비교 같으면 0

    }//end main
}//end class


