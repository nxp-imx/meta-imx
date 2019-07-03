# Copyright (C) 2013-2018 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

DESCRIPTION = "Freescale VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

PROVIDES = "virtual/imxvpu"
RPROVIDES_${PN} = "virtual/imxvpu"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "12d42949b342b50365d24d148e67cf28"
SRC_URI[sha256sum] = "8b9fd257a2dd79dae1e208f08e56a4a47550b892a6f4e3b8fee0d6cbeb09ec12"

inherit fsl-eula-unpack use-imx-headers

PLATFORM = "IMX6Q"

do_compile() {
    INCLUDE_DIR="-I${STAGING_INCDIR_IMX}"
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

do_install() {
    oe_runmake PLATFORM="${PLATFORM}" DEST_DIR="${D}" install
}

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
