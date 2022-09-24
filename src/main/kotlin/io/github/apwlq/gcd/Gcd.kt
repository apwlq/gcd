package io.github.apwlq.gcd

// 최대공약수 구하는 코드임

fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a

fun main(args: Array<String>){
    try {
        val a = args[0].toInt()
        val b = args[1].toInt()
        println("${a}와 ${b}의 최대공약수는 ${gcd(a, b)}입니다.")
    } catch (e: ArrayIndexOutOfBoundsException) {
        System.err.println("도움: java -jar <*>.jar <a> <b>")
    }

}