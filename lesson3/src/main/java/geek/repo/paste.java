package geek.repo;

import geek.AppleProduct;

public class paste implements AppleProduct {
    final private static String Name = "Сок";
    private float weight = 1.8f;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
