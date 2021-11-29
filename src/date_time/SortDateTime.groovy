package date_time

import org.testng.Assert

import java.text.SimpleDateFormat


def dates = ["25-Nov-2021 12:46:09 AM", "25-Nov-2021 12:36:21 AM", "25-Nov-2021 12:36:21 AM", "25-Nov-2021 12:37:56 AM", "25-Nov-2021 12:37:56 AM"]
def sorted_dates = ["25-Nov-2021 12:36:21 AM", "25-Nov-2021 12:36:21 AM", "25-Nov-2021 12:37:56 AM", "25-Nov-2021 12:37:56 AM", "25-Nov-2021 12:46:09 AM"]

//def sorted_dates = dates.sort()

println("Before Sort ::: " + dates)

Date[] date = new Date[dates.size()]

SimpleDateFormat format =new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH)

for (def i = 0; i < dates.size(); i++) {
    date[i] = format.parse(dates[i])
}

//SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy")

//println("Before Sort ::: " + date)
Arrays.sort(date)
//println("After Sort ::: " + date)

def newDate = new String[dates.size()]

for (def i = 0; i < dates.size(); i++) {
    newDate[i] = format.format(date[i])
    newDate[i] = newDate[i].replace('.','')
}

println("After sort and format ::: " + newDate)

assert newDate == sorted_dates