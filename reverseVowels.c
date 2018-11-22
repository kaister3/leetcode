char* reverseVowels(char *s)
{
	int length = strlen(s);
	char *vow = (char*)malloc(sizeof(char)*length);
	int n = 0;
	for (int i = 0; i < length; i++)
	{
		if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u'
			|| s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
		{
			vow[n++] = s[i];
		}
	}//copy
	/*for (int j = 0, k = n - 1; j < k; j++, k--)
	{
		char temp = vow[j];
		vow[j] = vow[k];
		vow[k] = temp;
	}//reverse
	n = 0;*/
	n -=1;
	for (int i = 0; i < length; i++)
	{
		if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u'
			|| s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
		{
			s[i] = vow[n--];
		}
	}//replace
	return s;
}