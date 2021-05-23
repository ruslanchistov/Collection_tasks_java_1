/*Описать рекурсивную функцию PowerN(x,n) вещественного типа, находящую значение n-й
  степени числа x по формуле: x0 = 1, xn = x•xn–1 при n > 0, xn = 1 / x–n при n < 0 (x >= 0 –
  вещественное число, n – целое). С помощью этой функции найти значения XN при 5
  различных значениях N для данного X .*/

        package zadachnic_1;

public class Z_68 {
    public static void main(String[] args) {
        System.out.println(powerN(2.0,5));
        System.out.println(powerN(2.0,-5));
        System.out.println(powerN(2.2,6));
        System.out.println(powerN(2.5,-4));
        System.out.println(powerN(5.5,3));

    }
    public static double powerN(double x,int n){
        if(n>0) {
            if (n == 0) return 1;
            else return x * powerN(x, n - 1);
        }
        else {
            if (n == 0) return 1;
            else return 1/x * powerN(x, n + 1);
        }
    }
}
