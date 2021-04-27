package com.planetsystems.tela.dto.enums;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public enum monthEnum {
    JAN("JANUARY") ,
    FEB("FEBRUARY"),
    MAR("MARCH"),
    APR("APRIL"),
    MAY("MAY"),
    JUN("JUNE"),
    JUL("JULY"),
    AUG("AUGUST"),
    SEP("SEPTEMBER"),
    OCT("OCTOBER"),
    NOV("NOVEMBER"),
    DEC("DECEMBER");

    String month;

    monthEnum(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
