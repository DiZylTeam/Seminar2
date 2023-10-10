public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Dmitry");
        Human human2 = new Human("Timofei");
        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();
    }
}