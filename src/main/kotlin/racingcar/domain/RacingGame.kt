package racingcar.domain

class RacingGame(
    private val trial: Trial,
    private val cars: Cars,
    private val numberPolicy: NumberPolicy,
) {
    fun startGame(): Report {
        val report = Report()
        for (round in 1..trial.trialCount) {
            cars.moveCars(numberPolicy)
            report.updateReport(round, cars)
        }
        report.updateWinnerNames(cars.winners)
        return report
    }
}
