package test.stream;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main09 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        //텍스트파일을 읽어오는 스트림 구현하기.
        String path = "C:\\MULTI_EDU_01\\java\\work\\java29_Stream\\src\\test\\com\\test.txt";

        try {
            //라인별로 리스트컬렉션에 할당하기
            List<String> list = Files.lines(Paths.get(path),
                            Charset.forName("UTF-8"))
                            .toList();
            System.out.println(list);

            //한줄한줄 출력하기
            Files.lines(
                    Paths.get(path),
                    Charset.forName("UTF-8"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }//end main
}//end class
