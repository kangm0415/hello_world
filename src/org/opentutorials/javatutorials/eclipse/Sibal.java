package org.opentutorials.javatutorials.eclipse;

public class Sibal {
    public static void main(String[] args) {
        System.out.println("2�� 2�� : " + powerOfTwo(2));
        System.out.println("2�� 7�� : " + powerOfTwo(7));
    }
    
    public static int powerOfTwo(int n) {
        if(n == 0)
            return 1;
        
        return 2 * powerOfTwo(n - 1);
    }
}
