package problem5;

import java.util.LinkedList;
import java.util.Stack;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        this.stack=new LinkedList<>();
    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        if (!stack.isEmpty()){
            return stack.removeFirst();
        }
        return null;
    }

    public Book peek() {
        if (!stack.isEmpty()){
            return stack.getFirst();
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for (int i=0;i<stack.size();i++){
            System.out.println(" -"+stack.get(i));
        }

    }
}

