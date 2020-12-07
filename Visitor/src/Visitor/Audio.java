package Visitor;

public class Audio implements Element {
    public int time;
    public String nume;
    public int numberOfsongs;

    public Audio(int time, String nume, int numberOfsongs) {
        this.time = time;
        this.nume = nume;
        this.numberOfsongs = numberOfsongs;
    }


    public int getTime() {
        return time;
    }

    public String getNume() {
        return nume;
    }

    public void accept(Visitor v){
        v.visit(this);

    }

    public int getNumberOfsongs() {
        return numberOfsongs;
    }
    void accept (Visitor v);
}
