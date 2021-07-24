package com.company.cards;

public class CardWithBigBonuses implements Card {

    private final int servicePerYear = 0;
    private final int daysWithoutPercents = 50;
    private final int creditLimit = 3_000_000;

    public int getServicePerYear() {
        return servicePerYear;
    }

    public int getDaysWithoutPercents() {
        return daysWithoutPercents;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void issueCard() {
        System.out.println("Карта с большими бонусами выпускается..\nУсловия карты:" +
                "\nОбслуживание в год : " + getServicePerYear() + "\nДней без процентов : "
                + getDaysWithoutPercents() + "\nКредитнй лимит : " + getCreditLimit());
    }
}
