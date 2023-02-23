import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an auction house used to store items to be sold. Contains methods which allow statistics on item data within auction house to be retrieved.
 *
 * @author Jessie
 */
public class AuctionHouse {

    // define item fields
    private String auctionHouseName;
    public List<Item> auctionHouseItems = new ArrayList<>();


    // define item get method
    public String getAuctionHouseName(){
        return auctionHouseName;
    }

    // define item set method
    public void setAuctionHouseName(String auctionHouseName){
        this.auctionHouseName = auctionHouseName;
    }

    // method for adding item to list of items in auction house
    /**
     * Method allows an items to be added to an auction house
     * @param i represents the item being added to the auction house
     */
    public void addItem(Item i){
        auctionHouseItems.add(i);
    }

    // method returns item sold for maximum price in the auction house

    /**
     * Method returns the item sold for the highest price in the auction house
     * @return returns item with the highest price
     */
    public Item highestPriceItem(){

        if  (auctionHouseItems.isEmpty())
            return null;
        Item maxPrice = auctionHouseItems.get(0);

        for (Item i: auctionHouseItems) {
            if (maxPrice.getPriceSold() < i.getPriceSold())
                maxPrice = i;
        }
        return maxPrice;
    }

    // method returns the average price of items in the auction house for a given year
    /**
     * Method return the average item price in the auction house in a given year
     * @param year represents the year the average item price is being calculated for
     * @return returns the average item price in a given year
     */
    public double avItemPrice(int year){
        double total = 0;
        int counter = 0;
        for (Item i: auctionHouseItems) {
            if (i.getYearSold() == year) {
                total = total + i.getPriceSold();
                counter += 1;
            }
        }
        double avPrice = total / counter;
        return avPrice;
    }

    // method returns list of items with a price greater than a given value (price)
    /**
     * Method returns a list of items with a price greater than a given value
     * @param price represents the price the items in the returned list must be greater than
     * @return returns a list of items with a price greater than a given value
     */
    public List<Item> priceGreaterThan(double price) {
        List<Item> greaterThan = new ArrayList<>();
        for (Item i: auctionHouseItems) {
            if (i.getPriceSold() > price)
                greaterThan.add(i);
        }
        return greaterThan;
    }

    // defined AuctionHouse constructor method

    /**
     * Constructor method for AuctionHouse class sets up all internal fields of an auction house object.
     * @param auctionHouseName represents the name of the auction house.
     */
    public AuctionHouse(String auctionHouseName) {
        this.auctionHouseName = auctionHouseName;
    }
}
