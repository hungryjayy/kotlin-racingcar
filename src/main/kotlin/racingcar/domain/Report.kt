package racingcar.domain

class Report() {
    val report: MutableMap<Int, Set<Pair<String, Int>>> = mutableMapOf()
    val winnerNames: MutableList<String> = mutableListOf()

    fun updateReport(round: Int, cars: Cars) {
        val reportSet = mutableSetOf<Pair<String, Int>>()
        cars.cars.forEach {
            reportSet.add(carReport(it))
        }
        report[round] = reportSet
    }

    fun updateWinnerNames(winners: List<Car>) { winners.map { winnerNames.add(it.name) } }


    private fun carReport(car: Car) = Pair(car.name, car.position.position)
}
