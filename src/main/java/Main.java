import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> studentGrades = new HashMap<String, String>();
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Do you want to do? ");
            System.out.println("1. Create a new Book ");
            System.out.println("2. Look up a Book ");
            int answer = obj.nextInt();
            // Logic for adding a new book
            while (answer == 1) {
                System.out.print("Title of book? ");
                String bookName = obj.next();
                System.out.print("Name of the Genre? ");
                String genre = obj.next();
                studentGrades.put(bookName, genre);
                System.out.println("Title: " + bookName + ", " + "Genre: " + genre);
                System.out.println("Successfully entered! ");
                break;
            } if(answer != 1) {
                System.out.println("Okay, Let's check if we have it. ");
                System.out.print("Title of book? ");
                String bookName = obj.next();
                String lookUp = studentGrades.get(bookName);
                if (lookUp != null) {
                    System.out.print("We found the book! " + bookName);
                } else {
                    System.out.println("Sorry we couldn't find the book! ");
                    System.out.println("Do you want to do? ");
                    System.out.println("1. Create a new Book ");
                    System.out.println("2. Look up a Book ");
                    answer = obj.nextInt();
                    while (answer == 1) {
                        System.out.print("Title of book? ");
                        bookName = obj.next();
                        System.out.print("Name of the Genre? ");
                        String genre = obj.next();
                        studentGrades.put(bookName, genre);
                        System.out.println("Title: " + bookName + ", " + "Genre: " + genre);
                        System.out.println("Successfully entered! ");
                        break;
                }
            }
        }
    }
    }
}
