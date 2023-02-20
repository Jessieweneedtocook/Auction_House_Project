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
                    break;
                case 3:
                    break;
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
