package Lesson02;

public class Statements03 {

    public static void main(String[] args) {

        for (int i=1; i<11; i++)
            System.out.print(i + " ");
        System.out.println();

        int x = 1;
        while (x<11)
        {System.out.print(x + " ");
        x++;}
        System.out.println();

        for (int y=30; y<51; y++)
            if (y%2==0)
                System.out.print(y + " ");
        System.out.println();

        for (int v=20; v<40; v++)
            if (v%2!=0)
                System.out.print(v + " ");
        System.out.println();

    }


}
