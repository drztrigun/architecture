package geek.createProduct;

import geek.AppleProduct;
import geek.AppleProductCreator;
import geek.repo.paste;

public class pasteCreator extends AppleProductCreator {
    @Override
    public AppleProduct getAppleProduct() {
        return new paste();
    }
}
