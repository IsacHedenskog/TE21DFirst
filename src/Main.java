/*
Todo: Hur ska hänga gubbe fungera?
    * Ha ett ord
     - Statiskt?
     - Random från lista?
     - Input
    * Användare matar in bokstav
     - kolla att användaren matar in en bokstav
    * Kolla om bokstaven finns i ordet
     - finns det flera instanser
    * Kolla vart bokstaven är
     - skriv ut bokstav
    * Ha koll på liv
    * Loopa tills klart
     - slut på liv
     - tills rätt ord

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hej och välkommen till hänga gubbe!");
        // howInputAndOutputWorks();

    }

    public static void howInputAndOutputWorks(){
        Scanner myScan= new Scanner(System.in);
        String input= myScan.nextLine();

        System.out.println("Min input var " + input);
    }
}


// single comment
/*
multiple
comments
 */