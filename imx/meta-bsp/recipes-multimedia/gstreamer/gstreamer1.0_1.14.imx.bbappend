inherit ptest

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

SRCBRANCH = "imx-1.14.x"
SRC_URI_append = " \
    file://add-a-target-to-compile-tests.patch \
    file://run-ptest \
"
SRCREV = "d42548da09724ad8cc1aa4f1944607920be2f4c0" 
PV = "1.14.4.imx"
S = "${WORKDIR}/git"

PACKAGECONFIG ??= "${@bb.utils.contains('PTEST_ENABLED', '1', 'tests', '', d)} \
                   "
PACKAGECONFIG[unwind] = "--with-unwind,--without-unwind,libunwind"
PACKAGECONFIG[dw] = "--with-dw,--without-dw,elfutils"

RDEPENDS_${PN}-ptest += "make"

do_compile_ptest() {
        oe_runmake build-checks
}

do_install_ptest() {
        oe_runmake -C tests/check DESTDIR=${D}${PTEST_PATH} install-ptest
        install -m 644 ${B}/tests/check/Makefile ${D}${PTEST_PATH}
        install -m 755 ${S}/test-driver ${D}${PTEST_PATH}
        sed -e 's,--sysroot=${STAGING_DIR_TARGET},,g' \
            -e 's|${DEBUG_PREFIX_MAP}||g' \
            -e 's:${HOSTTOOLS_DIR}/::g' \
            -e 's:${RECIPE_SYSROOT_NATIVE}::g' \
            -e 's:${BASE_WORKDIR}/${MULTIMACH_TARGET_SYS}::g' \-e 's/^Makefile:/_Makefile:/' \
            -e 's/^srcdir = \(.*\)/srcdir = ./' -e 's/^top_srcdir = \(.*\)/top_srcdir = ./' \
            -e 's/^builddir = \(.*\)/builddir = ./' -e 's/^top_builddir = \(.*\)/top_builddir = ./' \
            -i ${D}${PTEST_PATH}/Makefile
}
CVE_PRODUCT = "gstreamer"

