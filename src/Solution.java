import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void findDay(int month, int day, int year) {
        Calendar cd = Calendar.getInstance();
        cd.set(year,month,day);
        cd.getTime().getDay();
        cd.getTime().getMonth();
        System.out.println(Calendar.DATE);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result.findDay(8, 5, 2015);

    }
}
