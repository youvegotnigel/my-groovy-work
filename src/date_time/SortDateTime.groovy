package date_time

import org.testng.Assert

import java.text.SimpleDateFormat


def dates = ["11-May-2020", "03-Mar-2020", "13-Feb-2020", "02-Feb-2020"]
def sorted_dates = ["02-Feb-2020", "13-Feb-2020", "03-Mar-2020", "11-May-2020"]

//def sorted_dates = dates.sort()

println("Before Sort ::: " + dates)

Date[] date = new Date[dates.size()]

SimpleDateFormat format =new SimpleDateFormat("dd-MMM-yyyy")

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

assert newDate.equals(sorted_dates)