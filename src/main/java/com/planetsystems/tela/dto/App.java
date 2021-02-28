package com.planetsystems.tela.dto;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
@EnableSwagger2
public class App 
{
    public static void main( String[] args ) throws ParseException {
        String timePattern = "HH:mm:ss";
        String datePattern = "dd/MM/yyyy";
        String timeDatePattern = datePattern+" "+timePattern;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(timeDatePattern);

        Date d = simpleDateFormat.parse("28/02/2021 20:35:20");

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
        simpleDateFormat2.applyPattern(timePattern);

        System.out.println( "Hello World! "+simpleDateFormat.format(d));
        System.out.println( "Hello World! "+simpleDateFormat2.format(d));
        System.out.println( "Hello World! ");


    }
}
