package com.example.kotest

import io.kotest.core.spec.style.FunSpec

class TestSpec : FunSpec({
    beforeTest {
        println("Starting a test $it")
    }
    afterTest { (test, result) ->
        println("Finished spec with result $result")
    }
    test("sample") {
            println("Johnny5 is alive!")
    }
})