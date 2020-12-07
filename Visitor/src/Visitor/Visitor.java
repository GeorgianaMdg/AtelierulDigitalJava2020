package Visitor;

public interface Visitor {
    void visit (Book book);
    void visit (Audiu audio);
    void visit (Video video);

}
