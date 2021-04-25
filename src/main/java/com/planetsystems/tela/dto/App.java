package com.planetsystems.tela.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.*;
import java.util.*;

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
//        String fullName = "galiwango fahad";
//        String cap = StringUtils.capitalize(fullName);
//        System.out.println("Name "+cap);
        //StringUtils.cap
//       LocalDate localDate =  new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//       String pattern  = "dd/MM/yyyy HH:mm:ss";
//       LocalDate l0 = localDate.withMonth(Month.valueOf("APRIL").getValue());
//       LocalDate fromMonth = LocalDate.of(2021 , Month.FEBRUARY , 1);
//       System.out.println("f1date "+l0.plusDays(7));
//       System.out.println("f1date "+l0.plusDays(7));
//       System.out.println("f1date "+l0.plusDays(7));
//       System.out.println("f1date "+l0.getDayOfWeek());

//        YearMonth yearMonth = YearMonth.of(fromMonth.getYear(), fromMonth.getMonth());
//
//        System.out.println("MONTH LENGTH "+yearMonth.lengthOfMonth());
//        System.out.println("From "+fromMonth);
//        LocalDate weekOne = fromMonth.plusWeeks(1);
//        System.out.println("W1 "+weekOne);
//        LocalDate weekTwo = weekOne.plusWeeks(1);
//        System.out.println("W2 "+weekTwo);
//        LocalDate weekThree = weekTwo.plusWeeks(1);
//        System.out.println("W3 "+weekThree);
//        LocalDate weekFour = weekThree.plusWeeks(1);
//        System.out.println("W4 "+weekFour);


//        System.out.println("W4 "+weekFour);
//       LocalDate l1 = l0.plusWeeks(1);
//        System.out.println("f1date "+l1);
//
//        LocalDate l2 = l1.plusWeeks(1);
//        System.out.println("f2date "+l2);
//
//       LocalDate l3 = l2.plusWeeks(1);
//        System.out.println("f3date "+l3);
//
//        LocalDate l4 = l3.plusWeeks(1);
//        System.out.println("f4date "+l4);
//
//        //LocalDate l5 =
//        System.out.println("f4date "+l4);


//
//        for (int i=1 ; 4>=i ; i++){
//            LocalDate dd = localDate.withMonth(Month.valueOf("APRIL").getValue()).with(TemporalAdjusters.firstDayOfMonth());
//            dd.plusDays(i);
//            System.out.println("Day "+dd.getDayOfWeek() +" date "+dd);
//        }

    //    System.out.println("MAX "+Month.APRIL.maxLength());




//       LocalTime localTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
//       System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss" , Locale.getDefault())));
//       LocalTime clockOut = LocalTime.parse("06:00:00" , DateTimeFormatter.ofPattern("HH:mm:ss" , Locale.getDefault()));
//       Duration  duration = Duration.between(clockOut , localDate);//.toHours();
//
//       System.out.println("diff "+duration);
//
//       Month month = localDate.getMonth();
//        Period period = Period.ofMonths(localDate.getMonth().getValue());

//
//        LocalDateTime ll = localDate.withMonth(localDate.getMonth().getValue())
//                .with(TemporalAdjusters.firstDayOfMonth());
//
//        //format(DateTimeFormatter.ofPattern("dd/MM/yy" , Locale.getDefault())
//        System.out.println("plaus week "+ ll.plusWeeks(1).minusDays(2));
//
//       System.out.println("month "+localDate.getMonth());
//       System.out.println("month "+month.firstMonthOfQuarter());
//       System.out.println("fmonth "+ll);

//       System.out.println("default format "+localDate);
//       String lds = localDate.format(DateTimeFormatter.ofPattern(pattern));
//       System.out.println("des format "+lds);
//       System.out.println("displayValur "+localDate.getDayOfWeek().getDisplayName(TextStyle.FULL , Locale.getDefault()));


//       String dateString  = "24/04/2021 09:43:54";
//       LocalDateTime sLocalDateTime = LocalDateTime.parse(dateString , DateTimeFormatter.ofPattern(pattern));
//       System.out.println("StringLocalDate "+sLocalDateTime);

//
//
//        int month = Month.FEBRUARY.getValue();
//        int year = 2021;
//        int dayOfWeek = DayOfWeek.SUNDAY.getValue();
//
//        LocalDate firstOfMonth =  LocalDate.of( year, month, 1 );
//        LocalDate firstOfNextMonth = firstOfMonth.plusMonths( 1 );
//        System.out.println("FIRST NEXT MONTH "+firstOfNextMonth);
//        LocalDate firstDateInGrid = firstOfMonth.withDayOfMonth( firstOfMonth.getDayOfMonth() );
//        if ( firstDateInGrid.isAfter( firstOfMonth ) ) { // If getting the next start of week instead of desired week's start, adjust backwards.
//            firstDateInGrid = firstDateInGrid.minusWeeks( 1 );
//        }
//
//        LocalDate weekStart = firstDateInGrid;
//        LocalDate weekStop = null;
//        int weekNumber = 0;
//
//        do {
//            weekNumber = weekNumber + 1;
//            weekStop = weekStart.plusDays( 6 );
//            System.out.println( weekNumber + " week: " + weekStart + " --- " + weekStop );  // 1 week: 03-30-2014 --- 04-05-2014
//            weekStart = weekStop.plusDays( 1 );
//        } while ( weekStop.isBefore( firstOfNextMonth ) );
//

