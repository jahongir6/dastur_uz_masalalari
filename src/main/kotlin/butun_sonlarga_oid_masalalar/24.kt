package butun_sonlarga_oid_masalalar

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("sana kiriting va qaysi hafta kuniga tori kelishini bilib oliing")
    var kun = input.nextInt()
    when (kun) {
        in 1..365 -> {
            if (kun % 7 == 0) {
                println("yakshanba")
            } else if (kun % 7 == 1) {
                println("dushanba")
            } else if (kun % 7 == 2) {
                println("seshanba")
            } else if (kun % 7 == 3) {
                println("chorshanba")
            } else if (kun % 7 == 4) {
                println("payshanba")
            } else if (kun % 7 == 5) {
                println("juma")
            } else if (kun % 7 == 6) {
                println("shanba")
            } else {
                println("boshqa kun")
            }
        }

        else -> println("")

    }
}