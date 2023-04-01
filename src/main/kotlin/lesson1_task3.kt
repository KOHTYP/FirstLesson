fun main() {
    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"
    println("""$year
        |$hour
        |$minute
    """.trimMargin())
    hour = "10"
    minute = "55"
    println("$hour:$minute")
}