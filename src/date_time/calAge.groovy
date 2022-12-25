package date_time

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter


DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm")
ZoneId zoneId = ZoneId.of("Canada/Eastern")
LocalDateTime now = LocalDateTime.now(zoneId)
println (dtf.format(now))

