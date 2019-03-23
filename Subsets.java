import java.io.*;
import java.util.*;

public class Subsets{
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(Solution.subsets(nums));
	}
}

class Solution {
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		dfs(nums, 0, new ArrayList<Integer>(), ret);
		return ret;
	}
	private void dfs(int[] nums, int start, List<Integer> item, List<List<Integer>> ret){
		ret.add(new ArrayList<Integer>(item));
		//add current List
		for (int i = start; i < nums.length; i++) {
			item.add(nums[i]);
			dfs(nums, i+1, item, ret);
			item.remove(item.size()-1);
		}
	}
}