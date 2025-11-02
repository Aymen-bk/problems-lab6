package challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Place> places = new LinkedList<>();

    public static void main(String[] args) {
        addPlace(new Place("Sydney", 0));
        addPlace(new Place("Canberra", 286));
        addPlace(new Place("Melbourne", 877));
        addPlace(new Place("Adelaide", 1374));
        addPlace(new Place("Alice Springs", 2771));
        addPlace(new Place("Perth", 3923));

        visit();
    }

    private static void addPlace(Place place) {
        if (places.contains(place)) {
            return;
        }
        ListIterator<Place> iterator = places.listIterator();
        while (iterator.hasNext()) {
            Place current = iterator.next();
            if (current.getDistance()-place.getDistance()> 0) {
                iterator.previous();
                iterator.add(place);
                return;
            }
        }
        places.add(place);
    }

    private static void visit() {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Place> iterator = places.listIterator();
        boolean quit = false;
        boolean forward = true;//can we still go forward ?

        System.out.println("Starting from " + places.getFirst());
        printMenu();

        while (!quit) {
            System.out.print("Choose option: ");
            String action = scanner.nextLine().toUpperCase();

            switch (action) {
                case "F":
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Traveling to " + iterator.next());
                    }
                    else {
                        System.out.println("Reached the end of the list.");
                        forward = false;
                    }
                    break;

                case "B":
                    if (forward) {
                        if (iterator.hasPrevious()) iterator.previous();
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Traveling back to " + iterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        forward = true;
                    }
                    break;

                case "L":
                    printList();
                    break;

                case "M":
                    printMenu();
                    break;

                case "Q":
                    quit = true;
                    System.out.println("Trip ended. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
            === MENU ===
            (F) Forward
            (B) Backward
            (L) List all places
            (M) Show menu
            (Q) Quit
            """);
    }

    private static void printList() {
        System.out.println("Places:");
        for (Place p : places) {
            System.out.println(" - " + p);
        }
    }
}
