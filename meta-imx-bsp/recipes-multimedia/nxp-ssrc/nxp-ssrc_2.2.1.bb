# Copyright 2024 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "c2b59d4"

SRC_URI[sha256sum] = "2c1d556a86f3e7715b234b6c8b03688869ee7e74c3b6dd50167915a77627c811"

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
