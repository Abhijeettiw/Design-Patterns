public class NonTerminalExpression implements AbstractExpression {
    private Boolean access = false;
    TerminalExpression1 expression1;
    TerminalExpression2 expression2;

    NonTerminalExpression(TerminalExpression1 expression1, TerminalExpression2 expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public void interpret(String permission) {
        access = expression1.getAccess() && expression2.getAccess() && permission.equalsIgnoreCase("admin");
    }

    public Boolean getAccess() {
        return access;
    }
}
