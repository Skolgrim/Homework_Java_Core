package Lesson_03;

public class Main {
    public static void main (String[] args) {
        Apple[] apples = new Apple[10];
        Orange[] oranges = new Orange[10];

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Box<Apple> appleBox = new Box<>(apples);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Box<Orange> orangeBox = new Box<>(oranges);

        apples[0] = apple1;
        apples[1] = apple1;
        apples[2] = apple1;
        apples[3] = apple1;
        apples[4] = apple1;
        apples[5] = apple1;

        oranges[0] = orange1;
        oranges[1] = orange1;
        oranges[2] = orange1;
        oranges[3] = orange1;
        oranges[4] = orange1;
        oranges[5] = orange1;
        oranges[6] = orange1;

        System.out.println("Вес коробки яблок: " + appleBox.getWeight());
        System.out.println("Вес коробки апельсинов: " + orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox));

    }
}
