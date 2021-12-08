package ConsoleUI;

import Controller.ItemController;


public class SearchForItemsMenu implements Menu{

    //private Item currentItem = null;

    @Override
    public void runMenu() {
        searchForItemsMenu();
    }

    private void searchForItemsMenu(){

        writeSearchForItemsMenu();

        while (true) {
            int choice = Menu.getIntegerFromUser();
            switch (choice) {
                // TODO
                case 1 -> {
                    searchQuery();
                    System.out.println(new ItemController().getSearchedItems());
                    writeSearchForItemsMenu();
                }
                case 2 -> Menu.goToCreateOrderMenu();
                case 3 -> Menu.goToMainMenu();
                case 0 -> {
                    System.out.println("Closing Application");
                    System.exit(0);
                }
                default -> System.out.println("Invalid input: " + choice);
            }
        }
    }

    private void searchQuery(){
        System.out.println("Type in the name of the item:");
        String searched = Menu.getStringFromUser();
        new ItemController().searchForItem(searched);

    }

    private void writeSearchForItemsMenu() {
        System.out.println("****** Search for Items ******");
        System.out.println(" (1) New search");
        System.out.println(" (2) Back to Create Order menu");
        System.out.println(" (3) Back to Main Menu");
        System.out.println(" (0) Close Application");
        System.out.print("\n Choice:");
    }


}
