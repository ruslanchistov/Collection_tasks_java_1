/*Написать рекурсивную функцию для перевода данного натурального числа в р-ичную
  систему счисления (2 ≤ р ≤ 9).*/

        package zadachnic_1;

public class Z_77 {
    public static void main(String[] args) {
       transform(10,2);
        System.out.println();
        transform(10,3);
        System.out.println();
        transform(10,4);
        System.out.println();
        transform(10,5);
    }
    public static void transform(int num,int p){
        if(p<2||p>9)return;
        if(num==0) return;
        else transform(num/p,p);
        System.out.print(num%p);
    }
}
