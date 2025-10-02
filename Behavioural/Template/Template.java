public abstract class Template {
    final void implementSteps(TemplateObject object){
        step_1();
        step_2(object.getObjectId());
        step_3(object.getObjectName());
        step_4();
    }
    abstract void step_1();
    abstract void step_2(Long id);
    abstract void step_3(String name);
    abstract void step_4();
}
