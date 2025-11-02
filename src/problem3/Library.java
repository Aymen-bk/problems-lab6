package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    private static int counter;
    public Library(int capacity){
        this.capacity=capacity;
        this.documents=new ArrayList<Document>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }
    public void displayDocuments(){
        for(Document doc:getDocuments()){
            System.out.println(doc);
        }
    }
    public boolean add(Document doc){
        if (counter>=capacity){
            return false;
        }
        documents.add(doc);
        counter++;
        return true;
    }
    public boolean delete(Document doc){
        if (documents.contains(doc)){
            documents.remove(doc);
            counter--;
            System.out.println("removed!");
            return true;
        }
        return false;
    }
    public Document document(int numEnrg){
        for (Document doc:documents){
            if (doc.getNumEnrg()==numEnrg){
                return doc;
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (Document doc:documents){
            if(doc instanceof Book){
                System.out.println(((Book)doc).getAuthor());
            }
        }
    }
}
