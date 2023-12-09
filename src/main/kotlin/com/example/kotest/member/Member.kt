package com.example.kotest.member
class Member(
    private val age: Int,
) {
  init {
    require(age > 0)
  }

  /**
   * 会員が成人済みか判定する
   */
  fun isAdult(): Boolean {
    return age >= 18;
  }
}