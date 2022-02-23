package Lesson_03;

public class Box <T extends Fruit> {
    private float totalWeight;
    private T[] list;

    public Box(T[] list) {
        this.list = list;
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T t : list) {
            if (t != null) {
                float weight = t.getWeight();
                totalWeight = totalWeight + weight;
            }
        }
        return totalWeight;
    }

    public Boolean compare (Box<? extends Fruit> box) {
        if (this.getWeight() == box.getWeight()) return true;
        return false;
    }
}
