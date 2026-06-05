# Copyright 2025 NXP
DESCRIPTION = "Connection Monitoring Manager for offloading kernel and register entity info "
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94fa01670a2a8f2d3ab2de15004e0848"
DEPENDS = "libnfnetlink libnetfilter-conntrack libxcrypt elfutils libbpf zlib libcli"

SRC_URI = "${DPDK_CMM_SRC};branch=${SRCBRANCH}"
DPDK_CMM_SRC ?= "git://github.com/nxp-imx/cmm;protocol=https"
SRCBRANCH = "xdp_cmm"
SRCREV = "4db6470481d60dd786e2e60fc44b1cb69f05e8e5"

inherit autotools pkgconfig

EXTRA_OECONF += "--with-cpal=bpf"

CFLAGS += "-DIPSEC_SUPPORT_DISABLED"

do_install:append() {
    install -d ${D}${sysconfdir}/cmm
    install -d ${D}${bindir}
    install -m 0755 ${S}/scripts/load_cmm_modules.sh ${D}${sysconfdir}/cmm
    install -m 0755 ${S}/scripts/network_setup.sh ${D}${sysconfdir}/cmm
    install -m 0755 ${S}/fastforward ${D}${bindir}/
}

RDEPENDS:${PN} += "bash"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp|mx943-nxp-bsp)"
