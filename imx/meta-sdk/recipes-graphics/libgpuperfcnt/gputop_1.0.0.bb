DESCRIPTION = "Sample program to monitor i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Proprietary;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"

DEPENDS = "libgpuperfcnt"

GPUTOP_SRC ?= "git://git.freescale.com/imx/gputop.git;protocol=git"
SRCBRANCH = "release"
SRC_URI = "${GPUTOP_SRC};branch=${SRCBRANCH} "
SRCREV = "b8a6fba7a2d076cae14f635b31ddd1a5d9500813" 

S = "${WORKDIR}/git"

inherit cmake pkgconfig

do_compile_append () {
    oe_runmake -C ${S} man
}

do_install_append() {
	install -d ${D}/${mandir}
	install -m 0444 ${S}/man/* ${D}/${mandir}
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
PACKAGES = "${PN}"
FILES_${PN} += "${mandir}/*"
INSANE_SKIP_${PN} += "installed-vs-shipped dev-so rpaths"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
