#include <curl/curl.h>
#include <stdio.h>

int main(int argc, char** argv)
{
	char *info = NULL;
	info = curl_version( );

	if (info != NULL)
		printf("libcurl version is %s\n", info);
	else
		printf("Could not determine libcurl version\n");

	return 0;
}
