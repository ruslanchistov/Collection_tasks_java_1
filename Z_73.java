/*Задано положительное и отрицательное число в двоичной системе. Составить   программу
  вычисления  суммы этих чисел, используя функцию сложения чисел в двоичной системе
  счисления.*/

        package zadachnic_1;

public class Z_73 {
    public static void main(String[] args) {
        String s1 = "1000";
        String s2 = "-1010";
        int i1 = Integer.parseInt(s1,2);
        int i2 = Integer.parseInt(s2,2);
        show(i1 + i2);//обычное сложение
        show(sum(i1,i2));//рекурсивное сложение
        }
        public static int sum(int a,int b){
            if (b < 0)
                return sum(a - 1, b + 1);
            if (b > 0)
                return sum(a + 1, b - 1);
            return a;
        }
        public static void show(int result){
            if(result>=0) System.out.println(Integer.toBinaryString(result));
            else System.out.println("-"+Integer.toBinaryString(Math.abs(result)));
        }
    }
