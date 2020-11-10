public class Earth {
    
    public static void main(String[] args) {
        
        Human tom;

        tom = new Human("Tom", "brown", 72, 5);
        // tom.age = 5;
        // tom.eyeColor = "brown";
        // tom.heightInInches = 72;
        // tom.name = "Tom Aflac";
        tom.speak();

        System.out.println("  ");


        Human jacob = new Human("Jacob Hensley", "green", 72, 25);
        // jacob.age = 25;
        // jacob.eyeColor = "green";
        // jacob.heightInInches = 72;
        // jacob.name = "Jacob Hensley";
        jacob.speak();

    }
}