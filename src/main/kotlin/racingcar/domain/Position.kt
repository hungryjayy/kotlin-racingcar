package racingcar.domain

data class Position(var position: Int = 0) {
    fun accelerate() = this.position++
}
