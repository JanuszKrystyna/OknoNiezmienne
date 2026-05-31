import javax.swing.*;

public class OknoNiezmienne {
    public static void main(String[] args) {

        JFrame okno = new JFrame("Okno stałe");

        okno.setVisible(true);

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.setSize(600, 400);

        okno.setResizable(false);

        okno.setLocation(50,50);

    }
}


/* Zadanie 2: OknoNiezmienne.
        Utwórz ramkę, która ma tytuł "Okno stałe" i ustaw jej właściwość resizable na false, tak
aby użytkownik nie mógł zmienić jej rozmiaru. Użyj metody setLocation(50, 50), aby
umieścić okno w lewym górnym rogu ekranu, lekko odsunięte. */