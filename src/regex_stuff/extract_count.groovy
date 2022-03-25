package regex_stuff

String sample_text = ">24 hrs (39)"

String count = sample_text.find('\\(\\d{1,3}\\)').toString().replaceAll('\\(','').replaceAll('\\)','')

println "$count" as int