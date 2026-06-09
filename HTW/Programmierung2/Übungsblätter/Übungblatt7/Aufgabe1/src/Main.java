import java.util.Scanner;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("*****Inventar Verwaltung******");
            System.out.println("-------------------------------");
            System.out.println("1. Produkt hinzufügen ");
            System.out.println("2. Produkt entfernen ");
            System.out.println("3. Produkt nach ID suchen ");
            System.out.println("4. Produkt nach Kategorie anzeigen ");
            System.out.println("5. Alle Produkte anzeigen ");
            System.out.println("6. Produkte nach Namen sortieren ");
            System.out.println("7. Produkt nach Preis sortieren ");
            System.out.println("8. Produkte mit niedrigen Lagerbeständen anzeigen ");
            System.out.println("9. Produkte nach benutzerdefiniertem Filter anzeigen ");
            System.out.println("10. Preise aller Produkte um einen Prozentsatz erhöhen ");
            System.out.println("11. Programm beenden ");
            System.out.println("Bitte geüwnsche Aktion wählen: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ProductID: ");
                    int productId = input.nextInt();
                    System.out.print("Name: ");
                    String name = input.next();
                    System.out.print("Categorie: ");
                    String category = input.next();
                    System.out.print("Price: ");
                    double price = input.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = input.nextInt();

                    Product product = new Product();
                    product.setProductId(productId);
                    product.setName(name);
                    product.setCategory(category);
                    product.setPrice(price);
                    product.setQuantity(quantity);
                    inventory.addProduct(product);
                    break;

                case 2:
                    System.out.print("Geben sie die ProductID ein von dem Produkt, welches sie entfernen wollen: ");
                    int productId2 = input.nextInt();
                    System.out.println(inventory.removeProduct(productId2));
                    break;

                case 3:
                    System.out.print("Geben sie die ProductId ein von dem Produkt, welches sie finden wollen: ");
                    int productId3 = input.nextInt();
                    System.out.println(inventory.findProductById(productId3));
                    break;

                case 4:
                    System.out.print("Welche Produkt Kategorie suchen sie?: ");
                    String categorie2 = input.next();
                    System.out.println(inventory.findProductsByCategory(categorie2));
                    break;

                case 5:
                    System.out.println(inventory.getAllProducts());
                    break;

                case 6:
                    System.out.println(inventory.sortProductsByName());
                    break;

                case  7:
                    System.out.println(inventory.sortProductsByPrice());
                    break;

                case  8:
                    System.out.println("Was ist Ihre Quantitätsschwelle für den Bestand?: ");
                    int quantity2 = input.nextInt();
                    System.out.println(inventory.getLowStockProducts(quantity2));
                    break;

                case 9:
                    System.out.println("Welche Produkte möchten sie filtern?: ");
                    System.out.println("-------------------------------");
                    System.out.println("1. Preis größer als: ");
                    System.out.println("2. Preis kleiner als: ");
                    System.out.println("3. Bestand größer als: ");
                    System.out.println("4. Bestand kleiner als: ");

                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Preis größer als: ");
                            double price2 = input.nextDouble();
                            System.out.println(inventory.filterProducts(x-> x.getPrice() >= price2));
                            break;

                        case 2:
                            System.out.println("Preis kleiner als: ");
                            double price3 = input.nextDouble();
                            System.out.println(inventory.filterProducts(x-> x.getPrice() <= price3));
                            break;

                        case 3:
                            System.out.println("Bestand größer als: ");
                            int quantity3 = input.nextInt();
                            System.out.println(inventory.filterProducts(x-> x.getQuantity() >= quantity3));
                            break;

                        case 4:
                            System.out.println("9Bestand kleiner als: ");
                            int quantity4 = input.nextInt();
                            System.out.println(inventory.filterProducts(x-> x.getQuantity() <= quantity4));
                            break;

                    }
                    break;

                case 10:
                    System.out.println("Um welchen Prozentsatz wollen sie den Preis erhöhen?: ");
                    int percent = input.nextInt();
                    inventory.applyToProducts(x-> x.setPrice(x.getPrice() * (1.0 + percent / 100.0)));
                    System.out.println(inventory.getAllProducts());
                    break;

                case 11:
                    return;




            }


        }


    }

}



