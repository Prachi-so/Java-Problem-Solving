Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. The rotation must be done in-place, meaning you should modify the original array and return it. Rotating by k steps means elements shifted past the end reappear at the beginning. If k is greater than the array length, rotate by k % nums.length.

Example 1: nums = [1,2,3,4,5,6,7], k = 3 → [5,6,7,1,2,3,4] (Rotate 1 step: [7,1,2,3,4,5,6], Rotate 2 steps: [6,7,1,2,3,4,5], Rotate 3 steps: [5,6,7,1,2,3,4])

Example 2: nums = [-1,-100,3,99], k = 2 → [3,99,-1,-100] (Rotate 1 step: [99,-1,-100,3], Rotate 2 steps: [3,99,-1,-100])

Constraints: 1 <= nums.length <= 10^5, -2^31 <= nums[i] <= 2^31 - 1, 0 <= k <= 10^5
