package com.company.factory;

import com.company.cards.Card;
import com.company.cards.CardWithBigBonuses;

public class FactoryCardWithBigBonuses implements FactoryCard{
    @Override
    public Card createCard() {
        return new CardWithBigBonuses();
    }
}
