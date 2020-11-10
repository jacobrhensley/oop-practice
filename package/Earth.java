public class Earth {
    
    public static void main(String[] args) {
        
        Human tom;

        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Aflac";
        tom.speak();


        Human jacob = new Human();
        jacob.age = 25;
        jacob.eyeColor = "green";
        jacob.heightInInches = 72;
        jacob.name = "Jacob Hensley";
        jacob.speak();

    }
}