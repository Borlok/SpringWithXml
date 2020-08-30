package com.company;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale locale = new Locale("ru","RU");
        String pat = "Today is {0,date,long}, My name is {1}, and i have {2,number,currency}";
        ResourceBundle resource = ResourceBundle.getBundle("Language_ru_RU",locale);
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        DateFormat dateFormat = DateFormat.getDateInstance(1,locale);

        String arm = MessageFormat.format( pat,
                new GregorianCalendar(2020,8,25).getTime(),
                resource.getString("name"),
                Integer.parseInt(resource.getString("price")));

        System.out.println(arm);

        double a = 12345.78;
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println(format.format(a));
    }

}
