public class StrategyClient {
    public static void main(String[] args) {
        Strategy strategy_1 = new Algorithm1();
        Strategy strategy_2 = new Algorithm2();
        StrategyContext context = new StrategyContext();
        context.setStrategy(strategy_1);
        context.applyStrategy();
        context.setStrategy(strategy_2);
        context.applyStrategy();
    }
}
