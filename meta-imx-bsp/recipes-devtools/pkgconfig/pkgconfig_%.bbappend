do_install:append:class-nativesdk () {
    ln -sf pkg-config ${D}${bindir}/pkg-config-native
}
