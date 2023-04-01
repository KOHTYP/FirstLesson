fun main() {
    val permamentExpenses = 50 * 30000
    val allExpenses = permamentExpenses + (30 * 20000)
    val averageSalary = allExpenses / (50 + 30)
    println("""$permamentExpenses
        |$allExpenses
        |$averageSalary
    """.trimMargin())
}