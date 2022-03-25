package file_handling

import java.text.SimpleDateFormat

def date = new Date()
def sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
def date_time = sdf.format(date)

String filePath = "C:\\dev\\my-automation-projects\\my-groovy-work\\src\\file_handling\\logs.txt"

File file = new File(filePath)

file.append("\n")
file.append(date_time)
file.append("\n------------\n")
file.append("first\n")
file.append("second\n")
file.append("third\n")

println file.text