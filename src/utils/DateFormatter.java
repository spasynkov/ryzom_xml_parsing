package utils;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Simple class for date formatting
 */
public class DateFormatter {
    private final static String DATE_FORMATTING_DEFAULT_PATTERN = "EEEE, d MMMM yyyy H:mm:ss:SSSS (zzzz, 'GMT' XXX)";
    private final static String SHORT_PATTERN = "d.MM.yy H:mm:ss";
    private static SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMATTING_DEFAULT_PATTERN);

    /**
     * Returns short view of date/time in UTC
     * <p>
     * Example: <i>23.06.16 17:05:49</i>
     * */
    public static String getShortDateAndTimeInUtc(long timestamp) {
        // setting short pattern
        formatter.applyPattern(SHORT_PATTERN);

        // saving current time zone and setting UTC
        TimeZone previous = formatter.getTimeZone();
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        // getting formatted time string
        String result = formatter.format(timestamp);

        // rolling changes back
        formatter.applyPattern(DATE_FORMATTING_DEFAULT_PATTERN);
        formatter.setTimeZone(previous);

        return result;
    }
}
