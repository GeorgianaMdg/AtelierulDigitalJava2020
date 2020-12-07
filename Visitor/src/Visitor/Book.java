package Visitor;

public class Book implements Element {
    public Book() {
        private int numberOfpages;
        private String name;

        public void accept (Visitor v){
            v.visit(this);
        }

    }

}
