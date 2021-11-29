package date_time

import java.text.SimpleDateFormat

String str = "25-Nov-2021 12:37:56 AM"
println("String format = $str")

SimpleDateFormat format =new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH)

Date date = format.parse(str)
println("Date format = $date")


SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a")
String newDate = outFormat.format(date)

println(newDate)