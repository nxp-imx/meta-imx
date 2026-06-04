SUMMARY = "NXP RT-SDK ARA2"
DESCRIPTION = "Runtime SDK for AI/ML acceleration with Ara240 NPU on i.MX SoCs"
HOMEPAGE = "https://github.com/nxp-imx/rt-sdk-ara2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

require imx-nxp-ara2.inc

IMX_SRCREV_ABBREV = "496726b"
SRC_URI:append = " file://install.sh"
SRC_URI[sha256sum] = "ce48d228ffc2742e148b3023969c594327f20a98a38b6b6047d74972a41cff78"

inherit fsl-eula2-unpack2 fsl-eula-recent

do_install:append() {
    for dest in ${D}${datadir}/rt-sdk-ara240_*; do
        install -m 0755 ${UNPACKDIR}/install.sh $dest/install.sh
    done
}
