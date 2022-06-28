package regex_stuff


for(int i=1; i<10; i++){

    def row_name = "row$i"
    int val = ((row_name.findAll("\\d{1,2}"))[0] as int)*2 - 1

    println("Input  = $row_name")
    println("Output = row$val")
    println("----------------------")
}


