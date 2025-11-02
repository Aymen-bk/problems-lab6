package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Stack Test ===");
        BookStack stack=new BookStack();
        Book book1 =new Book("buk1", "t1",2000);
        Book book2=new Book("bukk2", "t2",2010);
        Book book3=new Book("pcr", "rad",2025);
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
