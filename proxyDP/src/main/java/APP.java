public class APP {
    public static void main(String[] args) {
        Client client=new Client();
        client.setStandard(new StandardImpl1());
        client.process();
    }
}
