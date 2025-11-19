DESCRIPTION = "eXpress Data Path FastPath Networking Application"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94fa01670a2a8f2d3ab2de15004e0848"

DEPENDS = "clang-cross-${TARGET_ARCH} elfutils libbpf zlib zstd"

SRC_URI = "${DPDK_XDP_SRC};branch=${SRCBRANCH}"
DPDK_XDP_SRC ?= "git://github.com/nxp-imx/imx-xdp-fp;protocol=https"
SRCBRANCH = "fpr"
SRCREV = "7c3d8605ba9d989772c92ee5be28ae7b9b800fca"

S = "${WORKDIR}/git"

export SDKTARGETSYSROOT = "${STAGING_DIR_TARGET}"

do_install() {
    oe_runmake install INSTALLDIR=${D}/opt/xdp
    install -m 0644 ${S}/app/input.txt ${D}/opt/xdp
}

FILES:${PN} = "/opt"
INSANE_SKIP:${PN} = "buildpaths"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp)"
