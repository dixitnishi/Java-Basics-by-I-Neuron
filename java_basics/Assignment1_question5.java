package java_basics;

import java.util.Scanner;

public class Assignment1_question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int k = 0;k<(n*2)+2;k++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1;i<=n;i++){
            for(int j = i-1;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
          for(int j = 0;j<=i;j++){
            System.out.print("*");
          }
            System.out.println();
        }
        for(int a = 0;a<(n*2)+2;a++){
            System.out.print("*");
        }

    }

}
