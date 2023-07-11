package butun_sonlarga_oid_masalalar

fun main() {
    var a = 123
    var b = a/100
    println(" $a yuzlilar honasi $b")
    var c = a%100
    var d = c/10
    println("$a onliklar xonasi $d")
    var e = c%10
    println(" $a birliklar xonasi $e")
    println("$a teskari yigindisi ${b+d+e}")
}