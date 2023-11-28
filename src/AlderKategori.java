import java.util.InputMismatchException;
import java.util.Scanner;

    public class AlderKategori {
        public static String kategoriserSvømmer(int alder) {
            if (alder <= 17) {
                return "Junior";
            } else if (alder <= 65) {
                return "ung";
            } else {
                return "Senior 65+";
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("Indtast alderen: ");
                    int alderSvømmer = scanner.nextInt();

                    if (alderSvømmer == 9) {
                        System.out.println("Programmet afsluttes");
                        break;
                    }

                    System.out.println("Svømmeren er i kategorien: " + kategoriserSvømmer(alderSvømmer));
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: indtast et tal. ");
                    scanner.nextLine();
                }
            }
        }
    }