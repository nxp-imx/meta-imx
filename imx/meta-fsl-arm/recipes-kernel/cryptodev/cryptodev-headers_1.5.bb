include cryptodev.inc

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    # Copy the need headers to allow openssl build
    install -d ${D}${includedir}/crypto
    install -m 0644 ${S}/crypto/*.h  ${D}${includedir}/crypto/

    install -d ${STAGING_DIR_TARGET}/crypto
    install -m 0644 ${S}/crypto/*.h  ${STAGING_DIR_TARGET}/crypto

}

ALLOW_EMPTY_${PN} = "1"
BBCLASSEXTEND = "native nativesdk"
