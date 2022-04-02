package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите возможный полиндром: ");
        Scanner sc =new Scanner(System.in);
        String s1;
        s1=sc.nextLine();
        StringBuffer strBuffer=new StringBuffer(s1);
    String s2 = (strBuffer.reverse()).toString();
if (s1.equalsIgnoreCase(s2)){
    System.out.println("Слово является полиндромом");
}
else{
    System.out.println("Слово не явяется полиндромом");

}
    }
}
