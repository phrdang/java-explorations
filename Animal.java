public class Animal {
    // instance fields
    String animalName;
    int animalAge;
    String animalSpecies;
    
    // constructor method
    public Animal (String name, int age, String species) {
        animalName = name;
        animalAge = age;
        animalSpecies = species;
    }
    
    // main method
    public static void main(String args[]){
        Animal zackTheZebra = new Animal("Zack", 10, "zebra");
        System.out.println("Name: " + zackTheZebra.animalName);
        System.out.println("Age: " + zackTheZebra.animalAge);
        System.out.println("Species: " + zackTheZebra.animalSpecies);
    }
}