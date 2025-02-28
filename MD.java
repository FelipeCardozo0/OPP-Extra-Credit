/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

import java.util.ArrayList;
import java.util.List;

public class MD {
    public static void main(String[] args) {
        List<MediaItem> media = new ArrayList<>();
        media.add(new Book("1984", 1949, "George Orwell"));
        media.add(new Movie("Inception", 2010, "Christopher Nolan"));

        // Polymorphism: Treat all as MediaItem and Rentable
        for (MediaItem item : media) {
            System.out.println(item.getDetails());
            item.rent();
            System.out.println("Rented: " + item.isRented());
        }
    }
}