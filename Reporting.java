import java.util.ArrayList;
import java.util.List;

public class Reporting {

    private List<AuctionHouse> auctionHouses = new ArrayList<>();

    public void addAuctionHouse(AuctionHouse a) {
        auctionHouses.add(a);
    }

    public Item highestPrice(){
        if  (auctionHouses.isEmpty())
            return null;

        Item maxPrice = auctionHouses.get(0).highestPriceItem();
        for (AuctionHouse a: auctionHouses) {
            if (a.highestPriceItem().getPriceSold() > maxPrice.getPriceSold())
                maxPrice = a.highestPriceItem();
        }
        return maxPrice;
    }


}
