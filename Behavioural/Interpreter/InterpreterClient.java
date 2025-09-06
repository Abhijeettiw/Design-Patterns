public class InterpreterClient {
    public static void main(String[] args) {
        TerminalExpression1 expression1 = new TerminalExpression1();
        expression1.interpret("employee");
        TerminalExpression2 expression2 = new TerminalExpression2();
        expression2.interpret("manager");
        NonTerminalExpression nonTerminalExpression1 = new NonTerminalExpression(expression1, expression2);
        nonTerminalExpression1.interpret("admin");
        System.out.println(nonTerminalExpression1.getAccess());
        NonTerminalExpression nonTerminalExpression2 = new NonTerminalExpression(expression1, expression2);
        nonTerminalExpression2.interpret("admin");
        System.out.println(nonTerminalExpression2.getAccess());
    }
}
