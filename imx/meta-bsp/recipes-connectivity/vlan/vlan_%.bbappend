# comment out MakeInclude in Makefile which sets build environment
do_configure_append () {
    sed -i 's/^include/#^include/' ${S}/Makefile
}