//        String month = "APRIL";
//        int YEAR = 2021;
//        int weekOne = 1;
//        int weekNo = 0;
//        LocalDate startDate = LocalDate.of(YEAR , Month.FEBRUARY , 1);
//        System.out.println("START "+startDate);
//        LocalDate startOfNextMonth = startDate.plusMonths(1);
//        System.out.println("START NEXT MONTH  "+startOfNextMonth);
//
//        LocalDate endOfWeek1 = startDate.plusDays(6);
//        System.out.println("Week 1 ends "+endOfWeek1);
//
//        LocalDate startOfWeek2 = endOfWeek1.plusDays(1);
//        System.out.println("Week2 Starts "+startOfWeek2);
//
//        LocalDate endOfWeek2 = startOfWeek2.plusDays(6);
//        System.out.println("Week2 Ends "+endOfWeek2);
//
//
//        LocalDate startOfWeek3 = endOfWeek2.plusDays(1);
//        System.out.println("Week3 Starts "+startOfWeek3);
//
//        LocalDate endOfWeek3 = startOfWeek3.plusDays(6);
//        System.out.println("Week3 Ends "+endOfWeek3);
//
//        LocalDate startOfWeek4 = endOfWeek3.plusDays(1);
//        System.out.println("Week4 Starts "+startOfWeek4);
//
//        LocalDate endOfWeek4 = startOfWeek4.plusDays(6);
//        System.out.println("Week4 Ends "+endOfWeek4);
//
//        //difference btn start of next month and endof week 4
//        int TotalDays  = startDate.lengthOfMonth();//  .minusWeeks(4);
//        int usedDays = Period.between(startDate , endOfWeek4).plusDays(1).getDays();
//        System.out.println("total "+TotalDays);
//        System.out.println("used "+usedDays);
//        int remainingDays = TotalDays - usedDays;
//        System.out.println("remaing Days "+remainingDays);
//        if (remainingDays>0) {
//            LocalDate weekFIve = endOfWeek4.plusDays(remainingDays);
//            System.out.println("WEEK5 " + weekFIve);
//        }
        /////////////making it dynamic
        //immutable
//        LocalDate currentDate = LocalDate.of(2021 , Month.MAY , 1);
//        LocalDate nextMonthDate = currentDate.plusMonths(1);
//        int totalMonthDays = currentDate.lengthOfMonth();
//        int usedMonthDays;
//        int remainingMonthDays;
//        //mutable version of currentDate
//        LocalDate weekStarts = currentDate;
//        int weekNo = 0;
//        LocalDate endOfWeek;
//        do {
//            weekNo = weekNo+1;
//            endOfWeek = weekStarts.plusDays(6);
//            System.out.println("WEEK "+weekNo+" Starts "+weekStarts+" ends "+endOfWeek);
//            usedMonthDays = Period.between(currentDate , endOfWeek).plusDays(1).getDays();
//            remainingMonthDays = totalMonthDays - usedMonthDays;
//            System.out.println("Used days "+usedMonthDays +" remaining "+remainingMonthDays);
//            if (remainingMonthDays  > 0  && remainingMonthDays > 7)
//            weekStarts = endOfWeek.plusDays(1);
//            else {
//                weekNo = weekNo+1;
//                System.out.println("WEEK "+weekNo+" Starts "+endOfWeek+" ends "+currentDate.with(TemporalAdjusters.lastDayOfMonth()));
//                break;
//            }
//        }while (endOfWeek.isBefore(nextMonthDate));
//
//
//        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
//
//        System.out.println("TODAY "+dayOfWeek.getDisplayName(TextStyle.SHORT , Locale.getDefault()));
//
//        System.out.println("TODAY "+dayOfWeek);
//        System.out.println("MONDAYD "+DayOfWeek.MONDAY);
//
//        Map<String  , List<String>> nameMap = new HashMap<>();
//        List<String> name1 = Arrays.asList("Galiwango" , "fahad" , "wwsd" , "rdf" , "edx");
//        List<String> name2 = Arrays.asList("Galiwan" , "faha" , "wws" , "rd" , "ed");
//        List<String> name3 = Arrays.asList("Galiwao" , "fhad" , "wsd" , "rf" , "edx");
//        List<String> name4 = Arrays.asList("Galingo" , "fad" , "wsd" , "df" , "ex");
//        nameMap.put("1" , name1);
//        nameMap.put("2" , name2);
//        nameMap.put("3" , name3);
//        nameMap.put("4" , name4);
//
//
//        nameMap.entrySet().stream().forEach(stringListEntry -> System.out.println(stringListEntry.getKey() +" : "+
//                stringListEntry.getValue()
//                ));
//       for (int i=0 ; i < nameMap.size() ; i++){
//
//       }

//        YearMonth yearMonth = YearMonth.of(Integer.parseInt("2021") , Month.valueOf("APRIL"));
//        LocalDate startDate = yearMonth.atDay(1);
//        System.out.println("Date from yea month "+startDate);
//        System.out.println("Date from yea month "+yearMonth.atEndOfMonth());
//        System.out.println("Date from yea month "+yearMonth.lengthOfMonth());
    }
}
