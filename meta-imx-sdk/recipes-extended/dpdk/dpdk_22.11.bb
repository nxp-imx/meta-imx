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
SRCREV = "edc4936f37351709c0f9be71fd6113954c8e190f"

CVE_PRODUCT = "data_plane_development_kit"

S = "${WORKDIR}/git"

inherit meson

PACKAGECONFIG ??= "examples"

PACKAGECONFIG[afxdp] = ",,libbpf"
PACKAGECONFIG[examples] = "-Dexamples=${DPDK_EXAMPLES}"
PACKAGECONFIG[libvirt] = ",,libvirt"

DPDK_EXAMPLES ?= ""
DPDK_EXAMPLES:imx-nxp-bsp = "l2fwd,l3fwd"
DPDK_EXAMPLES:append:mx95-nxp-bsp = ",ip_fragmentation,ip_reassembly"

EXTRA_OEMESON:append:mx8-nxp-bsp = " --cross-file ${S}/config/arm/arm64_poky_linux_gcc"
EXTRA_OEMESON:append:mx9-nxp-bsp = " --cross-file ${S}/config/arm/arm64_imx_poky_linux_gcc"

do_install:append(){
    # remove usr/lib/*.so
    rm -rf ${D}/${libdir}/*.so*
    rm -rf ${D}/${libdir}/dpdk

    # remove usr/bin/dpdk-dumpcap
    rm -rf ${D}/${bindir}/dpdk-dumpcap

    # remove  source files
    rm -rf ${D}/${datadir}

    # Install examples
    for dirname in ${B}/examples/dpdk-*
    do
        if [ ! -d ${dirname} ] && [ -x ${dirname} ]; then
            install -m 0755 ${dirname} ${D}/${bindir}/
        fi
    done
}

FILES:${PN} = "${bindir}/dpdk*"
RDEPENDS:${PN} += "kernel-module-dpdk-extras pciutils python3-core"

COMPATIBLE_MACHINE = "(imx-nxp-bsp|qoriq)"
