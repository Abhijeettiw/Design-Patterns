public class MessageImpl extends Message {

    MessageImpl(String msg) {
        super();
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
