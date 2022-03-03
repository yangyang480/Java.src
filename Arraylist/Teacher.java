package Arraylist;

public class Teacher {

    private int tid;
    private String tname;
    private int tage;

    //two constructors
    public Teacher(int tid, String tname, int tage) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
    }

    public Teacher() {
    }

    //getter and setter


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    //wait to be called in runnable class
}
