import java.util.Scanner;
public class Main
{
    static char x=0;
    static char y=1;
    static char z=2;
    static short checkSum(short[][] vector, short NEEDEDSIZE, char coordinate)
    {
        char start=0;
        short result = 0;
        for(start=0;start<NEEDEDSIZE;start++)
        {
            result += vector[start][coordinate] ;
        }
        return result;
    }
    static boolean checkEquilebrium(short[][] vector, short NEEDEDSIZE)
    {
        if ((checkSum(vector,NEEDEDSIZE,x))!=0)
        {
            return false;
        }
        if ((checkSum(vector,NEEDEDSIZE,y))!=0)
        {
            return false;
        }
        if ((checkSum(vector,NEEDEDSIZE,z))!=0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        short VectorMax = 100, VectorMin = 1, coordinates = 3, neededSize = 0;
        short[][] V;
        char VectorNo = 0;
        char CoordinatesNo = 0;
        Boolean checkValue= true;
        V = new short[VectorMax][coordinates];
        Scanner ScanVectorNo = new Scanner(System.in);
        System.out.println("Please enter number of vectors \n");
        neededSize = ScanVectorNo.nextShort();
        Scanner ScanCoordinatesValue = new Scanner(System.in);

        if(neededSize < 1)
        {
            throw new IllegalArgumentException(" The number of vectors must be >=1 \n");
        }
        else if(neededSize > 100)
        {
            throw new IllegalArgumentException(" The number of vectors must be <100 \n");
        }
        else
        {
            System.out.println("Please enter the coordinates of each vector  \n");
            for (VectorNo = 0; VectorNo < neededSize;
                 VectorNo++)
            {

                for (CoordinatesNo = 0; CoordinatesNo < coordinates;CoordinatesNo++)
                {

                    V[VectorNo][CoordinatesNo] = ScanCoordinatesValue.nextShort();
                }
            }
            System.out.println("The array input =  \n");
            for (VectorNo = 0; VectorNo < neededSize; VectorNo++)
            {

                for (CoordinatesNo = 0; CoordinatesNo < coordinates; CoordinatesNo++)
                {

                    System.out.print("[" + V[VectorNo][CoordinatesNo] + "]");
                }
                System.out.println(" ");
            }

            checkValue = checkEquilebrium(V, neededSize);
            if (checkValue == true) {
                System.out.println("The body is in equilibrium. \n");
            } else if (checkValue == false) {
                System.out.println("The body is moving. \n");
            }
        }
    }
}
