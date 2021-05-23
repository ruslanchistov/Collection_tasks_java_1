//Напишите функцию, которая принимает две строки: string1 и string2,
//а возвращает "yes", если вторая строка является анаграммой первой,
//и "no", если нет. Одна строка является анаграммой другой строки,
//если из первой можно получить вторую путём перестановки символов.

package zadachnic_1;

public class zadacha_4 {
    public static void main(String[] args) {
        String str1 = "Я в мире — сирота.";
        String str2 = "Я в Риме — Ариост.";
        System.out.println(anagram(str1,str2));

    }
    static String anagram(String str1,String str2){
        if(str1.length()!=str2.length()) return "no";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        if(java.util.Arrays.equals(arr1,arr2)) return "yes";
        return "no";

    }
}
