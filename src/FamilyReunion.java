import java.util.Scanner;
import java.util.Arrays;

public class FamilyReunion {
    public static void main(String[] args) {

        FamilyMember[] familyReunion = new FamilyMember[3];
        Scanner family = new Scanner(System.in);
        System.out.println("Podaj imię członka rodziny");
        String name = family.nextLine();
        System.out.println("Podaj wiek członka rodziny");
        int age = family.nextInt();
        FamilyMember familyMember = new FamilyMember(name, age);

        for (int i=0; i < familyReunion.length; i++) {//co dalej???
            familyReunion[i]=family.
        String reunion = Arrays.toString(familyReunion);
        System.out.println(reunion);


    }

}






