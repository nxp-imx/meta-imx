SUMMARY = "i.MX G2D Samples"
DESCRIPTION = "Set of sample applications for i.MX G2D"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

DEPENDS = "virtual/libg2d"

GPU_G2D_SAMPLES_SRC ?= "git://github.com/nxpmicro/gtec-g2d-samples.git;protocol=https"
SRCBRANCH ?= "bugfix/mgs-6405-format-g2d-test"
SRC_URI = "${GPU_G2D_SAMPLES_SRC};branch=${SRCBRANCH}"
SRCREV = "0391ff3a9f14df1b5ef4e2a59559572fe4b30338"
S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=${exec_prefix}
}

FILES_${PN} += "/opt"
