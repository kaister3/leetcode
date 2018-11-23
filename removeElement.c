int removeElement(int* nums, int numsSize, int val)
{
	/**
	***function:
	***delete all the elements equals to val
	**/
	int* temp = (int*)malloc(sizeof(int)*numsSize);
	for (int i = 0; i < numsSize; i++)
	{
		temp[i] = nums[i];
	}//copy
	int index = 0;
	for (int j = 0; j < numsSize; j++)
	{
		if (temp[j] != val)
		{
			nums[index++] = temp[j];
		}
	}
	return index;
}