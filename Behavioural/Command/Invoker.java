public class Invoker {
//    Multithreading often used in invoker.
    void invokeCommand(Command command){
        command.execute();
    }
}
