package leetcode150.arrayshashing

class ContainsDuplicate {
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }

    fun hasDuplicateWithSet(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()

        for (num in nums) {
            if (!seen.add(num)) {
                return true
            }
        }

        return false
    }
}
