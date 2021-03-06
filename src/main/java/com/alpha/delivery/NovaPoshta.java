package com.alpha.delivery;

import com.alpha.decorations.FlowerComposition;
import com.alpha.decorations.Priceable;

public class NovaPoshta implements Delivery {
    final int price = 10;
    Priceable priceable;

    @Override
    public void setPriceable(Priceable priceable) {
        this.priceable = priceable;
    }

    @Override
    public int calculateDeliveryPrice() {
        int numberOfFlowers = 1;
        if (priceable instanceof FlowerComposition) {
            numberOfFlowers = ((FlowerComposition) priceable).getFlowers().size();
        }
        return priceable.calculatePrice() + numberOfFlowers * price;
    }

    @Override
    public String toString() {
        return "NovaPoshta{" +
                "price=" + price +
                "}";
    }
}
