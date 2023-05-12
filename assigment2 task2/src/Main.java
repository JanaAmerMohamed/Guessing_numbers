import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random obj1=new Random();
        int guessNumber=obj1.nextInt(20);
        guess obj2=new guess();
        try {
            obj2.guessing(guessNumber);
        }
        catch(InputMismatchException e1){
            System.out.println(e1.toString());
            obj2.guessing(guessNumber);
        }
    }
}