package racingcar.domain

import java.util.Random

class RandomNumberPolicy : NumberPolicy {
    override fun generate(): Int = Random().nextInt(RANDOM_UPPER_BOUND)

    companion object {
        const val RANDOM_UPPER_BOUND = 10
    }
}
