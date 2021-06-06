package geek.createProduct;

import geek.AppleProduct;
import geek.AppleProductCreator;
import geek.repo.crisps;

public class crispsCreator extends AppleProductCreator {
    @Override
    public AppleProduct getAppleProduct() {
        return new crisps();
    }
}
