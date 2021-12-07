package racingcar

import racingcar.domain.NumberPolicy

class MovableNumberGenerator : NumberPolicy {
    override fun generate() = 4
}
