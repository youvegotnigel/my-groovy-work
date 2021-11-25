package password_update

String directory = System.getProperty("user.dir")
String file_name = "password.txt"
String file_path = directory + "\\" + file_name

//read password
def password_content = getFileContent(file_path)

//print password
println("Content in password.txt ::: " + password_content)

//generate new password
def new_password = getNewPassword()
println("new password ::: " + new_password)

//write new password to password.txt
writeToFile(file_path, new_password)

//print both file content
println("\n-------------AFTER UPDATE-----------------")
println("OLD PASSWORD ::: " + password_content.get(0))
println("NEW PASSWORD ::: " + new_password)
println("Content in password.txt ::: " + getFileContent(file_path))


//Methods

def writeToFile(String filePath, String content){
    def fileObject = new File(filePath)
    fileObject.write(content)
}

def getFileContent(String filePath){
    def list = new File(filePath).collect {it}
    return list
}

def getNewPassword(){
    String alphabet = (('A'..'Z')+('0'..'9')).join()
    def length = 12
    key = new Random().with {
        (1..length).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
    }
    return key
}

