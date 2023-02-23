import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a system that reports on all auction houses and their data
 *
 * @author Jessie Smith
 */
public class Reporting {

    // defined list of all auctionHouses
    public List<AuctionHouse> auctionHouses = new ArrayList<>();

    // method that adds auction house to auctionHouses List
    public void addAuctionHouse(AuctionHouse a) {
        auctionHouses.add(a);
    }

    // method that returns the highest prices item across all the auction houses
    /**
     * Method that returns the highest priced item across all auction house items
     * @return returns the highest priced item of all items in all auction houses
     */
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
    /**
     * Method which returns the auction house with the highest average price in a given year.
     * @param year is the year the auction house with the highest average price is being calculated
     * @return returns the auction house with the highest average price
     */
    public AuctionHouse highestAvPrice(int year){
        int count = 0;
        for (AuctionHouse a: auctionHouses) {
            for (Item i: a.auctionHouseItems) {
                if (i.getYearSold() == year)
                    count += 1;
            }
        }
        if (count == 0)
            return null;


        AuctionHouse maxAvPrice = auctionHouses.get(0);
        for (AuctionHouse a: auctionHouses) {
            if (a.avItemPrice(year) > maxAvPrice.avItemPrice(year))
                maxAvPrice = a;
        }
        return maxAvPrice;
    }

    // method that returns a list of all items with a price greater than a given value
    /**
     * Method that returns a list items with a price greater than a given value across all auction houses
     * @param price is the price all items on the returned list must be greater than
     * @return returns a list of items across all auction houses with a price greater than a given value
     */
    public List<Item> allPriceGreaterThan(double price){
        List<Item> greaterThan = new ArrayList<>();
        for (AuctionHouse a: auctionHouses) {
            greaterThan.addAll(a.priceGreaterThan(price));
        }
        return greaterThan;
    }

}
