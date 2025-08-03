public class HtmlDecorator extends Message {

    HtmlDecorator(String msg) {
        super();
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg + " Coded in Html format";
    }
}
