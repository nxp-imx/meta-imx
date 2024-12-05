# Copyright 2024 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "90fef91"

SRC_URI[sha256sum] = "18d1ed502d8985aa8dafc6c3100f2fe4d5c2d721b3926fa68e23f7ca4b1e6ebb"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --bindir=/unit_tests/ --libdir=${libdir}"

PACKAGES += "${PN}-test-source"

python __anonymous() {
    # Avoid Debian-renaming, we shouldn't rename the packages to follow its sonames.
    for p in d.getVar('PACKAGES').split():
        d.setVar("DEBIAN_NOAUTONAME:%s" % p, "1")
}

FILES:${PN} += "/unit_tests/NXP_SSRC/* "
FILES:${PN}-test-source += "${datadir}/imx-mm/*"

# make sure dev gets into rootfs when add test source code
RRECOMMENDS:${PN}-test-source = "${PN}-dev"

COMPATIBLE_MACHINE = "(mx9-nxp-bsp)"
