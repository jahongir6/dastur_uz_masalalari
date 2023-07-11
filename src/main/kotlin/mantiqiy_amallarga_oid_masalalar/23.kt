package mantiqiy_amallarga_oid_masalalar

fun main() {
    var a = 121
    var b = a / 100//1
    var c = a % 100 //21
    var d = c % 10//1
    var g = c / 10//2
    var h = d * 100 + g * 10 + b
    var t = a==h
    println(t)
}