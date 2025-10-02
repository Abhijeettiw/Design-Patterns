public class ConcreteTemplate_2 extends Template {

    @Override
    void step_1() {
        System.out.println("Start");
    }

    @Override
    void step_2(Long id) {
        System.out.println("Id -> " + id);
    }

    @Override
    void step_3(String name) {
        System.out.println("Name -> " + name);
    }

    @Override
    void step_4() {
        System.out.println("End");
    }
}
