int strStr(char* haystack, char* needle) {
    //检查needle是否是haystack的子串
    int length_h = strlen(haystack);
    int length_n = strlen(needle);
    int equal_flag = 0;
    if (!length_n)
    {
    	return 0;
    }
    for (int i = 0; i < length_h; i++)
    {
    	if (haystack[i] == needle[0])
    	{
    		equal_flag = 1;
    		//start examination
    		for (int j = 0; j < length_n; j++)
    		{
    			if (haystack[i+j]!=needle[j])
    			{
    				equal_flag = 0;
    				break;
    				//if not equal breakout
    			}
    		}
    		if (equal_flag)
    		{
    			return i;
    		}
    	}
    }
    return -1;
} 