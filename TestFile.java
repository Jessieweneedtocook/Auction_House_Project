import java.util.ArrayList;
import java.util.List;

public class TestFile {

    public static void main(String[] args) {

        Reporting testR = new Reporting();
        testR.addAuctionHouse(new AuctionHouse("House 0"));
        testR.addAuctionHouse(new AuctionHouse("House 1"));

        Item item1 = new Item(2, "buyer_515", 177.04, 1988, "furniture");
        Item item2 = new Item(7, "buyer_814", 191.41, 2015, "painting");
        testR.auctionHouses.get(1).addItem(new Item(0, "buyer_474", 99.9, 2013, "furniture"));
        testR.auctionHouses.get(0).addItem(new Item(1, "buyer_268", 122.61, 1975, "furniture"));
        testR.auctionHouses.get(1).addItem(item1);
        testR.auctionHouses.get(0).addItem(new Item(3, "buyer_112", 29.55, 1988, "furniture"));
        testR.auctionHouses.get(1).addItem(new Item(4, "buyer_953", 49.65, 1985, "painting"));
        testR.auctionHouses.get(1).addItem(new Item(5, "buyer_931", 73.35, 1988, "sculpture"));
        testR.auctionHouses.get(0).addItem(new Item(6, "buyer_294", 48.18, 2010, "painting"));
        testR.auctionHouses.get(0).addItem(item2);
        testR.auctionHouses.get(1).addItem(new Item(8, "buyer_763", 120.45, 1991, "painting"));
        testR.auctionHouses.get(0).addItem(new Item(9, "buyer_402", 104.53, 1990, "furniture"));


        //testing highestPrice method
        System.out.println("highestPrice method works = " + (testR.highestPrice().getLotNumber() == 7));
        System.out.println("Answer should be item with lot number 7");
        System.out.println("Actual answer: " + testR.highestPrice().getLotNumber());
        System.out.println("---------------");

        //testing highestAvPrice method
        System.out.println("highestAvPrice method works = " + (testR.highestAvPrice(1988).getAuctionHouseName() == "House 1"));
        System.out.println("In year 1988, answer should be auction house 1");
        System.out.println("Actual answer: " + testR.highestAvPrice(1988).getAuctionHouseName());
        System.out.println("---------------");

        //testing priceGreaterThan method
        List<Item> itemsRep = new ArrayList<>();
        itemsRep.add(item2);
        itemsRep.add(item1);
        System.out.println("allPriceGreaterThan method works = " + (testR.allPriceGreaterThan(123).equals(itemsRep)));
        System.out.println("For price > 123, answer should be items with lot number 7 and 2");
        System.out.println("Actual answer: " + testR.allPriceGreaterThan(123));
        System.out.println("---------------");

        AuctionHouse testHouse = new AuctionHouse("House 1");
        Item item3 = new Item(5, "buyer_931", 73.35, 1988, "sculpture");
        testHouse.addItem(new Item(4, "buyer_953", 49.65, 1988, "painting"));
        testHouse.addItem(item3);
        testHouse.addItem(new Item(6, "buyer_294", 48.18, 2010, "painting"));

        //testing highestPricedItem method
        System.out.println("highestPricedItem method works = " + (testHouse.highestPriceItem().getLotNumber() == 5));
        System.out.println("Answer should be item with lot number 5");
        System.out.println("Actual answer: " + testHouse.highestPriceItem());
        System.out.println("---------------");

        //test avItemPrice method
        System.out.println("avItemPrice method works = " + (testHouse.avItemPrice(1988) == 61.5));
        System.out.println("Answer should be £61.5");
        System.out.println("Actual answer: " + testHouse.avItemPrice(1988));
        System.out.println("---------------");

        //test priceGreaterThan method
        List<Item> itemAuc = new ArrayList<>();
        itemAuc.add(item3);
        System.out.println("priceGreaterThan method works = " + (testHouse.priceGreaterThan(70).equals(itemAuc)));
        System.out.println("for price > 70, answer should be an item with lot number 5");
        System.out.println("Actual answer: " + testHouse.priceGreaterThan(70));
        System.out.println("---------------");

    }
    }


