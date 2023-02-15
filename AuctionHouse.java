import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {
    private String auctionHouseName;

    private List<Item> auctionHouseItems = new ArrayList<>();

    public String getAuctionHouseName(){
        return auctionHouseName;
    }

    public void setAuctionHouseName(String auctionHouseName){
        this.auctionHouseName = auctionHouseName;
    }

    public void addItem(Item i){
        auctionHouseItems.add(i);
    }

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

    public double avItemPrice(){
        double total = 0;
        for (Item i: auctionHouseItems) {
            total = total + i.getPriceSold();
        }
        double avPrice = total / auctionHouseItems.size();
        return avPrice;
    }

    public List priceGreaterThan(double price) {
        List<Item> greaterThan = new ArrayList<>();
        for (Item i: auctionHouseItems) {
            if (i.getPriceSold() > price)
                greaterThan.add(i);
        }
        return greaterThan;
    }
    public AuctionHouse(String auctionHouseName, List auctionHouseItems) {
        this.auctionHouseName = auctionHouseName;
        this.auctionHouseItems = auctionHouseItems;
    }
}
