import BeingsOfEarth.Dog;
import BeingsOfEarth.Human;
import Creator.LivingBeingCreator;
import SkyBeings.Bird;

public class Main {
    public static void main(String[] args){
        Human LuisCarlos = new Human();
        Dog Lucas = new Dog();
        LuisCarlos.changeDimension();
        // Lucas.changeDimension(); // Lucas is a dog, it couldn't travel across dimentions!
        Bird Piolin = new Bird();
        Piolin.changeDimension();
        Piolin.respawn();
        LivingBeingCreator creator = new LivingBeingCreator();
        creator.createLivingBeings();
    }
}
