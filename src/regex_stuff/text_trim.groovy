package regex_stuff

def actual = "4375:Bed Balance (Deficit) - UHS, 2440:A&E - Breaches since midnight (majors) - UHS"
def output = "4375:Bed Balance  (Deficit) - UHS, 2440:A&E - Breaches since midnight (majors) - UHS"

def expected = actual.trim().replaceAll("\\s+", " ")

assert actual.equals(expected)
assert actual.equals(output)





