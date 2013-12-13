include cryptodev.inc

SRC_URI += "file://makefile-fixup.patch \
            file://Add-the-compile-and-install-rules-for-cryptodev-test.patch"

DEPENDS += "openssl"

inherit module

EXTRA_OEMAKE += 'KERNEL_DIR="${STAGING_KERNEL_DIR}"'

PACKAGES += "${PN}-tests"

do_compile_append() {
    oe_runmake testprogs
}

do_install_append() {
    oe_runmake install_tests
}

RCONFLICTS_${PN} = "ocf-linux"

FILES_${PN}-dbg += "${bindir}/*/.debug"
FILES_${PN}-tests = "${bindir}/tests_cryptodev/*"
