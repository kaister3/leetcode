#include <stdio.h>
#include <string.h>
char* reverseString(char* s) 
{
	int length = strlen(s);
	printf("%d\n", length);
	//char *result = (char*)malloc(sizeof(char)*length);
	for (int i = 0, j = length - 1; i < j; i++, j--)
	{
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	return s;
}
int main(int argc, char const *argv[])
{
	char s[100];
	scanf("%s", s);
	reverseString(s);
	printf("%s\n", s);
	return 0;
}