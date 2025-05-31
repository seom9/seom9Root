package org.example.seom9root.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Common {

    private static final DateTimeFormatter DASHED_FORMATTER = DateTimeFormatter.ofPattern("yyyy - MM - dd");

    // LocalDate를 "0000 - 00 - 00" 포맷으로 변경
    public static String formatDashedDate(LocalDate date) {
        if (date == null) return "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM - dd");
        return date.format(formatter);
    }
}
