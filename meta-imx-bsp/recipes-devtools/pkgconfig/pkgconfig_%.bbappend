do_install:append:class-nativesdk () {
    sed -e "s|@PATH_NATIVE@|\$OECORE_NATIVE_SYSROOT|" \
        -e "s|@LIBDIR_NATIVE@|\$OECORE_NATIVE_SYSROOT/usr/lib/pkgconfig|" \
        < ${UNPACKDIR}/pkg-config-native.in > ${B}/pkg-config-native
    install -m755 ${B}/pkg-config-native ${D}${bindir}/pkg-config-native
}
