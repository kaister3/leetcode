char* reverseStr(char* s, int k)
{
	//每个 2k 个字符
	int length = strlen(s);
	char *result = (char*)malloc(sizeof(char)*length);	
	int index = 0;
	int temp;
	while(index < length)
	{
		if ((length - index) > k)
		{
			for (int i = index, j = index + k - 1; i < j; i++, j--)
			{
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
			index += 2*k;
		}else
		{
			for (int i = index, j = length - 1; i < j; i++, j--)
			{
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
			index = length;
		}
	}
	return s;
}