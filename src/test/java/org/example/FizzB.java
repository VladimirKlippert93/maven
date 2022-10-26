package org.example;

public class FizzB {
    public static void main(String[] args) {
        int x= 4;
        System.out.println(fizzbuzz(x));
    }
    public static String fizzbuzz(int x){
        String wert= "";

        if (x%3==0 && x%5==0)
            wert="fizzbuzz";
        else if (x%5==0)
            wert="buzz";
        else if (x%3==0)
            wert="fizz";
            else wert= Integer.toString(x);
        return wert;
    }
}
