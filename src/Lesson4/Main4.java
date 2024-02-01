package Lesson4;

public class Main4 {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> anotherOrangeBox = new Box();
        Box<Apple> appleBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();

        orangeBox.add(new Orange(1));
        System.out.println("orangeBox = " + orangeBox.getWeight());

        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(1));
        System.out.println("appleBox = " + appleBox.getWeight());

        goldenAppleBox.add(new GoldenApple(1));

        orangeBox.moveTo(anotherOrangeBox);
        System.out.println("anotherOrangeBox = " + anotherOrangeBox.getWeight());
        System.out.println("orangeBox = " + orangeBox.getWeight());


        goldenAppleBox.moveTo(appleBox);
        System.out.println("goldenAppleBox = " + goldenAppleBox.getWeight());
        System.out.println("appleBox = " + appleBox.getWeight());

        Box<Fruit> fruitBox = new Box<>();
        appleBox.moveTo(fruitBox);

        System.out.println("appleBox = " + appleBox.getWeight());
        System.out.println("fruitBox = " + fruitBox.getWeight());
    }
}