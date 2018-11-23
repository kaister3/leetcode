void moveZeroes(int* nums, int numsSize)
{
	//正序找零，倒序找一个下表最大的不为0的数与它交换，然后结束
	for (int i = 0; i < numsSize; i++)
	{
		if (!nums[i])
		{
			for (int j = i + 1; j < numsSize; j++)
			{
				if (nums[j])
				{
					nums[i] = nums[j];
					nums[j] = 0;
					break;
				}
			}
		}
	}
}