package test.com;

import java.util.Random;

public class Main03_Math {
    public static void main(String[] args) {
        //1. 절대값
        System.out.println(Math.abs(-1.0));
        System.out.println(Math.abs(-1.0f));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-10L));
        System.out.println();

        //2. 원주율
        System.out.println(Math.PI);
        System.out.println();

        //3. 버림
        System.out.println(Math.floor(Math.PI));

        //4. 올림
        System.out.println(Math.ceil(Math.PI));

        //5. 반올림
        System.out.println(Math.round(Math.PI));

        //6. 제곱
        System.out.println(Math.pow(10,2));

        //7. 제곱근
        System.out.println(Math.sqrt(100));

        //8. 랜덤한 난수(0.0 ~ 1.0 사이의 실수)
        System.out.println(Math.random());


        //참고 : Random 객체
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(3)); // 0-2
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble()); //난수

        //9. 최대, 최소
        System.out.println(Math.max(11,22));
        System.out.println(Math.max(11.11,22.22));
        System.out.println(Math.min(11,22));
        System.out.println(Math.min(11.11,22.22));






    }//end main
}//end class
