public class Melon
{
    int even_oddtest(int w)
    {

        if ((w<=0))
        {
            throw new IllegalArgumentException(" w can't be <= 0");
        }

        else
        {
            if ((w % 2) == 0)
            {
                System.out.println("This number is even \n");
                return 1;
            }
            else
            {
                System.out.println("This number is odd \n");
                return 0;
            }
        }
    }}
