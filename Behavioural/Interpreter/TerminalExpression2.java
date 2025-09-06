public class TerminalExpression2 implements AbstractExpression {
    private Boolean access;

    @Override
    public void interpret(String permission) {
        access = permission.toLowerCase().equalsIgnoreCase("manager");
    }

    public Boolean getAccess() {
        return access;
    }
}
