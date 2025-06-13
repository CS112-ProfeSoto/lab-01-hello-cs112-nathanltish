public class Main {

    // Passes a name argument and gives a greeting alongside desired grade from 2nd method
    public static void greeting(String name) {
        System.out.println("Hello " + name + "! Glad to have you in CS112!");
        System.out.println("Make sure to secure that " + desiredGrade('A') + " you want in this class!");
    }

    // Very mundane method that returns the parameter passed to it 
    public static char desiredGrade(char letter) {
        return letter;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to CS112!");

        greeting("Nathan");
        desiredGrade('a');
    }
}