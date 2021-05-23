//Напишите функцию, которая принимает массив с разными числами,
//а возвращает наиболее встрещающееся число из этого массива.

package zadachnic_1;

public class zadacha_2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,6,4,5,8,9,6,8,7,5,6,3,2,1,4,5,8,7,9};
        System.out.println("Всех чаще встречается число "+ countMax(arr));
    }
    static int countMax(int[] arr){
        int count_max =0;
        int num_max = arr[0];
        for(int i:arr){
            int count = 0;
            for(int j:arr){
               if(arr[i]==arr[j]){
                   count += 1;
               }
               if(count>count_max){
                   count_max = count;
                   num_max = arr[i];
               }
            }
        }
        return (num_max);
    }
}
