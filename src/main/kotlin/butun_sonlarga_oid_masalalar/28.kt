package butun_sonlarga_oid_masalalar

import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    println("sana kiriting")
    var kun = input.nextInt()
    when (kun) {
        in 1..365 -> {
            if (kun % 7 == 0) {
                println("yakshanba")
            } else if (kun % 7 == 1) {
                println("payshanba")
            } else if (kun % 7 == 2) {
                println("seyshanba")
            } else if (kun % 7 == 3) {
                println("chorshanba")
            } else if (kun % 7 == 4) {
                println("dushanba")
            } else if (kun % 7 == 5) {
                println("juma")
            } else if (kun % 7 == 6) {
                println("shanba")
            } else {
                println("kun yo bunaqa")
            }
        }

        else -> {
            println("bunaqa sana yo")
        }
    }
}

