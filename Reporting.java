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

        Item maxPriceItem = auctionHouses.get(0).highestPriceItem();
        for (AuctionHouse a: auctionHouses) {
            if (a.highestPriceItem().getPriceSold() > maxPriceItem.getPriceSold())
                maxPriceItem = a.highestPriceItem();
        }
        return maxPriceItem;
    }

    public AuctionHouse highestAvPrice(){
        if  (auctionHouses.isEmpty())
            return null;

        AuctionHouse maxAvPrice = auctionHouses.get(0);
        for (AuctionHouse a: auctionHouses) {
            if (a.avItemPrice() > maxAvPrice.avItemPrice())
                maxAvPrice = a;
        }
        return maxAvPrice;
    }


}
