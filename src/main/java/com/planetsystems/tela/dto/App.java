package com.planetsystems.tela.dto;

import org.apache.commons.lang3.StringUtils;

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
        String datePattern2 = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(datePattern2);
        Date d = format.parse("03/02/2021");
        SimpleDateFormat format2 = new SimpleDateFormat("EEEE dd/MM/yyyy");
        System.out.println("DATE "+format2.format(d));

//        String sDate1="31/12/1998";
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        System.out.println(sDate1+"\t"+date1);
        String fullName = "galiwango fahad";
        String cap = StringUtils.capitalize(fullName);
        System.out.println("Name "+cap);
        //StringUtils.cap





    }
}
