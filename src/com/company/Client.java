package com.company;

import com.company.cards.Card;
import com.company.factory.FactoryCardWithBigBonuses;
import com.company.factory.FactoryCardWithFreeService;


public class Client {


    public static void main(String[] args) {

        createCardFromFactory(CardType.FREE).issueCard();

    }

    public static Card createCardFromFactory(CardType type) {

        Card card = null;

        switch (type) {
            case FREE:
                card = new FactoryCardWithFreeService().createCard();
                break;
            case BONUS:
                card = new FactoryCardWithBigBonuses().createCard();
                break;
        }
        return card;

    }
}
