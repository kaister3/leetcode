char* longestCommonPrefix(char** strs, int strSize)
{
	char *prefix = (char*)malloc(strlen(strs[0])*sizeof(char));
	//int string_index = 0;	
	if (!strSize)
	{
		return "";
	}
	if (strSize == 1)
	{
		return strs[0];
	}
	/**纵向比较：以第一个字符串长度为基准,对每个字符串的每个对应位置进行比较**/
	/**for (string_index = 0; string_index < strlen(strs[0]); string_index++)
	{
		for (i = 1; i < strSize; i++)
		{
			if (strs[0][string_index] != strs[i][string_index])
			{
				prefix[m] = '\0';
				return prefix;  
			}
		}
		prefix[m++] = strs[0][string_index];
	}**/
	prefix = strs[0];
	for (int i = 1; i < strSize; i++)
	{
		for (int j = 0; j < strlen(prefix); j++)
		{
			if (strs[i][j]!=strs[0][j])
			{
				prefix[j] = '\0';
				break;
			}
		}
	}
	return prefix;
}