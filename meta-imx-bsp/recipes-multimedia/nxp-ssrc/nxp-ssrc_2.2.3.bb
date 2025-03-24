# Copyright 2024,2025 NXP

DESCRIPTION = "NXP synchronous sample rate converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "5865e8f"

SRC_URI[sha256sum] = "5b17bc08b262c24c4f07145277706a8615ea9015c655ee2144b59eb975bf22dc"

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

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
