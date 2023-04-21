package interfacee.animal.edible.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gà gáy sáng le te le te rồi ai ơi";
    }

    @Override
    public String howToEat() {
        return "Gà Chiên KFC ngon ơi là ngon ♥♥♥";
    }
}
