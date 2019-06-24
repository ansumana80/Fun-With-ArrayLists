import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        //Create a list of colors
        ArrayList<String> color = new ArrayList<String>();
        //Add some colors in olor
        color.add("Red");
        color.add("Green");
        color.add("Black");
        System.out.println(color);

        System.out.println("*****************");
        System.out.println(color.get(1));

        System.out.println("*****************");

        System.out.println("User Enter new color");
        String userInput= Keyboard.next();
        color.add(userInput);
        System.out.println(color);

        System.out.println("*****************");
//        System.out.println("keep adding Color if you want to");
        String answer;
        do{
            System.out.println("User Enter new color");
            userInput= Keyboard.next();
            color.add(userInput);
            System.out.println("Do you want to continue? Type any key to continue or q to quit");
            answer = new Scanner(System.in).nextLine();

        }while (!answer.equalsIgnoreCase("q"));

        System.out.println(color);
    }
}
