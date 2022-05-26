package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new TreeSet<>();

         String reservationNumber = scanner.nextLine();

         while (!reservationNumber.equals("PARTY")){
             guests.add(reservationNumber);


             reservationNumber = scanner.nextLine();
         }
         String gestReservation = scanner.nextLine();
         while (!gestReservation.equals("END")){
             guests.remove(gestReservation);



             gestReservation = scanner.nextLine();
         }
        System.out.println(guests.size());

        System.out.println(String.join(System.lineSeparator(),guests));


    }
}
