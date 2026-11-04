package leetcode150.arrays_hashing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContainsDuplicateTest : FunSpec({
    val solution = ContainsDuplicateSolution()

    test("중복이 있으면 true") {
        val nums = intArrayOf(1, 2, 3, 3)
        solution.hasDuplicate(nums) shouldBe true
        solution.hasDuplicate_A(nums) shouldBe true
        solution.hasDuplicate_B(nums) shouldBe true
    }

    test("중복이 없으면 false") {
        val nums = intArrayOf(1, 2, 3, 4)
        solution.hasDuplicate(nums) shouldBe false
        solution.hasDuplicate_A(nums) shouldBe false
        solution.hasDuplicate_B(nums) shouldBe false
    }
})
