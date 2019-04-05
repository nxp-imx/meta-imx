#include <gnu/libc-version.h>
#include <stdio.h>

int main(int argc, char** argv)
{
	const char *info = gnu_get_libc_version();

	if (info != NULL)
		printf("GNU libc version is %s\n", info);
	else
		printf("Could not determine GNU libc version\n");

	return 0;
}
