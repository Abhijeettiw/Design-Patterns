public class TemplateClient {
    public static void main(String[] args) {
        TemplateObject object_1 = new TemplateObject(1L,"Template 1");
        TemplateObject object_2 = new TemplateObject(2L,"Template 2");
        Template template_1 = new ConcreteTemplate_1();
        template_1.implementSteps(object_1);
        System.out.println("-----------------------");
        Template template_2 = new ConcreteTemplate_2();
        template_2.implementSteps(object_2);
    }
}
