package sorting

def list = ["Acute Hospital", 111, "Acute Hospital", 111, "Acute and Community", "Acute Hospital", 111]

try {
    list.sort(String.CASE_INSENSITIVE_ORDER)
}catch(ClassCastException e){
    list.sort()
}

println(list)

