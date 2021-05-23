/*Описать рекурсивную функцию Digits(S) целого типа, находящую количество цифр в
  строке S без использования оператора цикла. С помощью этой функции найти количество
  цифр в данных пяти строках.*/

        package zadachnic_1;

public class Z_71 {

    public static void main(String[] args) {
        String a = new String("1235");
        String b = new String("8596214");
        String c = new String("122558995566");
        String d = new String("56982147899");
        String e = new String("2568");

        System.out.println(digits(a));
        System.out.println(digits(b));
        System.out.println(digits(c));
        System.out.println(digits(d));
        System.out.println(digits(e));

    }
public static int digits(String S){
    if(S=="")return 0;
    else return digits(S.substring(1))+1;
        }
}


