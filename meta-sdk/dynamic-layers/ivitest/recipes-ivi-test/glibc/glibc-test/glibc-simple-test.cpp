#include <cstdio>

int main(int argc, char** argv)
{
#ifdef __GLIBCPP__
	std::printf("GLIBCPP version is %d\n",__GLIBCPP__);
#elif __GLIBCXX__
	std::printf("GLIBCXX version is %d\n",__GLIBCXX__);
#elif
	std::printf("Could not determine libstdc++ version\n");
#endif
	return 0;
}
