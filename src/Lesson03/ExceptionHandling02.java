package Lesson03;

public class ExceptionHandling02 {

    public static void main(String[] args) {

        try {
            badMethod();
            System.out.println("A");
        }
        catch (RuntimeException ex) {
            System.out.println("B");
        }
        catch (Exception ex1) {
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }


    }
    public static void badMethod() {
        //throw new RuntimeException();
        RuntimeException e = new RuntimeException();
        throw e;
    }

}
