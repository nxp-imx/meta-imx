# icu is needed for the chromium 71 version as it need the inspector module as part of the build
# http://lists.openembedded.org/pipermail/openembedded-devel/2018-September/120658.html

DEPENDS_append = " pkgconfig-native icu"

# Override the do_configure () to include icu changes
do_configure () {
    rm -rf ${S}/deps/openssl
    export LD="${CXX}"
    GYP_DEFINES="${GYP_DEFINES}" export GYP_DEFINES
    # $TARGET_ARCH settings don't match --dest-cpu settings
   ./configure --prefix=${prefix} --without-snapshot --shared-openssl --shared-zlib \
               --with-intl=system-icu \
               --dest-cpu="${@map_nodejs_arch(d.getVar('TARGET_ARCH'), d)}" \
               --dest-os=linux \
               ${ARCHFLAGS}
}
