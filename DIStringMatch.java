class Solution {
	public int[] diStringMatch(String S) {
		int N = S.length();
		int preCount = 0;
		int postCount = N;
		int[] num = new int[N+1];
		int[] ret = new int[N+1];
		int index = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'I') {
				ret[index++] = preCount++;
			}
			else if(S.charAt(i) == 'D') {
				ret[index++] = postCount--;
			}
		}
		ret[N] = postCount;

		return ret;
	}
}