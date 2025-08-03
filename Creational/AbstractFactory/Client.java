public class Client {
    private final ResourceFactory resourceFactory;
    Client(ResourceFactory factory){
        this.resourceFactory = factory;
    }

    public static void main(String[] args) {
        Client ancientClient = new Client(new AncientFactory());
        Animals ancientAnimal = ancientClient.resourceFactory.createAnimal();
        Humans ancientHuman = ancientClient.resourceFactory.createHuman();
        Client modernClient = new Client(new ModernFactory());
        Animals modernAnimal = modernClient.resourceFactory.createAnimal();
        Humans modernHuman = modernClient.resourceFactory.createHuman();
        System.out.println("Abstract Factory");
    }
}
