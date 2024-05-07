require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[md5sum] = "2c101103596e5e2845a42ca2f6cc7a7f"
SRC_URI[sha256sum] = "81e5ad79da507b013bc36baac2033650d47ec3e25601b64d463ac066351a70e8"
IMX_SRCREV_ABBREV = "25e94c5"

S = "${WORKDIR}/git"

inherit fsl-eula2-unpack2 fsl-eula-recent

do_install:append() {
    # Move firmware to nonarch_base_libdir
    if [ "${base_libdir}" != "${nonarch_base_libdir}" ]; then
        install -d ${D}${nonarch_base_libdir}
        mv ${D}${base_libdir}/firmware ${D}${nonarch_base_libdir}
    fi
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
