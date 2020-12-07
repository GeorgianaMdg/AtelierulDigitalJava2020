package Visitor;

public class NameVisitor implements Visitor{
    private String name = "";
    public void visit(Book book){
        name+= book.getName() + "book";
    }
    public void visit(Video video){
        name+= video.getName() + "book";
    }
    public void visit(Audio audio){
        name+= audio.getName() + "book";
    }

    public String getName() {
        return name;
    }
}
