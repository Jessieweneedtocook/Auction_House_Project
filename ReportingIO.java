import java.util.List;
import java.util.Scanner;

/**
 * This class represents an interface for the user to input and view data on auction houses and items
 *
 * @author Jessie Smith
 */
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
            System.out.println("Option 4: Exit menu");
            while (!s.hasNextInt()) {
                System.out.println("Input is not an integer between 1 and 4.");
                System.out.println("Menu");
                System.out.println("---------------");
                System.out.println("Option 1: Enter house data");
                System.out.println("Option 2: Enter item data");
                System.out.println("Option 3: Provide reporting data");
                System.out.println("Option 4: Exit menu");
                s.nextLine();
            }
            int i = s.nextInt();
            s.nextLine();
            switch (i) {
                case 1 -> {
                    System.out.println("Auction house name: ");
                    String auctionHouseName = s.nextLine();
                    AuctionHouse auctionHouse = new AuctionHouse(auctionHouseName);
                    r.addAuctionHouse(auctionHouse);
                    System.out.println("Auction house " + auctionHouseName + " was added to report.");
                }
                case 2 -> {
                    if (r.auctionHouses.size() == 0) {
                        System.out.println("Currently no auction houses.");
                        break;
                    }
                    System.out.println("Item lot number: ");
                    while (!s.hasNextInt()) {
                        System.out.println("Lot number must be an integer value.");
                        System.out.println("Item lot number: ");
                        s.nextLine();
                    }
                    int lotNumber = s.nextInt();
                    s.nextLine();
                    System.out.println("Name of buyer: ");
                    String nameOfBuyer = s.nextLine();
                    System.out.println("Item selling price: ");
                    while (!s.hasNextDouble()) {
                        System.out.println("Price sold must be a decimal value.");
                        System.out.println("Item selling price: ");
                        s.nextLine();
                    }
                    double priceSold = s.nextDouble();
                    s.nextLine();
                    System.out.println("year sold: ");
                    while (!s.hasNextInt()) {
                        System.out.println("Year sold must be an integer value.");
                        System.out.println("Year sold: ");
                        s.nextLine();
                    }
                    int yearSold = s.nextInt();
                    s.nextLine();
                    System.out.println("Item type (piece of furniture, a painting or a sculpture): ");
                    String itemType = s.nextLine();
                    System.out.println("Auction houses: ");
                    int counter = 1;
                    for (AuctionHouse a : r.auctionHouses) {
                        System.out.println(counter + ". " + a.getAuctionHouseName());
                        counter += 1;
                    }
                    System.out.println("Number of auction house to place item: ");
                    int houseNumber = 0;
                    boolean houseNumCheck = true;
                    while (houseNumCheck) {
                        if (s.hasNextInt()) {
                            houseNumber = s.nextInt();
                            if (houseNumber < 1 || houseNumber > counter-1) {
                                System.out.println("Auction house number must be an integer between 1 and " + (counter-1));
                                System.out.println("Number of auction house to place item: ");
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            System.out.println("Auction house number must be an integer value.");
                            System.out.println("Number of auction house to place item: ");
                        }
                        s.nextLine();
                    }
                    s.nextLine();

                    Item item = new Item(lotNumber, nameOfBuyer, priceSold, yearSold, itemType);
                    int index = houseNumber - 1;
                    AuctionHouse a = r.auctionHouses.get(index);
                    a.addItem(item);
                }
                case 3 -> {
                    if (r.allPriceGreaterThan(0.0).size() == 0) {
                        System.out.println("No auction houses or items.");
                        break;
                    }

                    System.out.println("Auction house with highest average price in year: ");
                    int year = s.nextInt();
                    s.nextLine();
                    AuctionHouse maxAvInYear = r.highestAvPrice(year);
                    if (maxAvInYear == null) {
                        System.out.println("No items sold in year " + year);
                        break;
                    }

                    Item maxPriceItem = r.highestPrice();

                    System.out.println("items with a price greater than: ");
                    double greaterThan = s.nextDouble();
                    List<Item> pricesGreater = r.allPriceGreaterThan(greaterThan);
                    System.out.println("Reporting statistics: ");
                    System.out.println("---------------");
                    System.out.println("Auction house with highest average price in year " + year + " : ");
                    System.out.println(maxAvInYear.getAuctionHouseName());
                    System.out.println("---------------");
                    System.out.println("Item sold for highest price: \n" + maxPriceItem);
                    System.out.println("---------------");
                    System.out.println("All items with prices greater than: £" + greaterThan);
                    for (Item it : pricesGreater) {
                        System.out.println(it);
                    }
                    System.out.println("---------------");
                }
                case 4 -> {
                    System.out.println("Quitting menu");
                    quit = true;
                }
                default -> System.out.println("Invalid option, must enter number between 1 and 4.");
            }
        }

    }
    public static void main(String[] args) {

        ReportingIO consMenu = new ReportingIO();
        consMenu.menu();
    }
}
