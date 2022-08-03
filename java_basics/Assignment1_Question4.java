package java_basics;

import java.util.Scanner;

public class Assignment2_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int a = 0;a<=n-i;a++){
                System.out.print(" ");
            }
            for(int a = 0;a<=n-i;a++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j = 1;j<=2;j++){
            for(int i = 0;i<(n*2)+2;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
