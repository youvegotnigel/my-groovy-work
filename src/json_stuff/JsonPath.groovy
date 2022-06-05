package json_stuff

import groovy.json.JsonSlurper

def text = "{\n" +
        "                \"id\" : 1 ,\n" +
        "                \"first_name\" : \"Alaine\" ,\n" +
        "                \"last_name\" : \"Drayton\" ,\n" +
        "                \"email\" : \"adrayton0@disqus.com\" ,\n" +
        "                \"gender\" : \"Female\" ,\n" +
        "                \"ip_address\" : \"180.36.55.17\"\n" +
        "        }"

def object = new JsonSlurper().parseText(text)

def query = object
def f_name = object.first_name
def e_mail = object.email
def ip = object.ip_address

println "$query"
println "$f_name"
println "$e_mail"
println "$ip"
