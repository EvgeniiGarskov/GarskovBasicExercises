package BasicExercises.Date_calendar_and_time;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Date_calendar_and_time1_37 {

    public static void main(String[] args) {

        System.out.println("Exercise 1");

        /*
        Напишите программу на Java для создания объекта Date с использованием класса Calendar.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        System.out.println("The Current Date is:\n" + c.getTime());

        //Вариант 2
//        int year = 2016;
//        int month = 0; // January
//        int date = 1;
//        Calendar cal = Calendar.getInstance();
//        // Sets the given calendar field value and the time value
//        // (millisecond offset from the Epoch) of this Calendar undefined.
//        cal.clear();
//        System.out.println();
//        cal.set(Calendar.YEAR, year);
//        cal.set(Calendar.MONTH, month);
//        cal.set(Calendar.DATE, date);
//        System.out.println(cal.getTime());
//        System.out.println();

        System.out.println("Exercise 2");

        /*
        Напишите Java-программу для получения и отображения информации (год, месяц, день, час, минута) календаря по умолчанию.
         */

        //Мой вариант
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
//        System.out.println("Current Calendar's Month: " + calendar.get(Calendar.MONTH));
//        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
//        System.out.println("Current HOUR: " + calendar.get(Calendar.HOUR));
//        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));

        //Вариант 2
//        // Create a default calendar
//        Calendar cal = Calendar.getInstance();
//        // Get and display information of current date from the calendar:
//        System.out.println();
//        System.out.println("Year: " + cal.get(Calendar.YEAR));
//        System.out.println("Month: " + cal.get(Calendar.MONTH));
//        System.out.println("Day: " + cal.get(Calendar.DATE));
//        System.out.println("Hour: " + cal.get(Calendar.HOUR));
//        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
//        System.out.println();

        System.out.println("Exercise 3");

        /*
        Напишите программу на Java, чтобы получить максимальное значение года, месяца, недели, даты из текущей даты календаря по умолчанию.
         */

        //Мой вариант
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("The Current Date is:" + calendar.getTime());
//        System.out.println("Actual Maximum Year: " + calendar.getActualMaximum(Calendar.YEAR));
//        System.out.println("Actual Maximum Month: " + calendar.getActualMaximum(Calendar.MONTH));
//        System.out.println("Actual Maximum Week of Year: " + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
//        System.out.println("Actual Maximum Date: " + calendar.getActualMaximum(Calendar.DATE));

        //Вариант 2
//        // Create a default calendar
//        Calendar cal = Calendar.getInstance();
//        System.out.println();
//        System.out.println("\nCurrent Date and Time:" + cal.getTime());
//        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
//        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
//        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
//        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
//
//        System.out.println("Actual Maximum Year: "+actualMaxYear);
//        System.out.println("Actual Maximum Month: "+actualMaxMonth);
//        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
//        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
//        System.out.println();

        System.out.println("Exercise 4");

        /*
        Напишите программу на Java, чтобы получить минимальное значение года, месяца, недели, даты из текущей даты календаря по умолчанию.
         */

        //Мой вариант
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("The Current Date is:" + calendar.getTime());
//        System.out.println("Actual Minimum Year: " + calendar.getActualMinimum(Calendar.YEAR));
//        System.out.println("Actual Minimum Month: " + calendar.getActualMinimum(Calendar.MONTH));
//        System.out.println("Actual Minimum Week of Year: " + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
//        System.out.println("Actual Minimum Date: " + calendar.getActualMinimum(Calendar.DATE));

        //Вариант 2
//        // Create a default calendar
//        Calendar cal = Calendar.getInstance();
//        System.out.println();
//        System.out.println("\nCurrent Date and Time:" + cal.getTime());
//        int actualMaxYear = cal.getActualMinimum(Calendar.YEAR);
//        int actualMaxMonth = cal.getActualMinimum(Calendar.MONTH);
//        int actualMaxWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
//        int actualMaxDate = cal.getActualMinimum(Calendar.DATE);
//
//        System.out.println("Actual Minimum Year: "+actualMaxYear);
//        System.out.println("Actual Minimum Month: "+actualMaxMonth);
//        System.out.println("Actual Minimum Week of Year: "+actualMaxWeek);
//        System.out.println("Actual Minimum Date: "+actualMaxDate+"\n");
//        System.out.println();

        System.out.println("Exercise 5");

        /*
        Напишите программу на Java, чтобы узнать текущее время в Нью-Йорке.
         */

        //Мой вариант
//        ZoneId zone = ZoneId.of("America/New_York");
//        ZonedDateTime time = ZonedDateTime.now(zone);
//        System.out.println("Time in New York: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

        //Вариант 2
//        Calendar calNewYork = Calendar.getInstance();
//        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println();
//        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
//                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
//        System.out.println();

        System.out.println("Exercise 6");

        /*
        Напишите программу на Java, чтобы получить текущую полную дату и время.
         */

        //Мой вариант
//        ZoneId zone = ZoneId.of("Europe/Samara");
//        ZonedDateTime time = ZonedDateTime.now(zone);
//        System.out.println("Date and time in Togliatti: " + time.getDayOfMonth() + time.getMonth() + "-" + time.getYear() + " "
//                + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

        //Вариант 2
//        Calendar now = Calendar.getInstance();
//        System.out.println();
//        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
//                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
//                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
//                + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
//        System.out.println();

        System.out.println("Exercise 7");

        /*
        Напишите программу на Java, чтобы узнать последний день текущего месяца.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        int actualMaxDay = c.getActualMaximum(c.DAY_OF_MONTH);
//        System.out.println("Last date of the current month: " + actualMaxDay);

        //Вариант 2
//        //Gets a calendar using the default time zone and locale.
//        Calendar calendar = Calendar.getInstance();
//        System.out.println();
//        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.println();

        System.out.println("Exercise 8");

        /*
        Напишите программу на Java, чтобы узнать последнюю дату месяца.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        c.set(c.DAY_OF_MONTH, c.getActualMaximum(c.DAY_OF_MONTH));
//        System.out.println(c.getTime());

        //Вариант 2
//        Calendar cal = Calendar.getInstance();
//        //  cal.setTime(date);
//        System.out.println();
//        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.println(cal.getTime());
//        System.out.println();

        System.out.println("Exercise 9");

        /*
        Напишите программу на Java для расчета первого и последнего дня каждой недели.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        c.set(c.DAY_OF_WEEK, c.MONDAY);
//
//        SimpleDateFormat df = new SimpleDateFormat("EEE dd/MM/y");
//        System.out.println(df.format(c.getTime()));
//
//        for (int i = 0; i <6; i++) {
//            c.add(Calendar.DATE, 1);
//        }
//        System.out.println(df.format(c.getTime()));

        //Вариант 2
//        // Get calendar set to current date and time
//        Calendar c = Calendar.getInstance();
//        // Set the calendar to monday of the current week
//        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//        System.out.println();
//        // Print dates of the current week starting on Monday
//        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
//        System.out.println(df.format(c.getTime()));
//        for (int i = 0; i <6; i++) {
//            c.add(Calendar.DATE, 1);
//        }
//        System.out.println(df.format(c.getTime()));
//        System.out.println();

        System.out.println("Exercise 10");

        /*
        Напишите программу на Java, чтобы получить имя первого и последнего дня месяца.
         */

//        YearMonth ym = YearMonth.of(2016, 9);
//        String firstDay = ym.atDay(1).getDayOfWeek().name();
//        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
//        System.out.println();
//        System.out.println(firstDay);
//        System.out.println(lastDay);
//        System.out.println();

        System.out.println("Exercise 11");

        /*
        Напишите программу на Java, чтобы узнать количество дней в месяце.
         */

        //Мой вариант
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("Number of days of the current month : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        //Вариант 2
//        Calendar cal = Calendar.getInstance();
//        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println();
//        System.out.println("Number of days of the current month : " + days);
//        System.out.println();

        System.out.println("Exercise 12");

        /*
        Напишите программу на Java, чтобы получить локализованное название дня в неделю.
         */

        //Мой вариант
//        //Не так понял задание
//        ZoneId zone = ZoneId.of("Europe/Samara");
//        ZonedDateTime time = ZonedDateTime.now(zone);
//        System.out.println("Localized name of the day of the week: " + time.getDayOfWeek());

        //Вариант 2
//        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
//        // for the current Locale :
//        //   DateFormatSymbols symbols = new DateFormatSymbols();
//        String[] dayNames = symbols.getWeekdays();
//        for (String s : dayNames) {
//            System.out.print(s + "\n");
//            System.out.println();
//        }

        System.out.println("Exercise 13");

        /*
        Напишите программу на Java, чтобы получить день недели с определенной датой.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        int day = c.get(Calendar.DAY_OF_WEEK);
//        System.out.println("Day of the week : " + day);

        //Вариант 2
//        // Create a default calendar
//        Calendar cal = Calendar.getInstance();
//        //Set your date: cal.setTime(yourDate);
//        System.out.println();
//        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println("Day of the week : " + dayOfWeek);
//        System.out.println();

        System.out.println("Exercise 14");

        /*
        Напишите программу на Java, чтобы узнать текущее местное время.
         */

        //Мой вариант
//        LocalTime time = LocalTime.now();
//        System.out.println("Now = " + time);

        //Вариант 2
//        LocalTime time = LocalTime.now();
//        System.out.println();
//        // in hour, minutes, seconds, nano seconds
//        System.out.println("Local time now : " + time);
//        System.out.println();

        System.out.println("Exercise 15");

        /*
        Напишите программу на Java, чтобы добавить несколько часов к текущему времени.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.HOUR, 2);
//        System.out.println("Time after 2 hours : " + c.getTime());

        //Вариант 2
//        LocalTime time = LocalTime.now();
//        // adding four hours
//        LocalTime newTime = time.plusHours(2);
//        System.out.println();
//        System.out.println("Time after 2 hours : " + newTime);
//        System.out.println();

        System.out.println("Exercise 16");

        /*
        Напишите программу на Java, чтобы получить дату через 2 недели.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        System.out.println("Current Date: " + c.getTime());
//        c.add(Calendar.WEEK_OF_MONTH, 2);
//        System.out.println("Time after 2 week : " + c.getTime());

        //Вариант 2
//        //two weeks
//        int noOfDays = 14;
//        Calendar cal = Calendar.getInstance();
//        Date cdate = cal.getTime();
//        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
//        Date date = cal.getTime();
//        System.out.println("\nCurrent Date: " + cdate+"\n");
//        System.out.println("Day after two weeks: " + date+"\n");

        System.out.println("Exercise 17");

        /*
        Напишите программу на Java, чтобы получить дату до и после 1 года сравнения с текущей датой.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        System.out.println("Current Date: " + c.getTime());
//        c.add(Calendar.YEAR, 1);
//        System.out.println("Time after 1 year : " + c.getTime());
//        c.add(Calendar.YEAR, -2);
//        System.out.println("Time 1 year ago : " + c.getTime());

        //Вариант 2
//        Calendar cal = Calendar.getInstance();
//        Date cdate = cal.getTime();
//        // get next year
//        cal.add(Calendar.YEAR, 1);
//        Date nyear = cal.getTime();
//        //get previous year
//        cal.add(Calendar.YEAR, -2);
//        Date pyear = cal.getTime();
//        System.out.println("\nCurrent Date : " + cdate);
//        System.out.println("\nDate before 1 year : " + pyear);
//        System.out.println("\nDate after 1 year  : " + nyear+"\n");

        System.out.println("Exercise 18");

        /*
        Написать программу на Java, чтобы проверить, является ли год високосным или нет.
         */

        //Мой вариант
//        LocalDate today = LocalDate.now();
//        System.out.println("Current year: " + today.getYear());
//        System.out.println("Is a leap year: " + today.isLeapYear());

        //Вариант 2
//        //year to leap year or not
//        int year = 2016;
//        System.out.println();
//        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//            System.out.println("Year " + year + " is a leap year");
//        else
//            System.out.println("Year " + year + " is not a leap year");
//        System.out.println();

        System.out.println("Exercise 19");

        /*
        Напишите программу на Java, чтобы получить год и месяцы между двумя датами.
         */

//        LocalDate today = LocalDate.now();
//        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
//        Period diff = Period.between(userday, today);
//        System.out.println("\nDifference between "+ userday +" and "+ today +": "
//                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");

        System.out.println("Exercise 20");

        /*
        Напишите программу на Java, чтобы получить текущую метку времени.
         */

        //Мой вариант
//        Instant instant = Instant.now();
//        System.out.println("Timestamp: " + instant);

        //Вариант 2
//        Instant timestamp = Instant.now();
//        System.out.println("\nCurrent Timestamp: " + timestamp+"\n");

        System.out.println("Exercise 21");

        /*
        Напишите программу на Java, чтобы узнать текущее время во всех доступных часовых поясах.
         */

//        ZoneId.SHORT_IDS.keySet().
//                stream().forEach(
//                        zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "
//                                + LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );

        System.out.println("Exercise 22");

        /*
        Напишите программу на Java, чтобы получить даты за 10 дней до и после сегодняшнего дня.
         */

        //Мой вариант
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("Current Date: " + df.format(c.getTime()));
//        c.add(Calendar.DAY_OF_MONTH, 10);
//        System.out.println("Time after 10 days : " + df.format(c.getTime()));
//        c.add(Calendar.DAY_OF_MONTH, -20);
//        System.out.println("Time 10 days ago : " + df.format(c.getTime()));

        //Вариант 2
//        LocalDate today = LocalDate.now();
//        System.out.println("\nCurrent Date: "+today);
//        System.out.println("10 days before today will be "+today.plusDays(-10));
//        System.out.println("10 days after today will be "+today.plusDays(10)+"\n");

        System.out.println("Exercise 23");

        /*
        Напишите программу на Java, чтобы получить месяцы, оставшиеся в году.
         */

//        LocalDate today = LocalDate.now();
//        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
//        Period period = today.until(lastDayOfYear);
//        System.out.println();
//        System.out.println("Months remaining in the year: "+period.getMonths());
//        System.out.println();

        System.out.println("Exercise 24");

        /*
        Напишите программу на Java для отображения дат в указанных форматах.
         */

        //Мой вариант
//        LocalDate today = LocalDate.now();
//        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd :: MMMM :: y");
//        System.out.println("Default format LocalDate = " + today);
//        System.out.println(dateformatter.format(today));
//
//        LocalDateTime todayTime = LocalDateTime.now();
//        DateTimeFormatter dateformatterTime = DateTimeFormatter.ofPattern("dd :: MMMM :: y :: HH :: mm :: ss");
//        System.out.println("Default format LocalDateTime = " + todayTime);
//        System.out.println(dateformatterTime.format(todayTime));
//
//        Instant cur = Instant.now();
//        System.out.println("Default format Instant = " + cur);

        //Вариант 2
//        //Format examples
//        LocalDate date = LocalDate.now();
//        //default format
//        System.out.println("\nDefault format of LocalDate="+date);
//        //specific format
//        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
//        LocalDateTime dateTime = LocalDateTime.now();
//        //default format
//        System.out.println("Default format of LocalDateTime="+dateTime);
//        //specific format
//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
//        Instant timestamp = Instant.now();
//        //default format
//        System.out.println("Default format of Instant="+timestamp);
//
//        //Parse examples
//        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
//                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
//        System.out.println("Default format after parsing ="+dt+"\n");

        System.out.println("Exercise 25");

        /*
        Напишите программу на Java, чтобы получить информацию о текущем / данном году.
         */

        //Мой вариант
//        LocalDate today = LocalDate.now();
//        System.out.println("Current year: " + today.getYear());
//        System.out.println("Is a leap year: " + today.isLeapYear());
//        System.out.println("Duration of the year: " + today.lengthOfYear());

        //Вариант 2
//        //Current year
//        Year yr = Year.now();
//        //given year
//        //Year yr = Year.of(2001);
//        System.out.println("\nCurrent Year: " + yr);
//        boolean isLeap = yr.isLeap(); // false
//        System.out.println("Is current year leap year? " + isLeap);
//        int length = yr.length(); // 365
//        System.out.println("Length of the year: " + length+" days\n");

        System.out.println("Exercise 26");

        /*
        Напишите программу на Java, чтобы получить информацию о текущем / данном месяце.
         */

//        // information about the month
//        LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);
//        Month mn = ldt.getMonth(); // FEBRUARY
//        int mnIntValue = mn.getValue(); // 2
//        int minLength = mn.minLength(); // 28
//        int maxLength = mn.maxLength(); // 29
//        Month firstMonthOfQuarter = mn.firstMonthOfQuarter(); // JANUARY
//        System.out.println("\nInteger value of the current month: " + mnIntValue);
//        System.out.println("Length of the month: " + minLength);
//        System.out.println("Maximum length of the month: " + maxLength);
//        System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n");

        System.out.println("Exercise 27");

        /*
        Напишите программу на Java, чтобы получить информацию о данном времени.
         */

        //Мой вариант
//        LocalTime time = LocalTime.now();
//        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        System.out.println("Current local time: " + dateformatter.format(time));
//        System.out.println("Hour: " + time.getHour());
//        System.out.println("Minute: " + time.getMinute());
//        System.out.println("Second: " + time.getSecond());

        //Вариант 2
//        LocalTime time = LocalTime.of(12, 24, 32);
//        int hour = time.getHour();
//        int minute = time.getMinute();
//        int second = time.getSecond();
//        System.out.println("\nCurrent Local time: " + time);
//        System.out.println("Hour: " + hour);
//        System.out.println("Minue: " + minute);
//        System.out.println("Second: " +second+"\n");

        System.out.println("Exercise 28");

        /*
        Напишите программу на Java для отображения информации о дате и времени раньше, чем через несколько часов и минут от текущей даты.
         */

        //Мой вариант
//        LocalDateTime time = LocalDateTime.now();
//        System.out.println("Current date and time " + time);
//        System.out.println("Up to 7 hours and 30 minutes: " + time.minusHours(7).minusMinutes(30));

        //Вариант 2
//        // Before 7 houres and 30 minutes
//        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
//        System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());
//        System.out.println("Before 5 houres and 30 minutes: " + dateTime+"\n");

        System.out.println("Exercise 29");

        /*
        Напишите программу на Java для преобразования строки в дату.
         */

        //Мой вариант
//        String string = "2016-05-01";
//        System.out.println("Original string (that holds date value) : "+string);
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate dateObject = LocalDate.parse(string);
//        System.out.println("Converted Date value : " + df.format(dateObject));

        //Вариант 2
//        String string ="May 1, 2016";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//        LocalDate date = LocalDate.parse(string, formatter);
//        System.out.println();
//        System.out.println(date);
//        System.out.println();

        System.out.println("Exercise 30");

        /*
        Напишите программу на Java, чтобы вычислить разницу между двумя датами (год, месяцы, дни).
         */

        //Мой вариант
//        LocalDate date = LocalDate.of(2020, 03, 04);
//        LocalDate now = LocalDate.now();
//        Period period = Period.between(date, now);
//        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", period.getYears(), period.getMonths(), period.getDays());

        //Вариант 2
//        LocalDate pdate = LocalDate.of(2012, 01, 01);
//        LocalDate now = LocalDate.now();
//
//        Period diff = Period.between(pdate, now);
//
//        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",
//                diff.getYears(), diff.getMonths(), diff.getDays());

        System.out.println("Exercise 31");

        /*

         */
    }
}
