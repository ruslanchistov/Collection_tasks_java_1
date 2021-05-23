//Напишите функцию, которая принимает массив с разными числами,
//а возвращает максимальное произведение двух чисел из этого массива.

package zadachnic_1;

public class zadacha_1 {
    public static void main(String[] args) {
        int []arr = {1,5,8,3,1,2,9,4,7,6};
        System.out.println("Максимальное произведение двух чисел массива = "+max_product(arr));
    }
    static int max_product(int[] arr){
        java.util.Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];

    }
}
