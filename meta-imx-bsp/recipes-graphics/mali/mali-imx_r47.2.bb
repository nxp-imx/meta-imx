require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1142bc333cf4971d6b10bd8292363f02"

SRC_URI[md5sum] = "c13c9a961c65918d8057513c5adacfb3"
SRC_URI[sha256sum] = "f69a310adb8311b538c741ccc3aa8a94b422d35ee5fe372f10db7cdc11cf13ce"
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
