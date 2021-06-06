package geek.repo;

import geek.AppleProduct;

public class crisps implements AppleProduct {
    final private static String Name = "Чипсы";
    private float weight = 1.5f;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
