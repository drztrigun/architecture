package geek;

import geek.createProduct.crispsCreator;
import geek.createProduct.juiceCreator;
import geek.createProduct.pasteCreator;

public class Application {

    public static void main(String[] args) {

        AppleProductCreator[] appleProductCreators = {
                new crispsCreator(),
                new juiceCreator(),
                new pasteCreator()
        };

        for (AppleProductCreator appleProductCreator : appleProductCreators ) {
            AppleProduct appleProduct = appleProductCreator.getAppleProduct();
            System.out.printf(
                    "%s. Вес: %.1f кг\n", appleProduct.getName(), appleProduct.getWeight()
            );
        }
    }
}
