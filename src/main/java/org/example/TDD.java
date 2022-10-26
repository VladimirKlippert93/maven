package org.example;

public class TDD {
    public static void main(String[] args) {
        check(3);
        System.out.println(sumSquareOrSubstract(2,3));
    }
    public static boolean check(int number){
        boolean result = false;
        if (number >0)
            result = true;
        return result;
    }
    public static int sumSquareOrSubstract(int x, int y){
        int sum=0;
        if (x>y)
            sum=x+y;
        if (x<y)
            sum=x*y;
        return sum;
    }
}
