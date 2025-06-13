/**
 * CS112 - Lab 01
 * 
 *  @author Nathan Tshishimbi <W7404862@student.miracosta.edu>
 *  @version 1.0 (06/12/25)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to CS112!");

        System.out.println("Do I like reading?\n" + Main.checksHobby("reading"));
        
        Main.printHobbies();
    }

    public static void printHobbies() {
        System.out.println("Some of my hobbies include the gym, basketball, running, reading books and manga, pottery, and watching anime, movies, and shows.");
    }

    public static String checksHobby(String hobby) {
        String myHobbies = "Some of my hobbies include the gym, basketball, running, reading books and manga, pottery, and watching anime, movies, and shows.";

        if (myHobbies.contains(hobby)) {
            return "Yes! You like " + hobby + "!";
        } else {
            return "No unfortunately you don't :(";
        }
    }
}