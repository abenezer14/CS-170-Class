/*
Name: Abenezer Bekele
Date: 01/21/2019 
Course: CS170
Program: Points.java

Purpose: This program computes statistics for a basketball team using a two-
     dimensional array of points scored by the players. Each row represents
     the points scored by 1 player in all of the games. Each column holds
     the points scored by all the players for 1 game. The program first
     reads the data from a file and displays the table of points. It then
     computes and displays the team's average score per game. Next the
     program displays a 2-column table where column 1 contains the game
     number and column 2 contains the total points scored in that game.
     Finally the user enters a player number and that player's average
     points per game is displayed.
*/

import java.util.*;
import java.io.*;

public class Points {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner;
        scanner=new Scanner(System.in);
        int num;
        int[][] points; //declare 2D arry named points
        points=getData();//Call the getData method
        
        displayTable(points);//Call the displayTable method
    
        teamAverage(points);//Call your method to compute the team's average score per game and then
        System.out.println(" This team averaged "+teamAverage(points)+" points per game");//display that value
    
        System.out.print( "Game Number    Game Total");
        System.out.println();
        
        
        for( int i=0; i< points[i].length;i++){
            System.out.println("    "+(i+1)+"               "+gameTotal(points,i));//Display column headings and then call your method in a loop to display a
        }
        System.out.print("Enter a Player number between 1 and 8: ");
        num=scanner.nextInt();
        if (num>=1&&num<=points.length){
            
            System.out.printf("The average for player "+num+" is %4.1f ",playerAverage(points,num));//average and display that value
        }
       
        //2-column table with the game totals
    
        //Get a player number and then call your method to compute the player's
       
    }
    
    public static int[][] getData() throws IOException {
        int numberPlayers, numberGames;
        int[][] table; 
        Scanner scanner;
        scanner= new Scanner(new File("points.dat"));
        
        numberPlayers= scanner.nextInt();
        numberGames =scanner.nextInt();
        table= new int[numberPlayers][numberGames];
        for(int i=0; i<table.length;i++)
            for(int j=0; j< table[i].length;j++)
                table[i][j]=scanner.nextInt();
         return table;           
    }
    
    public static void displayTable (int[][] table) {
        
        System.out.print("        ");
        for(int j=0; j<table[0].length;j++)
            System.out.print("    Game  "+(j+1));
        System.out.println();
        for(int i=0; i<table.length;i++){
           System.out.print("players "+ (i+1));
           for(int j=0; j<table[i].length;j++){
                System.out.printf("%10d",table[i][j]);
                System.out.println();
           }
        }
    
    }
    
    public static  double teamAverage(int [][] table){
        double total=0; // intalize total to 0
        double average;
        for(int j=0; j < table[0].length;j++){
            for(int i=0; i< table.length;i++)
                total+=table[i][j];            //calculet the total 
                     
           }
        average=total/table[0].length; //to calculate average divide the total by the length of the raw 
        return average; // return average to the main method 

    }
    public static int gameTotal(int [][] table, int gamenumber){
        int colsum=0;  
        for(int j=0; j <table.length;j++){
             colsum+=table [j][gamenumber]; //calculate the total of each games  
        }
        return colsum;// return colsum to the main method 
    }
    public static double playerAverage(int [][] table, int playernumber){
        double rawsum=0; 
        double average;
        for(int i=0; i < table[0].length;i++){
             rawsum+=table [playernumber-1][i];// calculet raw sum
        }
        average=rawsum/table[0].length; //calculet average
        return average;
    }
}
