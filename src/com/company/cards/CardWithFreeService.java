package com.company.cards;

public class CardWithFreeService implements Card {

    private final int servicePerYear = 0;
    private final int daysWithoutPercents =50;
    private final int creditLimit = 600_000;

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
        System.out.println("Бесплатная в обслуживании карта выпускается..\nУсловия карты:" +
                "\nОбслуживание в год : " + getServicePerYear() + "\nДней без процентов : "
                + getDaysWithoutPercents() + "\nКредитнй лимит : " + getCreditLimit());

    }
}
