package date_time

def input_string = "07-Mar-2022 11:12:04 AM"

def str= []
str = input_string.tokenize(":")

def regex_time_update = str[2].replaceAll("\\d{2}", "\\\\d{2}")

def output_string = str[0] + ":"+ str[1] + ":" + regex_time_update

println("INPUT  =  $input_string")
println("OUTPUT =  $output_string")