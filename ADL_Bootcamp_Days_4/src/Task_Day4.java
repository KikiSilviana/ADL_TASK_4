import java.util.Scanner;

public class Task_Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
 	   int n = 20;
 	   for(int i=0; i< n; i++){
 	          for(int j=0; j< n; j++){
 	                  if (i==0||i==n-1||j==0||j==n-1){
 	                      System.out.print("*");
 	                  } else {
 	                	  System.out.print(" ");
 	                  }  	                  
 	              }
 	          System.out.println();
 	      }
 	   	System.out.println("SELAMAT DATANG MINI GAMES PATTERN");
	    System.out.println("Masukan huruf a");
	    String input1 = scan.next();
	    for(int i=0; i< n; i++){
         for(int j=0; j< n; j++){
              if (i==0||i==n-1||j==0||j==n-1){
                  System.out.print("*");
              } else if (i==n/12 && j==n/12) { 
                  System.out.print("@");
              } else {
            	  System.out.print(" ");
            }
         }
         
         System.out.println(" ");

}}}