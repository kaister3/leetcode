int removeDuplicates(int* nums, int numsSize) {
	if (!numsSize)
	{
		return 0;
	}
    int *temp = (int*)malloc(sizeof(int)*numsSize);
    for (int i = 0; i < numsSize; i++)
    {
    	temp[i] = nums[i];
    }//copy
    int new_index = 0;
    for (int j = 0; j < numsSize; j++)
    {
    	if (temp[j] != nums[new_index])
    	{
    		nums[++new_index] = temp[j];
    	}
    }
    return new_index+1;
}