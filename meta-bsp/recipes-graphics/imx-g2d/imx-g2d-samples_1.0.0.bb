SUMMARY = "i.MX G2D Samples"
DESCRIPTION = "Set of sample applications for i.MX G2D"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0858ec9c7a80c4a2cf16e4f825a2cc91"

DEPENDS = "virtual/libg2d"

GPU_G2D_SAMPLES_SRC ?= "git://github.com/nxpmicro/g2d-samples.git;protocol=https"
SRCBRANCH ?= "master"
SRC_URI = "${GPU_G2D_SAMPLES_SRC};branch=${SRCBRANCH}"
SRCREV = "57da8a73ccc1dd19cb1b39d2913ad3694770fbc5"

S = "${WORKDIR}/git"

# Wayland samples require DPU
PACKAGECONFIG_WAYLAND = ""
PACKAGECONFIG_WAYLAND:imxdpu = "${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)}"

PACKAGECONFIG ??= "${PACKAGECONFIG_WAYLAND}"
PACKAGECONFIG[wayland] = "USE_WAYLAND=true,USE_WAYLAND=false,wayland-native wayland-protocols"

EXTRA_OEMAKE += " \
    SDKTARGETSYSROOT=${STAGING_DIR_HOST} \
    ${PACKAGECONFIG_CONFARGS} \
"

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES:${PN} += "/opt"
