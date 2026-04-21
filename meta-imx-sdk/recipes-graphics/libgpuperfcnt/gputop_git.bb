# Copyright 2017-2021 NXP

DESCRIPTION = "Sample program to monitor i.MX GPU performance data"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bcacc6777a7173f8b95b5d1e0ac341ae"

DEPENDS = "libgpuperfcnt"

GPUTOP_SRC ?= "git://github.com/nxp-imx/imx-gputop.git;protocol=https"
SRCBRANCH = "release"
SRC_URI = "${GPUTOP_SRC};branch=${SRCBRANCH} \
          file://0001-CMakeLists.txt-Update-cmake_minimum_required-to-3.5.patch"
SRCREV = "5913c90c6ed664b725407d7acc5bcf65c4722656"


inherit cmake pkgconfig

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:imxmali = "mali"

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
