package programming

//input = ["SMHC #":"454546", "Patient Name":"SCARLETT, ZOE", "Birthdate":"1987-09-05"]
//output = //table[.//tr[.//td[normalize-space(.)='SMHC #'] and .//td[normalize-space(.)='Patient Name'] and .//td[normalize-space(.)='Gender']]]

String tableDataTextXpath = ".//td[normalize-space(.)='@{criteria}']"

def myMap = ["SMHC #":"454546", "Patient Name":"SCARLETT, ZOE", "Birthdate":"1987-09-05"]
def elementIndex = "2"

def valuesList = myMap.values().toList()
def keysList = myMap.keySet().collect { it }

println(valuesList)
println(keysList)


def myXpath = getTableXpath(keysList as List<String> , elementIndex as int)

println myXpath




String getTableXpath(List<String> columnHeaders, int elementIndex = 1){

    println ("identify web table using headers: $columnHeaders")
    def headerTextXpaths = []
    String tableDataTextXpath = ".//td[normalize-space(.)='@{criteria}']"

    columnHeaders.each { header ->
        def newHeader = tableDataTextXpath.replace("@{criteria}", header)
        headerTextXpaths.add(newHeader)
    }
    def xpath = "(//table[.//tr[" + headerTextXpaths.join(" and ") + "]])[$elementIndex]"
    println("XPATH ::: $xpath")

    return xpath

}