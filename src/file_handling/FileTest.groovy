package file_handling

String directory = System.getProperty("user.dir")
String old_file_name = "old_password.txt"
String new_file_name = "new_password.txt"
String old_file_path = directory + "\\" + old_file_name
String new_file_path = directory + "\\" + new_file_name

println(old_file_path)
println(new_file_path)

//read old password
def old_password_content = getFileContent(old_file_path)

//print old password
println("Content in old_password.txt ::: " + old_password_content)

//generate new password
def new_password = getNewPassword()
println("new password ::: " + new_password)

//write new password to password.txt
writeToFile(new_file_path, new_password)

//print old and new password from .txt files
def new_password_content = getFileContent(new_file_path)
println("Content in password.txt ::: " + new_password_content)

//update old_password.txt with password.txt
writeToFile(old_file_path, new_password)

//print both file content
println("\n-------------AFTER UPDATE-----------------")
println("Content in old_password.txt ::: " + getFileContent(old_file_path))
println("Content in new_password.txt ::: " + getFileContent(new_file_path))


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
    def length = 9
    key = new Random().with {
        (1..length).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
    }
    return key
}