import java.util.Scanner;

public class ReportingIO {
    public void menu() {
        Scanner s = new Scanner(System.in);
        Reporting r = new Reporting();
        boolean quit = false;
        while (!quit) {
            System.out.println("Menu");
            System.out.println("---------------");
            System.out.println("Option 1: Enter house data");
            System.out.println("Option 2: Enter item data");
            System.out.println("Option 3: Provide reporting data");
            System.out.println("Exit");
            int i = s.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Auction house name: ");
                    String auctionHouseName = s.nextLine();
                    AuctionHouse auctionHouse = new AuctionHouse(auctionHouseName);
                    r.addAuctionHouse(auctionHouse);
                    System.out.println("Auction house " + auctionHouseName + " was added to report.");

                case 2:
                    System.out.println("Item lot number: ");
                    int lotNumber = s.nextInt();
                    System.out.println("Name of buyer: ");
                    String nameOfBuyer = s.nextLine();
                    System.out.println("Item selling price: ");
                    double priceSold = s.nextDouble();
                    System.out.println("year sold: ");
                    int yearSold = s.nextInt();
                    System.out.println("Item type (piece of furniture, a painting or a sculpture): ");
                    String itemType = s.nextLine();
                    System.out.println("Auction houses: ");
                    int counter = 1;
                    for (AuctionHouse a: r.auctionHouses) {
                        System.out.println(counter + ". " + a.getAuctionHouseName());
                    }
                    System.out.println("Number of auction house to place item: ");
                    int houseNumber = s.nextInt();
                    Item item = new Item(lotNumber, nameOfBuyer, priceSold, yearSold, itemType);
                    int index = counter - 1;
                    AuctionHouse a = r.auctionHouses.get(index);
                    a.addItem(item);

                case 3:

                case 4:

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
    public static void main(String[] args) {

    }
}
