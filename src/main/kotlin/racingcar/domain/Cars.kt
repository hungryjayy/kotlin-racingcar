package racingcar.domain

class Cars(carNames: List<String>) {
    val cars: List<Car> = carNames.map { Car(it, Position()) }

    val winners: List<Car>
        get() = cars.maxByOrNull { it.position.position }!!.position.position.let { winningPosition ->
            return cars.filter { it.position.position == winningPosition }
        }

    fun moveCars(numberPolicy: NumberPolicy) = cars.forEach { it.move(numberPolicy.generate()) }
}
