package test.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main05_min_max {
    public static void main(String[] args) {

        int[] arr = {1,2,6,7,8,9,3,4,5};
        //1.최대값
//        Arrays.sort(arr);//오름차순(기본)
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length-1]);//최대값
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        //2.최소값
        //System.out.println(arr[0]);//최소값
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
        System.out.println();

        Integer[] arr2 = {1,2,6,7,8,9,3,4,5};
        List<Integer> list = Arrays.asList(arr2);
        //1.최대값
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(list.get(list.size()-1));
        System.out.println(Collections.max(list));

        //2.최소값
        //System.out.println(list.get(0));
        System.out.println(Collections.min(list));
        System.out.println();
        
        //1.최대값 제거
        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2.remove(list2.size()-1));
        System.out.println(list2);

        //2.최소값 제거
        System.out.println(list2.remove(0));
        System.out.println(list2);

        /// ////////////////////////
        arr = new int[]{6,7,8,9,3,1,2,4,5};
        //for문을 이용해서 최대,최소값을 출력도록 구현하기.
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max: " + max);
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min);

    }//end main
}//end class
