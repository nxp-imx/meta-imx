# Splitter kernel module build in another recipe
# Build tools and examples here
include dpdk.inc

DEPENDS = "numactl python3-pyelftools-native libpcap"

S = "${WORKDIR}/git"

inherit meson


PACKAGECONFIG ??= " examples"
PACKAGECONFIG[examples] = " -Dexamples=${DPDK_EXAMPLES},,"
PACKAGECONFIG[afxdp] = ",,libbpf"
PACKAGECONFIG[libvirt] = ",,libvirt"
PACKAGECONFIG[kmods] = " -Denable_kmods=true, -Denable_kmods=false"

DPDK_EXAMPLES ?= "l2fwd,l3fwd,cmdif,l2fwd-qdma,l2fwd-crypto,ipsec-secgw,vhost,kni,ip_fragmentation,ip_reassembly"
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

FILES:${PN} = "${bindir}/dpdk* \
"
RDEPENDS:${PN} += "pciutils python3-core"

COMPATIBLE_MACHINE = "(imx-nxp-bsp|qoriq)"
