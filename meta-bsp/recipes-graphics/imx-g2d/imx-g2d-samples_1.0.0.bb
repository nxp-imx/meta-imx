SUMMARY = "i.MX G2D Samples"
DESCRIPTION = "Set of sample applications for i.MX G2D"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

DEPENDS = "virtual/libg2d"

GPU_G2D_SAMPLES_SRC ?= "git://github.com/nxpmicro/g2d-samples.git;protocol=https"
SRCBRANCH ?= "master"
SRC_URI = "${GPU_G2D_SAMPLES_SRC};branch=${SRCBRANCH}"
SRCREV = "733c7bb4b3e8f32ce2a9887fd26ed5e45c232969"
S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_install() {
    oe_runmake install DESTDIR=${D} PREFIX=${exec_prefix}
}

FILES_${PN} += "/opt"
