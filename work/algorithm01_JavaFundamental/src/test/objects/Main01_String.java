package test.objects;

import java.util.Arrays;

public class Main01_String {
    public static void main(String[] args) {
        //미션- 현재여러분들이 알고있는 문자열과 관련된 객체와 함수를 모두 적어보세요.
        String temp = "java:jsp:spring";
        System.out.println(temp);

        //1.문자열의 길이
        System.out.println("temp.length():"+temp.length());
        System.out.println();

        //2.문자열에서 특정문자열의 시작위치
        System.out.println("temp.indexOf(\"java\"):"+temp.indexOf("java"));
        System.out.println("temp.indexOf(\"j\"):"+temp.indexOf("j"));
        System.out.println();

        //3.문자열에서 특정문자열의 끝위치
        System.out.println("temp.lastIndexOf(\"j\"):"+temp.lastIndexOf("j"));
        System.out.println();

        //4.문자열에서 특정문자(char)을 인덱스로 뽑기
        System.out.println("temp.charAt(0) : "+temp.charAt(0));
        System.out.println("temp.charAt(1) : "+temp.charAt(1));
        System.out.println("temp.charAt(temp.length()-1) : "+temp.charAt(temp.length()-1));
        System.out.println();

        //5.문자열을 char[]로 변환하기
//        char[] cs = new char[temp.length()];
//        for (int i = 0; i < cs.length; i++) {
//            cs[i] = temp.charAt(i);
//        }
//        System.out.println(new String(cs));//cs -> String >> java:jsp:spring
        char[] cs = temp.toCharArray();
        System.out.println(cs);//바로출력가능.>> java:jsp:spring
        System.out.println(Arrays.toString(cs));//Arrays 로 출력가능.[j, a, v, a, :, j, s, p, :, s, p, r, i, n, g]

        //6.문자열 뽑기(자르기,추출)
        System.out.println(temp.substring(5));//5번인덱스부터 끝까지 >> jsp:spring
        System.out.println(temp.substring(temp.lastIndexOf("j")));//마지막j부터 끝까지 >> jsp:spring
        System.out.println(temp.substring(temp.lastIndexOf(":")));//마지막콜론부터 끝까지 >> :spring
        System.out.println(temp.substring(temp.lastIndexOf(":")+1));//마지막콜론 다음부터 끝까지 >> spring
        System.out.println(temp.substring(5,7+1));//5부터 원하는 인덱스+1 : jsp
        System.out.println(temp.substring(temp.indexOf(":")+1,temp.lastIndexOf(":")));//:첫번째인덱스부터 :마지막인덱스전까지 : jsp
        System.out.println();

        temp = "java11:jsp22:spring33:javascript44:CSS55:HTML66:한글";
        System.out.println(temp);
        //indexOf와 lastIndexOf만으로는 한계가있다.
        System.out.println(temp.substring(temp.indexOf(":")+1,temp.lastIndexOf(":")));//:첫번째인덱스부터 :마지막인덱스전까지 : jsp

        //7.구분자(패턴)를 이용해서 문자열은 분리해서배열로 반환
        String[] arr = temp.split(":");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);//jsp

        //8.문자열 변경후 반환(원본이 바뀌지않는다)
        System.out.println(temp.replace("java","Hello"));
        System.out.println(temp.replaceAll(":","-"));
        System.out.println(temp.replaceAll("[0-9]","X"));
        System.out.println(temp.replaceAll("[a-z]","Y"));
        System.out.println(temp.replaceAll("[A-Z]","Z"));
        System.out.println(temp.replaceAll("[a-zA-Z]","?"));
        System.out.println(temp.replaceAll("[가-힣]","*"));
        System.out.println();

        //9.문자열 비교
        temp = "yangSSEM";
        System.out.println(temp.equals("Yangssem"));//대소문자 구분
        System.out.println(temp.equalsIgnoreCase("Yangssem"));//대소문자 구분안함
        System.out.println(temp.contains("yangssem"));//포함하면 참.
        System.out.println(temp.contains("yang"));//포함하면 참.
        System.out.println(temp.compareTo("yangssem"));//대소문자 구분 같으면 0
        System.out.println(temp.compareToIgnoreCase("Yangssem"));//대소문자 구분안함 같으면 0
        System.out.println(temp.startsWith("yang"));//대소문자 구분, 시작하는 문자열이 같으면 참
        System.out.println(temp.endsWith("em"));//대소문자 구분, 끝나는 문자열이 같으면 참
        System.out.println();

