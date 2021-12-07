package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.domain.Car.Companion.MOVABLE_LOWER_BOUND
import racingcar.domain.Car.Companion.NAME_LENGTH_ERROR_MESSAGE
import racingcar.domain.Position

class CarTest {
    @Test
    fun `Should move car when random value is threshold or over`() {
        val car = Car("car", Position())
        val prevPosition = car.position.position

        car.move(MOVABLE_LOWER_BOUND)

        assertThat(car.position.position).isNotEqualTo(prevPosition)
    }

    @Test
    fun `Should not move car when random value is below threshold`() {
        val car = Car("car", Position())
        val prevPosition = car.position

        car.move(MOVABLE_LOWER_BOUND - 1)

        assertThat(car.position).isEqualTo(prevPosition)
    }

    @Test
    fun `Should fail when name length over 5`() {
        assertThatThrownBy { Car("123456", Position()) }.hasMessage(NAME_LENGTH_ERROR_MESSAGE)
    }
}
