/*Описать рекурсивную функцию FibRec(N) целого типа, вычисляющую N-е число
  Фибоначчи F(N) по формуле: F(1) = F(2) = 1, F(k) = F(k–2) + F(k–1), k = 3, 4, ... С помощью
  этой функции найти пять чисел Фибоначчи с указанными номерами и вывести эти числа
  вместе с количеством рекурсивных вызовов функции FibRec, потребовавшихся для их
  нахождения.*/

        package zadachnic_1;

public class Z_69_1 {
    public static int count= 0;
    public static void main(String[] args) {

        System.out.println(fibRec(5)+"\t число вызовов: "+count);
        count=0;
        System.out.println(fibRec(6)+"\t число вызовов: "+count);
        count=0;
        System.out.println(fibRec(7)+"\t число вызовов: "+count);
        count=0;
        System.out.println(fibRec(8)+"\t число вызовов: "+count);
        count=0;
        System.out.println(fibRec(9)+"\t число вызовов: "+count);
    }
    public static int fibRec(int N){
        count++;
        if(N==0)return 0;
        if(N<=2)return 1;
        else return fibRec(N-2)+fibRec(N-1);
    }
}
