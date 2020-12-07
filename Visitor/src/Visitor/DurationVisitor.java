package Visitor;

public class DurationVisitor implements Visitor  {
    private int totalDuration =0;
    public String toString(){
        return "The visited elements have a total duration of:" + totalDuration + "min";
    }

    public void visit(Book book){
        totalDuration+= book.getnumberOfpages()*5;
    }
    public void visit(Video video){

        totalDuration+= video.getTime() + video.getTime()/30*5;

    }
    public void visit (Audio audio){
        totalDuration+= audio.getTime() + audio.numberOfsongs()*0.3;
    }

}
