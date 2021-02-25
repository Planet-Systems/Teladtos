package com.planetsystems.tela.dto;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

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
    public static void main( String[] args )
    {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat();
        simpleDateFormat2.applyPattern("HH:mm:ss");
        String dateString = simpleDateFormat.format(new Date());
        String time = simpleDateFormat2.format(new Date());

        System.out.println( "Hello World! "+dateString );
        System.out.println( "Hello World! "+time);
        System.out.println( "Hello World! ");
       String dates = "";
       System.out.println(dates);

    }
}
