package org.example.seom9root.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Common {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final DateTimeFormatter DASHED_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);

    // LocalDate → "yyyy-MM-dd" 포맷 문자열
    public static String formatDashedDate(LocalDateTime date) {
        if (date == null) return "";
        return date.format(DASHED_FORMATTER);
    }

    // "yyyy-MM-dd" 문자열 → LocalDateTime (00:00:00 기준)
    public static LocalDateTime parseDashedDateTime(String date) {
        if (date == null) return null;
        return LocalDate.parse(date, DASHED_FORMATTER).atStartOfDay();
    }
}
