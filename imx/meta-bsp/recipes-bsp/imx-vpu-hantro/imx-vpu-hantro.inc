# Copyright 2017 NXP

DESCRIPTION = "i.MX HANTRO VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://vpu/EULA.txt;md5=b063366b066c9f10037c59756a9ced54"
DEPENDS = "virtual/kernel"
inherit fsl-eula-unpack

PARALLEL_MAKE="-j 1"

PROVIDES = "virtual/imxvpu"
RPROVIDES_${PN} = "virtual/imxvpu"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

do_compile () {

    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" LINUX_KERNEL_ROOT="${STAGING_KERNEL_DIR}" SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" all
}

do_install () {
    oe_runmake DEST_DIR="${D}" install
}

FILES_${PN} += "/unit_tests"

PACKAGE_ARCH = "${MACHINE_ARCH}"
