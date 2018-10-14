import java.util.Objects;
import java.util.Scanner;

public class FamilyMember {
    private String name;
    private int age;
    private Scanner family = new Scanner(System.in);
    public FamilyMember(){

    }

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyMember that = (FamilyMember) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "" +
                "imię='" + name + '\'' +
                ", wiek=" + age +
                "";
    }


}
