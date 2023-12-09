package com.example.kotest.member

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class MemberTest: FunSpec({
  test("年齢が0以下の場合、例外が発生") {
    forAll(
        row(0),
        row(-1)
    ) {age ->
      shouldThrow<IllegalArgumentException> {
        Member(age)
      }
    }
  }

  test("年齢が18歳以上の場合、成人") {
    forAll(
        row(18),
        row(19)
    ) { age ->
      val member = Member(age)
      member.isAdult() shouldBe true
    }
  }

  test("年齢が17歳以下の場合、未成年") {
    val member = Member(17)
    member.isAdult() shouldBe false
  }
})