package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.RandomNumberPolicy
import racingcar.domain.Report

class ReportTest {

    @Test
    fun `Should report every single present car each round`() {
        val cars = Cars(listOf("carA", "carB", "carC"))
        val randomNumber = RandomNumberPolicy()
        val report = Report()
        for (round in 1..3) {
            cars.moveCars(randomNumber)
            report.updateReport(round, cars)
            assertThat(report.report.count()).isEqualTo(round)
            for (roundReport in report.report.values) {
                assertThat(roundReport.count()).isEqualTo(cars.cars.count())
            }
        }
    }
}
