package java_basics;

import java.util.Scanner;

public class Assignment1_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number of Rows You Want to print : ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=num;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
