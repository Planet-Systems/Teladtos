package com.planetsystems.tela.dto.enums;

public enum WeekNumber {

    WEEK1(1) , WEEK2(2) ,WEEK3(3) , WEEK4(4) , WEEK5(5);

    int weekNumber;

    WeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public static WeekNumber getWeekNumber(int weekNumber) {
        for (WeekNumber number : WeekNumber.values()) {
            if (number.getWeekNumber() == weekNumber)
                return number;
        }
        return null;
    }

}
