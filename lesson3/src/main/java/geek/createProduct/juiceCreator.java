package geek.createProduct;

import geek.AppleProduct;
import geek.AppleProductCreator;
import geek.repo.juice;

public class juiceCreator extends AppleProductCreator {
    @Override
    public AppleProduct getAppleProduct() {
        return new juice();
    }
}
