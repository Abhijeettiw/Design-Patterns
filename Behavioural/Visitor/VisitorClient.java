public class VisitorClient {
    public static void main(String[] args) {
        Visitor visitor_1 = new Visitor_1();
        Visitor visitor_2 = new Visitor_2();
        Element_1 element_1 = new Element_1();
        Element_2 element_2 = new Element_2();

        visitor_1.visit(element_1);
        visitor_1.visit(element_2);
        System.out.println("-------------------");
        visitor_2.visit(element_1);
        visitor_2.visit(element_2);
    }
}
