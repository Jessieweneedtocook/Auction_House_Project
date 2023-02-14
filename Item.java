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
    public Item(int lotNumber, String nameOfBuyer, double priceSold, int yearSold, String itemType) {
        this.lotNumber = lotNumber;
        this.nameOfBuyer = nameOfBuyer;
        this.priceSold = priceSold;
        this.yearSold = yearSold;
        this.itemType = itemType;
    }
}
