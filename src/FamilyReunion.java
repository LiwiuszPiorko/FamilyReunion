import java.util.Arrays;
import java.util.Scanner;


public class FamilyReunion {
    public static void main(String[] args) {

        String[] familyReunion = new String[3];
        Scanner imiona = new Scanner(System.in);
        System.out.println("Wpisz imię członków rodziny i ich wiek: ");
        for (int i = 0; i < familyReunion.length; i++)
            familyReunion[i] = imiona.nextLine();
        {
            if (imiona.nextLine().equals(imiona)) {
                System.out.println("Tego członka rodziny już wpisałeś. Podaj imie i wiek jeszcze raz: ");
            } else {
                String arrayFamilyReunion = Arrays.toString(familyReunion);
                System.out.println(arrayFamilyReunion);
            }
        }
    }
}
