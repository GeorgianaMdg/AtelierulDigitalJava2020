package Visitor;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Book(50, "Book Name");
        Element e2 = new Video ( "Video Name",120);
        Element e3 = new Audio(5,80,"Name of Audio");
        Element [] elements = new Element[]{e1,e2,e3}
        Visitor visitor = new DurationVisitor();
        for(Element currentElement : elements)
        {
            currentElement.accept(visitor);
        }
        System.out.println(visitor);
        NameVisitor = new NameVisitor();
        for(Element currentElement : elements)
        {
            currentElement.accept(visitor);
        }
        System.out.println(nameVisitor.getName());
    }

}
