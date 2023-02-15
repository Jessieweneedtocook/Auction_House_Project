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

}
