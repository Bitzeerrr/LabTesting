import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Please enter watermelon weight \n");
        Scanner Numberinput = new Scanner(System.in);
        int Number = Numberinput.nextInt();
        Melon determine = new Melon();
        determine.even_oddtest(Number);
    }
}
