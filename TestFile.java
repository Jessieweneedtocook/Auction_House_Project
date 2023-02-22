import java.util.ArrayList;
import java.util.List;

public class TestFile {

    public void test() {
        Reporting testR = new Reporting();
        testR.addAuctionHouse(new AuctionHouse("House 0"));
        testR.addAuctionHouse(new AuctionHouse("House 1"));

        Item item1 = new Item(2,"buyer_515",177.04,1988,"furniture");
        Item item2 = new Item(7,"buyer_814",191.41,2015,"painting");
        testR.auctionHouses.get(1).addItem(new Item(0,"buyer_474",99.9,2013,"furniture"));
        testR.auctionHouses.get(0).addItem(new Item(1,"buyer_268",122.61,1975,"furniture"));
        testR.auctionHouses.get(1).addItem(item1);
        testR.auctionHouses.get(0).addItem(new Item(3,"buyer_112",29.55,1988,"furniture"));
        testR.auctionHouses.get(1).addItem(new Item(4,"buyer_953",49.65,1985,"painting"));
        testR.auctionHouses.get(1).addItem(new Item(5,"buyer_931",73.35,1988,"sculpture"));
        testR.auctionHouses.get(0).addItem(new Item(6,"buyer_294",48.18,2010,"painting"));
        testR.auctionHouses.get(0).addItem(item2);
        testR.auctionHouses.get(1).addItem(new Item(8,"buyer_763",120.45,1991,"painting"));
        testR.auctionHouses.get(0).addItem(new Item(9,"buyer_402",104.53,1990,"furniture"));



        //testing highestPrice method
        System.out.println("highestPrice method works = " + (testR.highestPrice().getLotNumber() == 7));
        System.out.println("Answer should be item with lot number 7");
        System.out.println("Actual answer: " + testR.highestPrice().getLotNumber());
        System.out.println("---------------");

        //testing highestAvPrice method
        System.out.println("highestAvPrice method works = " + (testR.highestAvPrice(1988).getAuctionHouseName() == "House 1"));
        System.out.println("in year 1988, answer should be auction house 1");
        System.out.println("Actual answer: " + testR.highestAvPrice(1988).getAuctionHouseName());
        System.out.println("---------------");

        //testing priceGreaterThan method
        List<Item> items = new ArrayList<>();
        items.add(item2);
        items.add(item1);
        System.out.println("allPriceGreaterThan method works = " + (testR.allPriceGreaterThan(123).equals(items)));
        System.out.println("answer should be items with lot number 7 and 2");
        System.out.println("Actual answer: " + testR.allPriceGreaterThan(123));
        System.out.println("---------------");

        Reporting testR2 = new Reporting();
        testR2.addAuctionHouse(new AuctionHouse("House 1"));
        testR2.auctionHouses.get(0).addItem(new Item(4,"buyer_953",49.65,1985,"painting"));
        testR2.auctionHouses.get(0).addItem(new Item(5,"buyer_931",73.35,1988,"sculpture"));
        testR2.auctionHouses.get(0).addItem(new Item(6,"buyer_294",48.18,2010,"painting"));

        //testing highestPricedItem
        System.out.println("Items ");
    }


}