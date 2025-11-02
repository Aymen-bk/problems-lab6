package problem3;

public class Document {
    protected int numEnrg;
    protected String title;
    private static int counter=0;
    public Document(String title){
        this.title=title;
        this.numEnrg=counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumEnrg() {
        return numEnrg;
    }

    public void setNumEnrg(int numEnrg) {
        this.numEnrg = numEnrg;
    }

    @Override
    public String toString() {
        return getNumEnrg()+" "+getTitle();
    }
}
