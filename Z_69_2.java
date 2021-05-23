/*Описать рекурсивную функцию FibRec(N) целого типа, вычисляющую N-е число
  Фибоначчи F(N) по формуле: F(1) = F(2) = 1, F(k) = F(k–2) + F(k–1), k = 3, 4, ... С помощью
  этой функции найти пять чисел Фибоначчи с указанными номерами и вывести эти числа
  вместе с количеством рекурсивных вызовов функции FibRec, потребовавшихся для их
  нахождения.*/

package zadachnic_1;

public class Z_69_2 {
    public static void main(String[] args) {
        int N;
        N=fibRec(5);
        System.out.println(N+"\t число вызовов: "+(N*2-1));
        N=fibRec(6);
        System.out.println(N+"\t число вызовов: "+(N*2-1));
        N=fibRec(7);
        System.out.println(N+"\t число вызовов: "+(N*2-1));
        N=fibRec(8);
        System.out.println(N+"\t число вызовов: "+(N*2-1));
        N=fibRec(9);
        System.out.println(N+"\t число вызовов: "+(N*2-1));
    }
    public static int fibRec(int N){
        if(N==0)return 0;
        if(N<=2)return 1;
        else return fibRec(N-2)+fibRec(N-1);
    }
}
