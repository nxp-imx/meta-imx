# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "i.MX alsa-lib plugins"
LICENSE = "GPLv2"
SECTION = "multimedia"
DEPENDS = "alsa-lib virtual/kernel"

# Make sure kernel sources are available
do_configure[depends] += "virtual/kernel:do_shared_workdir"

LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7b7e581d59d862b4862fcf6d68746a8"
SRC_URI[sha256sum] = "b80f5bb0b2030822f4baf4147829715add4bce2d46837b8a80223f4ca7ceb41b"


INCLUDE_DIR = "-I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

EXTRA_OECONF = "CFLAGS="${INCLUDE_DIR}""

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += "${libdir}/alsa-lib/libasound_*.so"
FILES_${PN}-dbg += "${libdir}/alsa-lib/.debug"
FILES_${PN}-dev += "${libdir}/alsa-lib/*.la"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6ul = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx7 = "${MACHINE_SOCARCH}"
