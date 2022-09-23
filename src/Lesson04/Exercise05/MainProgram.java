package Lesson04.Exercise05;

public class MainProgram {
    public static void main(String[] args) {

        Israel israel = new Israel();
        USA usa = new USA();
        China china = new China();

        System.out.println(israel.myTraditionalFood() + " " + israel.myTraditionalVacation() + " " + israel.myTraditionalLanguage());
        System.out.println(usa.myTraditionalFood() + " " + usa.myTraditionalVacation() + " " + usa.myTraditionalLanguage());
        System.out.println(china.myTraditionalFood() + " " + china.myTraditionalVacation() + " " + china.myTraditionalLanguage());

    }
}
