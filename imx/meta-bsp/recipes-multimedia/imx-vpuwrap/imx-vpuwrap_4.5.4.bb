# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Multimedia VPU wrapper"
DEPENDS = "virtual/imxvpu"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "6bee27e0a25246c245b40cc805c8ec5f"
SRC_URI[sha256sum] = "18b7d8fc43527c559d62d6787a6a96e2ea32dd78e501133b4b99b081fa59e787"

inherit fsl-eula-unpack autotools pkgconfig

do_install_append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Compatible only for i.MX with VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpu = "${MACHINE}"
