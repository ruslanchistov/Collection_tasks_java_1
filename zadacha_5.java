//Напишите функцию, которая принимает массив с разными повторяющимися числами,
//а возвращает массив тех же чисел, но уже без повторов.

package zadachnic_1;
import java.util.*;
import java.util.LinkedHashSet;

public class zadacha_5 {
    public static void main(String[] args) {
        int[] arr = {1,5,1,3,6,2,8,9,5,6,4,7,8,9,5,2,3,1};
        Integer [] new_arr = uniqueNum(arr);
        for(int i: new_arr){
            System.out.print(i+" ");
        }
    }
    static Integer[] uniqueNum(int[] arr){
       LinkedHashSet <Integer> arr1 =new LinkedHashSet <Integer>();
       for (int i :arr){
               arr1.add(i);
       }
       Integer [] new_arr = arr1.toArray(new Integer [arr1.size()]);
        return new_arr;
    }
}
