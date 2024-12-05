DESCRIPTION = "mTCP on DPDK"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a36820ca4ad07a1d62df52c596df642"

DEPENDS = "gmp numactl dpdk bc-native zlib"

SRC_URI = "${MTCP_DPDK_SRC};nobranch=1"
MTCP_DPDK_SRC ?= "git://github.com/nxp-mcuxpresso/mtcp;protocol=https"
SRCREV = "7198e5e38127f847747e2d413b3b449a8dbc20ad"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = "--host aarch64-fsl-linux --with-dpdk-lib=${STAGING_DIR_HOST}/usr"
B = "${S}"

do_configure() {
    ./configure --libdir=${libdir} --baselib=${baselib} ${EXTRA_OECONF}
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
