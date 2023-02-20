import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {

    // define item fields
    private String auctionHouseName;

    private List<Item> auctionHouseItems = new ArrayList<>();


    // define item get method
    public String getAuctionHouseName(){
        return auctionHouseName;
    }

    // define item set method
    public void setAuctionHouseName(String auctionHouseName){
        this.auctionHouseName = auctionHouseName;
    }

    // method for adding item to list of items in auction house
    public void addItem(Item i){
        auctionHouseItems.add(i);
    }

    // method returns item sold for maximum price in the auction house
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
    public List<Item> priceGreaterThan(double price) {
        List<Item> greaterThan = new ArrayList<>();
        for (Item i: auctionHouseItems) {
            if (i.getPriceSold() > price)
                greaterThan.add(i);
        }
        return greaterThan;
    }

    // defined AuctionHouse constructor method
    public AuctionHouse(String auctionHouseName, List auctionHouseItems) {
        this.auctionHouseName = auctionHouseName;
        this.auctionHouseItems = auctionHouseItems;
    }
}
