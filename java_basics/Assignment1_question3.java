package java_basics;

import java.util.Scanner;

public class Assignment1_question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an odd number to Construct a Symmetrical House : ");
        int n  = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1;i<=n/2;i++){
            for(int j = i-1;j<n/2;j++){
                System.out.print("*");
            }
            for(int k = 0;k<i;k++){
                System.out.print(" ");
            }
            for(int a = 1;a<i;a++){
                System.out.print(" ");
            }
            for(int l = n/2;l>i-1;l--){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int s= n/2;s<n;s++){
            for(int d = 0;d<n;d++){
                if(d==0 || d==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
        
        // System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print("*");
        }
    }
}
