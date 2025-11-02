package problem3;

public class Textbook extends Book{
    public String level;
    public Textbook(String title, String author, int nbrPages, String level){
        super(title, author, nbrPages);
        this.level=level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return getNumEnrg()+" "+getTitle()+" "+getAuthor()+" "+getNbrPages()+"p "+getLevel();
    }
}
