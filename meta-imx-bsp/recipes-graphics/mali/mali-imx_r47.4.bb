require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

SRC_URI[md5sum] = "903f6b7d7c0f6d8ba2ea1a4f589223d9"
SRC_URI[sha256sum] = "9845cad1e2fe025251b99adc7bd85aa6eeb2537868355e22ceb553e121cf0f3f"
IMX_SRCREV_ABBREV = "54cab89"

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
