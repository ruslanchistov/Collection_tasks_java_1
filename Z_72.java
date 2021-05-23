/*Описать рекурсивную функцию Simm(S) логического типа, проверяющую, является ли
  симметричной строка S, без использования оператора цикла. С помощью этой функции
  проверить данные пяти строк .*/

        package zadachnic_1;

public class Z_72 {
    public static void main(String[] args) {

        System.out.println(simm("adsfdgt"));
        System.out.println(simm("abcdedcba"));
        System.out.println(simm("are-era"));
        System.out.println(simm("assa-assa"));
        System.out.println(simm("sdfdgsf"));
    }
    public static boolean simm(String str){
        if(str.length()<2)return true;
        else if(str.charAt(0)!=str.charAt(str.length()-1)) return false;
       else return simm(str.substring(1,str.length()-1));

    }
}
