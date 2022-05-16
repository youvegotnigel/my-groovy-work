package date_time

import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter


for(int i=0; i<=6; i++){

    println getFutureDate(i,0, "MMM yyyy")
    println getPastDate(i,0, "MMM yyyy")
}

def getFutureDate(int months, int days, String format) {
    def date = LocalDate.now(ZoneId.systemDefault()).plusMonths(months).plusDays(days).format(DateTimeFormatter.ofPattern(format))
    return date
}

def getPastDate(int months, int days, String format) {

    def date = LocalDate.now(ZoneId.systemDefault()).minusMonths(Math.abs(months)).minusDays(Math.abs(days)).format(DateTimeFormatter.ofPattern(format))
    return date
}
