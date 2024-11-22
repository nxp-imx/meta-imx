DESCRIPTION = "mTCP on DPDK"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=189d0d4d51a8c303a7188b0932b735a9"

DEPENDS += "gmp numactl dpdk bc-native"

SRC_URI = "${MTCP_DPDK_SRC};nobranch=1"
MTCP_DPDK_SRC ?= "git://github.com/nxp-mcuxpresso/mtcp;protocol=https"

SRCREV = "3ba347ba8fae3a7cc52220d50c221af4c26d170b"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

export RTE_SDK = "${RECIPE_SYSROOT}/usr"
EXTRA_OECONF += "--with-dpdk-lib=$RTE_SDK"
B = "${S}"

do_configure() {
    export SYSROOT_DPDK=${PKG_CONFIG_SYSROOT_DIR}
    ${S}/configure --host aarch64-fsl-linux --with-dpdk-lib=${SYSROOT_DPDK}/usr
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
