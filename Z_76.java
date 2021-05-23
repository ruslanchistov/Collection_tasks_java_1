/*Составить программу для нахождения числа, которое образуется из данного натурального
  числа при записи его цифр в обратном порядке. Например, для числа 1234 получаем
  результат 4321 .*/

        package zadachnic_1;
import java.lang.Math;
public class Z_76 {
    public static void main(String[] args) {
        System.out.println(transform(4321));
        System.out.println(transform(58649));
        System.out.println(transform(4587921));

    }
    public static int transform(int num){
       String str = ""+num;
       int result = 0;
       int line = str.length();
        for (int i = 0; i < line; i++) {
            result+= ((num/(int)Math.pow(10,line-i-1))%10)*((int)Math.pow(10,i));
        }
        return result;
    }
}
