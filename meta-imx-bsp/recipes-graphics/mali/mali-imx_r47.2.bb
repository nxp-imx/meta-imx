require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[md5sum] = "b84887b8785217f57b962a52db8c0762"
SRC_URI[sha256sum] = "fd79be08d198a47162c921b30bcd2c66c7f679c271738f577f3da0b97a72e9e4"
IMX_SRCREV_ABBREV = "9d4eb26"

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
