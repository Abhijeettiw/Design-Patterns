public class StrategyContext {
    private Strategy strategy;
    void applyStrategy(){
        strategy.runAlgorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
