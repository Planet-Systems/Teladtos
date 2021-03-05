package com.planetsystems.tela.dto;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


@EnableSwagger2
public class App 
{
    public static void main( String[] args ) throws ParseException {
        String timePattern = "HH:mm:ss";
        String datePattern = "EEEE dd/MM/yyyy HH:mm:ss a";
        String timeDatePattern = datePattern+" "+timePattern;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(datePattern);

        System.out.println(new Date());
        System.out.println("E DD "+ LocalTime.parse("14:35:55"));


    }
}
