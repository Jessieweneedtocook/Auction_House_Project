import java.util.ArrayList;
import java.util.List;

public class Reporting {

    // defined list of all auctionHouses
    private List<AuctionHouse> auctionHouses = new ArrayList<>();

    // method that adds auction house to auctionHouses List
    public void addAuctionHouse(AuctionHouse a) {
        auctionHouses.add(a);
    }

    // method that returns the highest prices item across all the auction houses
    public Item highestPrice(){
        if  (auctionHouses.isEmpty())
            return null;

        Item maxPriceItem = auctionHouses.get(0).highestPriceItem();
        for (AuctionHouse a: auctionHouses) {
            if (a.highestPriceItem().getPriceSold() > maxPriceItem.getPriceSold())
                maxPriceItem = a.highestPriceItem();
        }
        return maxPriceItem;
    }

    // method that returns the auction house with the highest average price in a given year
    public AuctionHouse highestAvPrice(int year){
        if  (auctionHouses.isEmpty())
            return null;

        AuctionHouse maxAvPrice = auctionHouses.get(0);
        for (AuctionHouse a: auctionHouses) {
            if (a.avItemPrice(year) > maxAvPrice.avItemPrice(year))
                maxAvPrice = a;
        }
        return maxAvPrice;
    }

    // method that returns a list of all items with a price greater than a given value
    public List<Item> allPriceGreaterThan(double price){
        List<Item> greaterThan = new ArrayList<>();
        for (AuctionHouse a: auctionHouses) {
            greaterThan.addAll(a.priceGreaterThan(price));
        }
        return greaterThan;
    }

}
