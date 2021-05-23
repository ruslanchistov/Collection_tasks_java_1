//Напишите функцию, которая принимает строку,
//а возвращает ее перевернутый вариант (слова в обратном порядке).

package zadachnic_1;

public class zadacha_3 {
    public static void main(String[] args) {
        String str = "Однажды в студёную зимнюю пору";
        System.out.println(invertor_str(str));
    }
    static StringBuilder invertor_str(String str){
        String[] str_arr = str.split(" ");
        StringBuilder str_reverse = new StringBuilder("");
        for(int i= str_arr.length-1;i>=0;i--){
            str_reverse.append(str_arr[i]+" ");
        }
        return str_reverse;
    }
}