        //10.문자열을 바이트배열로 반환
        byte[] bs = temp.getBytes();
        System.out.println(Arrays.toString(bs));

        //11.대문자,소문자를 서로 바꾸기
        System.out.println(temp.toUpperCase());
        System.out.println(temp.toLowerCase());

        //12.문자열 단순병합(연산횟수가 적은 문자열)
        String str1 = "aaa";
        String str2 = "bbb";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));
        System.out.println();

        //13.문자열 대용량으로병합(연산횟수가 많은 문자열)- 엄청난 연산속도
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        System.out.println(sb.toString());
        //단순병합 속도와 대용량병합 속도 비교 테스트
        //test1();//단순병합
        test2();//대용량병합
        System.out.println();

        //14.문자열의 시작공백과 끝공백 제거
        temp = "   ja va   ";
        System.out.println("temp.length() : "+temp.length());
        System.out.println("temp.trim().length() : "+temp.trim().length());
        System.out.println();


        //15.문자열 뒤집기
        temp = "yangssem";
        //System.out.println(temp.charAt(temp.length()-1-0));//7
        //System.out.println(temp.charAt(temp.length()-1-1));//6
        String answer = "";
        for (int i = temp.length()-1; i >= 0; i--) {
            answer += temp.charAt(i);
        }
        System.out.println(answer);

        char[] cs2 = temp.toCharArray();
        answer = "";
        for (int i = cs2.length-1; i >= 0; i--) {
            answer += cs2[i];
        }
        System.out.println(answer);

        answer = new StringBuilder(new String(cs2)).reverse().toString();
        System.out.println(answer);
        answer = new StringBuilder(temp).reverse().toString();//가장 편리하다.
        System.out.println(answer);

        //16.문자열 반복하기(jdk11: repeat(n))
        String str = "java";
        System.out.println(str.repeat(5));

        //17.공백제거2 - jdk11, strip()
        temp = "   ja va   ";
        System.out.println("temp.length() : "+temp.length());
        System.out.println("temp.strip().length() : "+temp.strip().length());//좌우공백제거
        System.out.println("temp.stripLeading().length() : "+temp.stripLeading().length());//시작공백제거
        System.out.println("temp.stripTrailing().length() : "+temp.stripTrailing().length());//끝공백제거
        System.out.println();

        //18.문자열이 비어있거나 공백만 포함하는지 검증 - isBlank()
        System.out.println(temp.isBlank());
        System.out.println(temp.isEmpty());//"",빈분자인지 검증
        temp = "        ";
        System.out.println(temp.isBlank()); //trim or strip + length==0
        System.out.println(temp.isEmpty());
        
        //19.String.join(구분자,배열) - 배열에 구분자 넣기
        System.out.println(String.join("-", new String[]{"java","jsp","servlet"}));

        //20.Character 객체를 이용해서 영문 대문자인지, 소문자인지 검증
        temp = "Hello World";
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase(temp.charAt(0)));
        System.out.println(Character.isLowerCase(temp.charAt(0)));
        System.out.println();


        //21.Character 객체를 이용해서 영문이냐(알파벳이냐) 검증
        temp = "123abc";
        System.out.println(Character.isAlphabetic(temp.charAt(0)));
        System.out.println(Character.isAlphabetic(temp.charAt(4)));
        System.out.println(Character.isDigit(temp.charAt(0)));

        //22. 시작하는 문자열(temp.charAt(0))이 영문 대소문자 또는 숫자 형태인지 패턴으로 검증.
        temp = "7Aabc";
        System.out.println(String.valueOf(temp.charAt(0)).matches("[a-zA-Z0-9]"));


    }//end main...

    private static void test1() {//단순병합
        long start = System.currentTimeMillis();
        String str = "aaa";
        for (int i = 0; i < 100000; i++) {
            //str += i;
            str = str.concat(""+i);
        }
        System.out.println("str.length():"+str.length());
        System.out.println("time:"+(System.currentTimeMillis() - start));
    }

    private static void test2() {//대용량병합
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println("sb.length():"+sb.length());
        System.out.println("time:"+(System.currentTimeMillis() - start));
    }
}
