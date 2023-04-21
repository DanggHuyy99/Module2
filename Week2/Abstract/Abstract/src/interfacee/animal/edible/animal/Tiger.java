package interfacee.animal.edible.animal;

import interfacee.animal.edible.animal.Animal;
import interfacee.animal.edible.animal.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: Hổ gầm vang dội đất trời";
    }

    @Override
    public String howToEat() {
        return "Thịt hổ gác bếp hết xẩy con bà Bảy ♥♥";
    }
}
