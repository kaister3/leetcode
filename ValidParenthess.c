bool isValid(char* s)
{
	int length = strlen(s);
	char *p = (char*)malloc(sizeof(char)*length);
	int n = 0;
	if (length == 0)
	{
		return true;
	}
	int flag1 = 0;
	int falg2 = 0;
	int flag3 = 0;
	for (int i = 0; i < length; ++i)
	{
		if (s[i] == '{' || s[i] == '[' || s[i] == '(')
		{
			switch(s[i])
		{
			case '{' : p[n++] = '}';break;
			case '[' : p[n++] = ']';break;
			case '(' : p[n++] = ')';break;
		}
		}else{
			if (s[i] == p[n-1])
			{
				n = n-1;
				p[n] = '\0';
			}
			else
			{
				return false;
			}
		}
	}
	return !(strlen(p));
}