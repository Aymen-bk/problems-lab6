package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Write the number of documents :  ");
        int n = scan.nextInt();
        Library myLibrary=new Library(n);
        //two documents of my choice :
        myLibrary.add(new Book("book1","author1",105));
        myLibrary.add(new Book("book2","author2",205));
        //menu
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice,myLibrary);
            printMenu();
            choice = scan.nextInt();
        }
    }
    public static void printMenu(){
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Display the library");
        System.out.println("2: Add a document to the library");
        System.out.println("3: Delete a document from the library");
        System.out.println("4: Return Document by id in the library");
        System.out.println("5: Display authors of the books in the library");
        System.out.print("\nEnter your choice: ");
    }
    public static void dispatch(int choice, Library myLibrary){
        Scanner scan=new Scanner(System.in);
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("Displaying ...");
                myLibrary.displayDocuments();
                break;
            case 2:
                System.out.println("Write the type of your Document(Document, Book, Magazine, Dictionary, Novel, TextBook) you want to add : ");
                String type=scan.nextLine();
                System.out.println("Write the title of your "+type);
                String title=scan.nextLine();
                switch (type) {
                    case "Document":
                        myLibrary.add(new Document(title));
                        break;
                    case "Book":
                        System.out.println("Write the author of your "+type);
                        String author =scan.nextLine();
                        System.out.println("Write the number of Pages of your "+type);
                        int nbr =scan.nextInt();
                        myLibrary.add(new Book(title,author,nbr));
                        break;
                    case "Novel":
                        System.out.println("Write the author of your "+type);
                        author =scan.nextLine();
                        System.out.println("Write the number of Pages of your "+type);
                        nbr =scan.nextInt();
                        System.out.println("Write the price of your "+type);
                        double price =scan.nextDouble();
                        myLibrary.add(new Novel(title,author,nbr,price));
                        break;
                    case "Textbook":
                        System.out.println("Write the author of your "+type);
                        author =scan.nextLine();
                        System.out.println("Write the number of Pages of your "+type);
                        nbr =scan.nextInt();
                        System.out.println("Write the price of your "+type);
                        String level =scan.nextLine();
                        myLibrary.add(new Textbook(title,author,nbr,level));
                        break;
                    case "Magazine":
                        System.out.println("Write the month of your "+type);
                        String month =scan.nextLine();
                        System.out.println("Write the year of your "+type);
                        int year =scan.nextInt();
                        myLibrary.add(new Magazine(title,month,year));
                        break;

                    case "Dictionary":
                        System.out.println("Write the language of your "+type);
                        String language =scan.nextLine();
                        myLibrary.add(new Dictionary(title,language));
                        break;
                }
                break;
            case 3:
                System.out.println("Write the number of the document you want to delete");
                int num=scan.nextInt();
                Document todel=myLibrary.document(num);
                myLibrary.delete(todel);


                break;
            case 4:
                System.out.println("Write the number of the document you want : ");
                num=scan.nextInt();
                System.out.println(myLibrary.document(num));
                break;

            case 5:
                System.out.println("Displaying authors...");
                myLibrary.displayAuthors();
                break;

            default:
                System.out.println("Sorry, invalid choice");
        }
    }


    }

