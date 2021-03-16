# Copyright 2021 NXP
DESCRIPTION = "i.MX HANTRO V4L2 Daemon"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

inherit fsl-eula-unpack


SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "aa2f3e55a9fac73b1c58d06cdaae9854"
SRC_URI[sha256sum] = "c5904481dc455cf408adc7a27de1e102be3138714fcf6ea4cfa1bb13e76fbb06"

DEPENDS += "imx-vpu-hantro"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"

PLATFORM_mx8mm = "IMX8MM"
PLATFORM_mx8mq = "IMX8MQ"
PLATFORM_mx8mp = "IMX8MP"

EXTRA_OEMAKE += " \
                  CROSS_COMPILE="${HOST_PREFIX}" \
                  SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" \
                  CTRLSW_HDRPATH="${STAGING_DIR_TARGET}"/usr/include \
"
do_compile () {
    oe_runmake PLATFORM="${PLATFORM}" all
}

do_install () {
    oe_runmake DEST_DIR="${D}" PLATFORM="${PLATFORM}" install
}

FILES_${PN} += "/usr/bin"

INSANE_SKIP_${PN} = "ldflags"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8mq|mx8mm|mx8mp)"

