package com.bagong.tutorialcrud.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

@Component
public class DateUtils {

    public DateUtils() {
    }

    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public LocalDate convertDateToLocalDate(String date) throws ParseException {
        return format.parse(date).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
