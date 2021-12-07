package racingcar

import racingcar.domain.Cars
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumberPolicy
import racingcar.domain.Trial
import racingcar.view.errorMessage
import racingcar.view.inputCarNames
import racingcar.view.inputTrialNumber
import racingcar.view.showResult
import java.lang.Exception

fun main() {
    val result = RacingGame(getTrial(), getCars(), RandomNumberPolicy()).startGame()
    showResult(result)
}

private fun getTrial(): Trial {
    while (true) {
        try {
            return Trial(inputTrialNumber())
        } catch (error: Exception) {
            errorMessage(error)
        }
    }
}

private fun getCars(): Cars {
    while (true) {
        try {
            return Cars(inputCarNames())
        } catch (error: Exception) {
            errorMessage(error)
        }
    }
}
