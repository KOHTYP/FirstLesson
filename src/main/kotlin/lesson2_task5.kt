import kotlin.math.*

fun main() {
    val money = 70000
    val years = 20
    val stavka: Double = 16.7

    val result: Double = (money * (1 + 16.7/100).pow(20))

    println((result * 1000).roundToInt() / 1000.0)
}