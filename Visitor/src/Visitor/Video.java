package Visitor;

public class Video implements Element{
    public String name;
    private int time;

    public Video(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
    public void accept (Visitor v){

    }
}
