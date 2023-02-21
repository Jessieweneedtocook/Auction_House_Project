public class TestFile {

    public void test() {
        Reporting r = new Reporting();
        r.addAuctionHouse(new AuctionHouse("House 0"));
        r.addAuctionHouse(new AuctionHouse("House 1"));
        r.addAuctionHouse(new AuctionHouse("House 2"));
        r.addAuctionHouse(new AuctionHouse("House 3"));
        r.addAuctionHouse(new AuctionHouse("House 4"));

        r.auctionHouses.get(2).addItem(new Item(0,"buyer_474",99.9,2013,"furniture"));
        r.auctionHouses.get(2).addItem(new Item(1,"buyer_268",122.61,1975,"furniture"));
        r.auctionHouses.get(1).addItem(new Item(2,"buyer_515",177.04,1988,"furniture"));
        r.auctionHouses.get(2).addItem(new Item(3,"buyer_112",29.55,1983,"furniture"));
        r.auctionHouses.get(2).addItem(new Item(4,"buyer_953",49.65,1985,"painting"));
        r.auctionHouses.get(2).addItem(new Item(5,"buyer_931",73.35,1988,"sculpture"));
        r.auctionHouses.get(0).addItem(new Item(6,"buyer_294",48.18,2010,"painting"));
        r.auctionHouses.get(3).addItem(new Item(7,"buyer_814",191.41,2015,"painting"));
        r.auctionHouses.get(1).addItem(new Item(8,"buyer_763",120.45,1991,"painting"));
        r.auctionHouses.get(0).addItem(new Item(9,"buyer_402",104.53,1990,"furniture"));
        r.auctionHouses.get(3).addItem(new Item(10,"buyer_234",152.97,1983,"sculpture"));
        r.auctionHouses.get(4).addItem(new Item(11,"buyer_373",118.54,1996,"sculpture"));
        r.auctionHouses.get(2).addItem(new Item(12,"buyer_17",173.48,1998,"furniture"));
        r.auctionHouses.get(3).addItem(new Item(13,"buyer_860",156.91,1988,"painting"));
        r.auctionHouses.get(4).addItem(new Item(14,"buyer_665",55.24,1973,"sculpture"));
        r.auctionHouses.get(4).addItem(new Item(15,"buyer_849",180.3,1971,"painting"));
        r.auctionHouses.get(3).addItem(new Item(16,"buyer_493",167.47,2013,"furniture"));
        r.auctionHouses.get(0).addItem(new Item(17,"buyer_959",27.75,2013,"painting"));
        r.auctionHouses.get(3).addItem(new Item(18,"buyer_712",129.45,1993,"sculpture"));
        r.auctionHouses.get(2).addItem(new Item(19,"buyer_540",109.84,1979,"painting"));
        r.auctionHouses.get(4).addItem(new Item(20,"buyer_560",194.19,2003,"sculpture"));
        r.auctionHouses.get(3).addItem(new Item(21,"buyer_927",37.76,1983,"sculpture"));
        r.auctionHouses.get(0).addItem(new Item(22,"buyer_256",141.29,1993,"painting"));
        r.auctionHouses.get(0).addItem(new Item(23,"buyer_222",57.25,1995,"furniture"));
        r.auctionHouses.get(4).addItem(new Item(24,"buyer_336",152.35,2021,"painting"));


    }


}