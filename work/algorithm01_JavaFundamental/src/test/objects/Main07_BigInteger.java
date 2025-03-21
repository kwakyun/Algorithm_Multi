package test.objects;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main07_BigInteger {
    public static void main(String[] args) {

        //큰정수 또는 큰실수 들의 연산

        //1.큰정수
        //Integer 또는 Long 에 할당할수있는 값을 벗어날경우에대한 처리객체가 필요하다.
        System.out.println(Integer.MIN_VALUE +" ~ "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE +" ~ "+Long.MAX_VALUE);

        int i1 = Integer.MAX_VALUE + 1;
        System.out.println(i1); // 4byte 범위를 벗어날 수 없다

        long l1 = 9223372036854775807L;
        System.out.println(l1+1); // 8byte 범위를 벗어날 수 없다
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
        System.out.println(bi1.compareTo(bi2));//값비교 같으면 0
        System.out.println();


        //2.큰실수
        BigDecimal bd1 = new BigDecimal("2147483647.123456789");
        BigDecimal bd2 = new BigDecimal("10000");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
        System.out.println(bd1.remainder(bd2));
        System.out.println(bd1.compareTo(bd2));//값비교 같으면 0

    }//end main
}//end class
