package geek.repo;

import geek.AppleProduct;

public class juice implements AppleProduct {
    final private static String Name = "Пастила";
    private float weight = 10.5f;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
