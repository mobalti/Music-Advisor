package advisor;

import java.util.Scanner;

public class Advisor {

    public void start() {
        Service service = new Service();
        View printPage = new View(Main.PAGE);
        Scanner scanner = new Scanner(System.in);
        String input;
        String option;


        while (true) {
            input  = scanner.nextLine();
            option = input.split(" ")[0];

            switch (option) {
                case ("auth"):
                    service.setAuthorization();
                    break;
                case ("new"):
                    printPage.print(service.getReleases());
                    break;
                case ("featured"):
                    printPage.print(service.getFeatured());
                    break;
                case ("categories"):
                    printPage.print(service.getCategories());
                    break;
                case ("playlists"):
                    String category = input.split(" ",2)[1];
                    printPage.print(service.getPlaylists(category));
                    break;
                case ("next"):
                    printPage.printNext();
                    break;
                case ("prev"):
                    printPage.printPrev();
                    break;
                case ("exit"):
                    System.out.println("---GOODBYE!---");
                    System.exit(0);
                    break;
            }
        }
    }
}