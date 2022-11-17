import java.util.Arrays;

public class ArraysExercises {
    
    public static Person[] addPerson(Person[] peeps,Person morePeeps){
        Person[] peepArray = new Person[peeps.length + 1];
        peepArray[peeps.length] = morePeeps;
        return peepArray;
    }
    public static void main(String[] args) {
        Person[] gods = new Person[3];
        gods[0] = new Person("Zues");
        gods[1] = new Person("Apollo");
        gods[2] = new Person("Aries");

        for(int i = 0; i < gods.length; i++){
            System.out.println("bow before your god:" + gods[i].getName());
        }

    }
}
