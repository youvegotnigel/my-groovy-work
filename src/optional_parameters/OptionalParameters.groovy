package optional_parameters

static void main(String[] args) {

    printMessage("Kevin", 23)
    printMessage("Sam")
    printMessage("Brian", 12)
}


public static void printMessage(String name, int age=18){
    println "$name should be at least $age years old."
}

