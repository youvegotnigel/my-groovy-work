package date_time

import java.text.DateFormat
import java.text.SimpleDateFormat

DateFormat format = new SimpleDateFormat("dd-MMM-yyyy")
Date date = new Date()
println format.format(date)

