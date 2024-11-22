DESCRIPTION = "mTCP on DPDK"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a36820ca4ad07a1d62df52c596df642"

DEPENDS += "gmp numactl dpdk bc-native"

SRC_URI = "${MTCP_DPDK_SRC};nobranch=1"
MTCP_DPDK_SRC ?= "git://github.com/nxp-mcuxpresso/mtcp;protocol=https"

SRCREV = "c1dee662b4d0e33c8bf2b6ee4feec27efd96a61d"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

export RTE_SDK = "${RECIPE_SYSROOT}/usr"
EXTRA_OECONF += "--with-dpdk-lib=$RTE_SDK"
B = "${S}"

do_configure() {
    export SYSROOT_DPDK=${PKG_CONFIG_SYSROOT_DIR}
    ${S}/configure --host aarch64-fsl-linux --with-dpdk-lib=${SYSROOT_DPDK}/usr --libdir=${libdir} --baselib=${baselib}
}

do_compile() {
    make setup-dpdk
    make
    make -C apps/perf
}

do_install() {
    install -d ${D}${bindir}/mtcp
    install -m 0755 ${S}/apps/perf/client           ${D}${bindir}/mtcp
    install -m 0755 ${S}/apps/example/epserver      ${D}${bindir}/mtcp
    install -m 0755 ${S}/apps/example/epwget        ${D}${bindir}/mtcp
    install -m 0644 ${S}/apps/example/epserver.conf ${D}${bindir}/mtcp
    install -m 0644 ${S}/apps/example/epwget.conf   ${D}${bindir}/mtcp
    install -m 0644 ${S}/apps/perf/client.conf      ${D}${bindir}/mtcp
    install -m 0644 ${S}/config/sample_route.conf   ${D}${bindir}/mtcp
    install -m 0644 ${S}/config/sample_arp.conf     ${D}${bindir}/mtcp
    install -m 0644 ${S}/README_nxp                 ${D}${bindir}/mtcp
}

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
