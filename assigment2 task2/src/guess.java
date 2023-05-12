import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
public class guess {
    private
    String name;
    int sum=0;
   public guess(){
    }
    public void setName(String name){
       this.name=name;
    }
    public String getName(){
       return name;
    }
    public void guessing(int guessNumber) throws InputMismatchException{
        Scanner input1=new Scanner(System.in);
        int guess,attempts=0;
        double sum=0.0, sumSquares=0.0;
        int count=0;
        while(true){
                System.out.println("please guess the number from 0 to 20:");
                guess = input1.nextInt();
                if (guessNumber == guess) {
                    System.out.println("Congratulations!");
                    attempts += 1;
                    sum += guess;
                    sumSquares += guess*guess;
                    break;
                }
                if (guessNumber > guess) {

                    System.out.println("Please, guess a larger number");
                    attempts += 1;
                    sum += guess;
                    sumSquares += guess*guess;
                }
                if (guessNumber < guess) {
                    System.out.println("Please, guess a smaller number");
                    attempts += 1;
                    sum += guess;
                    sumSquares += guess*guess;
                }
        }
        System.out.println("please entre your name:");
        String name=input1.next();
        try{
            FileWriter file1=new FileWriter("D://Advanced//guessing.txt",true);
            PrintWriter file2=new PrintWriter(file1);
            file2.println("Name\t\t\tAttempts\tstandard deviation\n");

            double mean = sum / (double)attempts;
            double variance = sumSquares / attempts - mean * mean;
            double stdDev = Math.sqrt(variance);
            file2.println(name+"\t\t\t"+attempts+"\t\t"+stdDev);
            file2.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
