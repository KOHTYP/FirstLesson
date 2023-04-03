fun main() {
    val departureH = 9
    val departureM = 39
    var movementM: Int = 457

    val movementH = movementM / 60
    val arrivalM: Int = departureM + (movementM - (movementH * 60))
    val arrivalMFinal = arrivalM - 60
    val arrivalH = departureH + movementH + (arrivalM / 60)

    println("$arrivalH:$arrivalMFinal")


}