public class ByteCodeEncoder extends Message{
    ByteCodeEncoder(String msg){
        super();
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg.getBytes().toString();
    }
}
