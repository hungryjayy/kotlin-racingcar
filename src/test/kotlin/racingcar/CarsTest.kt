package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Cars

class CarsTest {
    @Test
    fun `Should get the most moved cars when wanting to get winner list`() {
        val cars = Cars(listOf("carA", "carB", "carC"))
        cars.cars[0].move(4)
        cars.cars[1].move(4)
        assertThat(cars.winners.count()).isEqualTo(2)
    }
}
