DESCRIPTION = "DPDK based Fast Path Routing"
HOMEPAGE = "http://dpdk.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f00d99239d922ffd13cabef83b33444"

DEPENDS = "dpdk"

SRC_URI = "${DPDK_FPR_SRC};branch=${SRCBRANCH}"
DPDK_FPR_SRC ?= "git://github.com/nxp/dpdk-fpr;protocol=https"

SRCBRANCH = "main"
SRCREV = "acd7f3b4b56627591355bee3d16fd23b58ba0021"


inherit pkgconfig

do_install() {
    install -d ${D}${sysconfdir}/dpdk-fpr
    install -d ${D}${bindir}
    install -m 0644 ${S}/nxp/*.txt ${D}${sysconfdir}/dpdk-fpr/
    install -m 0644 ${S}/nxp/fpr*.conf ${D}${sysconfdir}/dpdk-fpr/
    install -m 0755 ${S}/nxp/up ${D}${sysconfdir}/dpdk-fpr/
    install -m 0755 ${S}/app/dpdk-fpr ${D}${bindir}/
}

RDEPENDS:${PN} += " socat kernel-module-dpdk-extras"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx943-nxp-bsp|mx95-nxp-bsp)"
