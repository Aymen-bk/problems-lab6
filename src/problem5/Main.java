package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Stack Test ===");
        BookStack stack=new BookStack();
        Book book1 =new Book("The Hobbit", "J.R.R. Tolkien",1937);
        Book book2=new Book("1984", "George Orwell",1949);
        Book book3=new Book("Clean Code", "Robert C. Martin",2008);
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.display();
        System.out.println("Popped: "+stack.pop());
        System.out.println("Top: "+stack.peek());

        stack.display();
        System.out.println("=== Queue Test ===");
        BookQueue queue=new BookQueue();
        queue.enqueue(book1);
        queue.enqueue(book2);
        queue.enqueue(book3);
        queue.display();
        System.out.println("Dequeued: "+queue.dequeue());
        System.out.println("Front: "+stack.peek());
        stack.display();


    }
}
