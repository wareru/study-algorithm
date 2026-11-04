/**
 * Topics : Arrays & Hashing
 * Contains Duplicate
 *
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 *
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 *
 * Constraints:
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
class Solution {
    /**
     * 1. 처음 든 생각
     * set을 사용해서 크기가 줄어들면 중복이 있다는 뜻
     */
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }

    /**
     * A. HashSet
     * 중복을 발견한 순간 return true로 함수를 종료할 수 있다.
     *
     * HashSet.add()는
     * - 새로운 값이면 추가하고 true 반환
     * - 이미 존재하는 값이면 추가하지 않고 false 반환
     */
    fun hasDuplicate_A(nums: IntArray): Boolean {
        val set = HashSet<Int>()

        for (num in nums) {
            if (!set.add(num)) return true
        }

        return false
    }

    /**
     * B. MutableSet
     */
    fun hasDuplicate_B(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (!set.add(num)) return true
        }

        return false
    }

}
