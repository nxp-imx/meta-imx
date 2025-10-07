DEPENDS:append = " ninja-native"

do_configure:prepend() {
    # FIXME: Drop this when meta-flutter is migrated to Styhead
    ln -sf ${UNPACKDIR}/BUILD.gn.in ${WORKDIR}/BUILD.gn.in
}
