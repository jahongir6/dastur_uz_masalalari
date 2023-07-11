package butun_sonlarga_oid_masalalar

import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    var sekund = input.nextInt()
    var soat = sekund/3600
    var minut = sekund%3600
    var a = minut%60
    var minute = minut/60
    println("$sekund sekund  $soat soat $minute minut $a sekund boladi")
}