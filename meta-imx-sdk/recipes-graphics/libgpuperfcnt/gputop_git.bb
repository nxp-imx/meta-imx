# Copyright 2017-2025 NXP

DESCRIPTION = "Sample program to monitor i.MX GPU performance data"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bcacc6777a7173f8b95b5d1e0ac341ae"

DEPENDS = "libgpuperfcnt"

GPUTOP_SRC ?= "git://github.com/nxp-imx/imx-gputop.git;protocol=https"
SRCBRANCH = "release"
SRC_URI = "${GPUTOP_SRC};branch=${SRCBRANCH} "
SRCREV = "10a5ca8f383ac1df9e4cd87c979d7e1db531acf2"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:mx95-nxp-bsp = "mali"

PACKAGECONFIG[mali] = "-DMALI_GPU=1,,,,,vivante"
PACKAGECONFIG[vivante] = ",,,,,mali"

do_compile:append () {
    oe_runmake -C ${S} man
}

do_install:append() {
	install -d ${D}/${mandir}
	install -m 0444 ${S}/man/* ${D}/${mandir}
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
PACKAGES = "${PN}"
FILES:${PN} += "${mandir}/*"
INSANE_SKIP:${PN} += "installed-vs-shipped dev-so rpaths dev-deps"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
