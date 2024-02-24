package Abstraction;

public class Horse extends mammel {
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds hair in spring");
    }

    @Override
    public void makeNoise() {

    }
}
