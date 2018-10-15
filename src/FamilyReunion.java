import java.util.Scanner;
import java.util.Arrays;


public class FamilyReunion {
    public static void main(String[] args) {


        FamilyMember[] familyReunion = new FamilyMember[3];
        for (int i = 0; i < familyReunion.length; i++) {
            System.out.println("Podaj dane: ");
            familyReunion[i] = createFamilyMember();

            for (int j = 0; j < familyReunion.length; j++) {
                if (familyReunion[j].equals(familyReunion[i])) {
                    System.out.println("Podałeś już dane tego członka rodziny. Podaj dane innego.");
                    i--;
                }
            }
        }

        String reunion = Arrays.toString(familyReunion);
        System.out.println(reunion);
    }

    static FamilyMember createFamilyMember() {
        Scanner family = new Scanner(System.in);
        FamilyMember familyMember = new FamilyMember();
        System.out.println("\nPodaj imię członka rodziny: ");
        familyMember.setName(family.nextLine());
        System.out.println("Podaj wiek członka rodziny: ");
        familyMember.setAge(family.nextInt());
        return familyMember;
    }
}












