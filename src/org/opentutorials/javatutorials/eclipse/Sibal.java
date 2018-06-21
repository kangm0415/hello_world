package org.opentutorials.javatutorials.eclipse;

public class Sibal {
    public static void main(String[] args) {
        System.out.println("2ÀÇ 2½Â : " + powerOfTwo(2));
        System.out.println("2ÀÇ 7½Â : " + powerOfTwo(7));
    }
    
    public static int powerOfTwo(int n) {
        if(n == 0)
            return 1;
        
        return 2 * powerOfTwo(n - 1);
    }
}
