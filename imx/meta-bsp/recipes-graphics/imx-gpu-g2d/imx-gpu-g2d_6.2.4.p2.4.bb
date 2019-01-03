# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for i.MX with 2D GPU and no DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

DEPENDS += "libgal-imx"
PROVIDES += "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "4f1178c8dffd14e72fcd17a3162d5602"
SRC_URI[aarch64.sha256sum] = "a0fc395a2966ba6b93290fcab7c26cd91e8861b5e39de61c779a7fa70d71e8ae"
SRC_URI[arm.md5sum] = "eb8654bcdfed92812b152c3a39c85990"
SRC_URI[arm.sha256sum] = "0d5218115ff7ab62d70030567b8f2f448885a07f89eb657f6911003262ea8b87"

S="${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${includedir}"
INSANE_SKIP_${PN} = "ldflags"

RDEPENDS_${PN} = "libgal-imx"

COMPATIBLE_MACHINE = "(imxgpu2d)"
