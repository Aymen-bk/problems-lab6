package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {this.queue=new LinkedList<>();}

    public void enqueue(Book book) {queue.addLast(book);}

    public Book dequeue() {
        if (!queue.isEmpty()) {return queue.removeFirst();}
        return null;
    }

    public Book peek() {
        if (!queue.isEmpty()){return queue.getFirst();}
        return null;
    }

    public boolean isEmpty() {return queue.isEmpty();}

    public void display() {
        System.out.println("Queue contents (front to back):");
        for (int i=0;i<queue.size();i++){
            System.out.println(" -"+queue.get(i));        }
    }
}
