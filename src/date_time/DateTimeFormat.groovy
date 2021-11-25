package date_time

import java.text.SimpleDateFormat

String str = "11-May-2020"
println("String format = $str")

SimpleDateFormat format =new SimpleDateFormat("dd-MMM-yyyy")

Date date = format.parse(str)
println("Date format = $date")


SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy")
String newDate = outFormat.format(date)

println(newDate)