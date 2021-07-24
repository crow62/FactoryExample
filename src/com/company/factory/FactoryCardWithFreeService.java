package com.company.factory;

import com.company.cards.Card;
import com.company.cards.CardWithFreeService;

public class FactoryCardWithFreeService implements FactoryCard{
    @Override
    public Card createCard() {
        return new CardWithFreeService();
    }
}
