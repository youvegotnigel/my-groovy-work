package regex_stuff


for(int i=1; i<10; i++){

    def row_name = "row$i"

    def digit = row_name.findAll("\\d{1,2}")

    int value = (digit[0] as int)*2 -1

    println("Input  = $row_name")
    println("Output = row$value")
    println("----------------------")

}


