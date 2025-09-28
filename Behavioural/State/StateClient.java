public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.printState();
        context.inProgress();
        context.printState();
        context.finish();
        context.printState();
    }
}
