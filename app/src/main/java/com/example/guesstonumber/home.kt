package com.example.guesstonumber

import java.util.Scanner


fun main() {
    val randomSayi = (0..101).random()
    var tahminHak = 3
    println("Oyuna Hos Geldin!\n3hakkın var! Haydi, ilk tahminini yap: ")

    while(tahminHak in 1..3) {
        val giris = Scanner(System.`in`)
        val tahminSayi:Int = giris.nextInt()
        if(tahminSayi != null) {
            if(tahminSayi == randomSayi){
                println("TEBRİKLER!!!")
                break
            } else if(tahminSayi < randomSayi) {
                tahminHak-=1
                println("Daha yüksek bir sayı tahmin etmelisin.\nKalan Hak: $tahminHak")
            } else {
                tahminHak-=1
                println("Daha düşük bir sayı tahmin etmelisin\nKalan Hak: $tahminHak")
            }
        }
    }
    if(tahminHak == 0) {
        println("Kaybettiniz. Sayi \"$randomSayi\"")
    }
}