public class Client {
    public static void main(String[] args) {
        Message message = new MessageImpl("Decorator Design Pattern");
        System.out.println(message.getMessage());
        Message htmlEncoded = new HtmlDecorator(message.getMessage());
        System.out.println(htmlEncoded.getMessage());
        Message byteCodeEncoded = new ByteCodeEncoder(message.getMessage());
        System.out.println(byteCodeEncoded);
    }
}
