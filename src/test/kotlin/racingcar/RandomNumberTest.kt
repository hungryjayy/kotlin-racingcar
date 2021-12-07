package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.RandomNumberPolicy

class RandomNumberTest {
    @Test
    fun `Should be a random value from 0 to 9`() {
        val randomNumber = RandomNumberPolicy().generate()
        assertThat(randomNumber).isGreaterThanOrEqualTo(0)
        assertThat(randomNumber).isLessThanOrEqualTo(9)
    }
}
