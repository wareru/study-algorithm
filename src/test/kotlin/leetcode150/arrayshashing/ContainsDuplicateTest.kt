package leetcode150.arrayshashing

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
    private val solution = ContainsDuplicate()

    @Test
    fun `중복이 있으면 true`() {
        val nums = intArrayOf(1, 2, 3, 3)
        assertTrue(solution.hasDuplicate(nums))
        assertTrue(solution.hasDuplicateWithSet(nums))
    }

    @Test
    fun `중복이 없으면 false`() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertFalse(solution.hasDuplicate(nums))
        assertFalse(solution.hasDuplicateWithSet(nums))
    }

    @Test
    fun `빈 배열은 false`() {
        val nums = intArrayOf()
        assertFalse(solution.hasDuplicate(nums))
        assertFalse(solution.hasDuplicateWithSet(nums))
    }
}
