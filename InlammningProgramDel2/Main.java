package InlammningProgramDel2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogikKlass logik = new LogikKlass();

        System.out.println("Skriv in text, skriv 'stop' och tryck enter för att avsluta:");

        while (true) {
            String input = scanner.nextLine();
            if (logik.raknaRad(input)) {
                break;
            }
        }

        System.out.println("Antal rader: " + logik.getAntalRader());
        System.out.println("Antal tecken: " + logik.getAntalTecken());
        System.out.println("Antal ord: " + logik.getAntalOrd());
        System.out.println("Längsta ordet är: " + logik.getLangstaOrd());

        scanner.close();
    }
}


