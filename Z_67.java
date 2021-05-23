/*Описать рекурсивные функции Fact(N) и Fact2(N) вещественного типа, вычисляющие
  значения факториала N! и двойного факториала N!! соответственно (N > 0 — параметр
  целого типа). С помощью этих функций вычислить факториалы и двойные факториалы
  пяти данных чисел.*/

        package zadachnic_1;

public class Z_67 {
    public static void main(String[] args) {
        System.out.println(fact_1(3.0));
        System.out.println(fact_2(3.0));

        System.out.println(fact_1(4.0));
        System.out.println(fact_2(4.0));

        System.out.println(fact_1(5.0));
        System.out.println(fact_2(5.0));

        System.out.println(fact_1(6.0));
        System.out.println(fact_2(6.0));

        System.out.println(fact_1(7.0));
        System.out.println(fact_2(7.0));

    }
    public static double fact_1(double N){
        if(N==0) return 1;
         else return N*fact_1(N-1);
    }
    public static double fact_2(double N){
    if(N==1)return 1;
    if(N==2)return 2;
    return N*fact_2(N-2);
    }
}
