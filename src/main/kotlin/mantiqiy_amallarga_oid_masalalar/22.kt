package mantiqiy_amallarga_oid_masalalar

fun main() {
    var a = 123
    var b = a / 100//1
    var c = a % 100 //23
    var d = c % 10//3
    var g = c / 10//2
    var f = b < g || g < d || d < g || g < b
    println(f)
}