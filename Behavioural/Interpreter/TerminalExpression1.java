public class TerminalExpression1 implements AbstractExpression {
    private Boolean access;

    @Override
    public void interpret(String permission) {
        access = permission.toLowerCase().equalsIgnoreCase("employee");
    }

    public Boolean getAccess() {
        return access;
    }
}
