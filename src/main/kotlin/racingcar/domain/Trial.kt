package racingcar.domain

data class Trial(val trialCount: Int) {
    init {
        require(trialCount > TRIAL_LOWER_BOUND) { TRIAL_NUMBER_ERROR_MESSAGE }
    }

    companion object {
        const val TRIAL_LOWER_BOUND = 0
        const val TRIAL_NUMBER_ERROR_MESSAGE = "시도 횟수는 최소 1회 이상 가능합니다."
    }
}
