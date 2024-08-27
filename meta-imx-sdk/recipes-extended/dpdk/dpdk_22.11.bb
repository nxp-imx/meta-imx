DESCRIPTION = "Intel(r) Data Plane Development Kit"
HOMEPAGE = "http://dpdk.org"

LICENSE = "BSD-3-Clause & LGPL-2.1-only & GPL-2.0-only"
LIC_FILES_CHKSUM = "file://license/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://license/lgpl-2.1.txt;md5=4b54a1fd55a448865a0b32d41598759d \
                    file://license/bsd-3-clause.txt;md5=0f00d99239d922ffd13cabef83b33444"

DEPENDS = "numactl python3-pyelftools-native libpcap"

SRC_URI = "${DPDK_SRC};nobranch=1"
DPDK_SRC ?= "git://github.com/nxp-qoriq/dpdk;protocol=https"

STABLE = "-stable"
SRCREV = "9298b898fe38482fbb293d431cdeea4297c17e70"

CVE_PRODUCT = "data_plane_development_kit"

S = "${WORKDIR}/git"

inherit meson

PACKAGECONFIG ??= "examples"

PACKAGECONFIG[afxdp] = ",,libbpf"
PACKAGECONFIG[examples] = "-Denable_examples_bin_install=true -Dexamples=${DPDK_EXAMPLES},-Denable_examples_bin_install=false"
PACKAGECONFIG[libvirt] = ",,libvirt"

DPDK_EXAMPLES ?= ""
DPDK_EXAMPLES:imx-nxp-bsp = "l2fwd,l3fwd"
DPDK_EXAMPLES:append:mx95-nxp-bsp = ",ip_fragmentation,ip_reassembly"

EXTRA_OEMESON = " \
    -Ddrivers_install_subdir= \
    -Denable_examples_source_install=false \
"
EXTRA_OEMESON:append:mx8-nxp-bsp = " --cross-file ${S}/config/arm/arm64_poky_linux_gcc"
EXTRA_OEMESON:append:mx9-nxp-bsp = " --cross-file ${S}/config/arm/arm64_imx_poky_linux_gcc"

do_install:append() {
    # FIXME: fix the source so it doesn't install this nonsense file with embedded wildcards
    rm -f ${D}${libdir}/'librte_*.so*'
}

RDEPENDS:${PN} = "kernel-module-dpdk-extras pciutils python3-core"

COMPATIBLE_MACHINE = "(imx-nxp-bsp|qoriq)"
