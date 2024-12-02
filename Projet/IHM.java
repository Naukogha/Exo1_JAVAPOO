import java.util.Scanner;
import Person;
import Adress_book;


public class IHM{
    private final Scanner scanner;

    private Person person = new Person;
    private Adress_book adressBook = new Adress_book;

    public void startMenu() {
    while (true) {
        afficheMenuBase();
        String choix = scanner.nextLine();

        switch (choix) {
            case "1" -> addAnimal();
            case "2" -> addEnclos();
            case "3" -> animalInEnclos();
            case "4" -> readInEnclos();
            case "0" -> {
                System.out.println("Au revoir !!!");
                return; // ou break; ou System.exit(0); (termine l'application)
            }
            default -> System.out.println("Choix invalide !!!!");
            }
        }
    }

    public void afficheMenuBase() {
        System.out.println("1) Ajouter un contact");
        System.out.println("2) Lister les contacts");
        System.out.println("3) Quitter");
        System.out.print("Faite votre choix : ");
    }

}
