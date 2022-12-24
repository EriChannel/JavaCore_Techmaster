package org.example.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String formatDate(LocalDateTime dateTime){
        String pattern = "hh:mm, dd-MM-yyyy";
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(myFormatter);
    }
}
