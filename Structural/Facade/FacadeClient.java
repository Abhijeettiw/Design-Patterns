public class FacadeClient {
    public static void main(String[] args) {
        Email facadeEmail = new Facade().sendMail();
        System.out.println(facadeEmail.getSubject());
        System.out.println(facadeEmail.getContent());
        System.out.println(facadeEmail.getTo());
        System.out.println(facadeEmail.getAttachment());
    }
}
