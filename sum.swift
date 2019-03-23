class Solution {
	func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
		var i = 0
		var j = 0
		for number1: Int in nums {
			for number2: Int in nums{
				if (number2 + number1 == target) {
					return [i, j]
				}
				j = j + 1
			}
			i = i + 1
		}
		return [0, 0]
	}

}