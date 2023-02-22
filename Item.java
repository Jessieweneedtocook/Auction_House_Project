/**
 * This class represents an item being stored in an auction house. contains methods and retrieve and set data about the item
 *
 * @author Jessie Smith
 */
public class Item {

    
    // define item fields
    private int lotNumber;

    private String nameOfBuyer;

    private double priceSold;

    private int yearSold;

    private String itemType;

    // define item get methods
    public int getLotNumber(){
        return lotNumber;
    }

    public String getNameOfBuyer(){
        return nameOfBuyer;
    }

    public double getPriceSold(){
        return priceSold;
    }

    public int getYearSold(){
        return yearSold;
    }

    public String getItemType(){
        return itemType;
    }

    // define item set methods
    public void setLotNumber(int lotNumber){
        this.lotNumber = lotNumber;
    }

    public void setNameOfBuyer(String nameOfBuyer){
        this.nameOfBuyer = nameOfBuyer;
    }

    public void setPriceSold(double priceSold){
        this.priceSold = priceSold;
    }

    public void setYearSold(int yearSold){
        this.yearSold = yearSold;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    // define item constructor
    /**
     * Constructor method for Item class sets up all internal fields of an item object.
     * @param lotNumber represents the items lot number
     * @param nameOfBuyer represents the name of the items buyer
     * @param priceSold represent the price the item was sold for
     * @param yearSold represents the year the item was sold
     * @param itemType represents the type of item being sold
     */
    public Item(int lotNumber, String nameOfBuyer, double priceSold, int yearSold, String itemType) {
        this.lotNumber = lotNumber;
        this.nameOfBuyer = nameOfBuyer;
        this.priceSold = priceSold;
        this.yearSold = yearSold;
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "lotNumber=" + lotNumber +
                ", nameOfBuyer='" + nameOfBuyer + '\'' +
                ", priceSold=" + priceSold +
                ", yearSold=" + yearSold +
                ", itemType='" + itemType + '\'' +
                '}';
    }
}
