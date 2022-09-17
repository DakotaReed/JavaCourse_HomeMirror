package Lesson02;

public class Operators02 {

    public static void main(String[] args) {

        int i = 18;
        int x = i%2;
        //int y = x==0 ? i : -1;

        System.out.println(x==0 ? i : -1);
        System.out.println();

//------------------------------------------------------------------------------------

        String name = "Lolo";
        if(!name.equals("LoLo")) {
        System.out.println(name);}
        System.out.println();


//------------------------------------------------------------------------------------

        int n = 0;
        do {
            System.out.println("n = " + n);
            n--;
        }
        while (n>0);

        System.out.println(n);
        System.out.println();


//------------------------------------------------------------------------------------

        int r = 0;
        while (r<100) {
            if (r==5)
                break;
            System.out.println("r is " + r);
            r++;
        }
        System.out.println("Loop Completed");
        System.out.println(r);

        }


    }

