package leetcode150.arrayshashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContainsDuplicateTest : FunSpec({
    val solution = ContainsDuplicate()

    test("중복이 있으면 true") {
        val nums = intArrayOf(1, 2, 3, 3)
        solution.hasDuplicate(nums) shouldBe true
        solution.hasDuplicateWithSet(nums) shouldBe true
    }

    test("중복이 없으면 false") {
        val nums = intArrayOf(1, 2, 3, 4)
        solution.hasDuplicate(nums) shouldBe false
        solution.hasDuplicateWithSet(nums) shouldBe false
    }

    test("빈 배열은 false") {
        val nums = intArrayOf()
        solution.hasDuplicate(nums) shouldBe false
        solution.hasDuplicateWithSet(nums) shouldBe false
    }
})
