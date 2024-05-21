require mali-imx.inc

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

SRC_URI[md5sum] = "5c6a6d3d41323fdae7da7c913c1c85fc"
SRC_URI[sha256sum] = "fd4f72938efa873923f59ad9907b46186353f823c6f8d9699c04dc5d4a0f968f"
IMX_SRCREV_ABBREV = "e27b629"

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
