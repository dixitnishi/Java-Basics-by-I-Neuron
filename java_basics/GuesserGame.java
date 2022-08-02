package java_basics;

import java.util.Scanner;

class Gusser{
    int guessNum;

    public int guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser please enter the Number : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class players{
    int numPlayers;
    int playerGussedNums[];

    public int[] guessNumPlayer(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter the number of players playing the game : ");
        numPlayers = sc.nextInt();
        playerGussedNums = new int[numPlayers];
        for(int i = 0;i<numPlayers;i++){
            System.out.println("Please enter the guess number of Player : "+(i+1));
            playerGussedNums[i] = sc.nextInt();
        }
        return playerGussedNums;
    }
}

class umpire{
    int numFromGuesser;
    int numsFromPlayers[];

    public void collectNumFromGusser(){
        Gusser g = new Gusser();
        numFromGuesser = g.guess();
    }

    public void collectFromPlayer(){
        // creating new Grop of Players not a individual player
        players p = new players();
        numsFromPlayers = p.guessNumPlayer();
    }
    public int compare(){
        // Assuming there will only be one  winner
        int player = -1;
        int winnerCount  = 0;
        for(int i = 0;i<numsFromPlayers.length;i++){
            if(numFromGuesser==numsFromPlayers[i]){
                winnerCount++;
                player = i;
            }
        }
        if(winnerCount>1){
            return 0;   //the game is draw;
        }

        if(winnerCount==0){
            return  -1;  //Nobody won the game, Lets start again
        }
        return player+1;
    }
}

public class GuesserGame {
    public static void main(String[] args){
        umpire u = new umpire();
        u.collectNumFromGusser();
        u.collectFromPlayer();

        int ans = u.compare();
        if(ans==0){
            System.out.println("Opps! The game is a draw, Please start again");
        }
        else if(ans==-1){
            System.out.println("Opps! Non Of the players Won the game, Lets start again");
        }
        else {
            System.out.println("Yay! You won player "+ans);
        }

    }
    
}
