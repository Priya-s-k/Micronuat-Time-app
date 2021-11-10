package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.text.*;
import java.util.*;

@Controller("/time")
public class Demo{
    @Get("/")

    public String TimesOfDifferentZones()
    {
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String USA= df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("Australia/Canberra"));
        String Aus= df.format(today);
        df.setTimeZone(TimeZone.getTimeZone("Greenwich"));
        String uk= df.format(today);
        return "\t** Current Time of Different Countries **\n"+
                "----------------------------------------------------------------\n\n"+
                "Indian Timezone(Asia/Kolkata): " + IST +
                "\n----------------------------------------------------------------\n\n"+
                "USA Timezone(America/Los_Angeles): " +USA+
                "\n----------------------------------------------------------------\n\n"+
                "Australia Timezone(Australia/Canberra): " +Aus+
                "\n----------------------------------------------------------------\n\n"+
                "UK Timezone(Greenwich): " +uk +
                "\n----------------------------------------------------------------\n\n"+
                "\t\t*********************\t";

    }
}









