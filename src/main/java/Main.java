public class Main {
    public static void main(String[] args) throws Exception {
        Traveler T=new Traveler(new FirstWay());
        T.write();
        T.set(new SecondWay());
        T.write();
    }
}
