# Splitter kernel module build in another recipe
# Build tools and examples here
include dpdk.inc

DEPENDS = "numactl python3-pyelftools-native"

S = "${WORKDIR}/git"

inherit meson

PACKAGECONFIG ??= " "
PACKAGECONFIG[afxdp] = ",,libbpf"
PACKAGECONFIG[libvirt] = ",,libvirt"

DPDK_EXAMPLES ?= "l2fwd,l3fwd,cmdif,l2fwd-qdma,l2fwd-crypto,ipsec-secgw,vhost,kni,ip_fragmentation,ip_reassembly"
DPDK_EXAMPLES:imx-nxp-bsp = "l2fwd,l3fwd"

# kernel module is provide by dpdk-module recipe, so disable here
EXTRA_OEMESON = " -Denable_kmods=false \
                -Dexamples=${DPDK_EXAMPLES} \
                --cross-file ${S}/config/arm/arm64_poky_linux_gcc \
"

do_install:append(){
    # remove usr/lib/*.so
    rm -rf ${D}/${libdir}/*.so*
    rm -rf ${D}/${libdir}/dpdk

    # remove  source files
    rm -rf ${D}/${datadir}/dpdk/examples/*

    # Install examples
    install -m 0755 -d ${D}/${datadir}/dpdk/examples/
    for dirname in ${B}/examples/dpdk-*
    do
        if [ ! -d ${dirname} ] && [ -x ${dirname} ]; then
            install -m 0755 ${dirname} ${D}/${datadir}/dpdk/examples/
        fi
    done
}

PACKAGES =+ "${PN}-examples ${PN}-tools"

FILES:${PN} = "${bindir}/dpdk-testpmd \
               ${bindir}/dpdk-proc-info \
"
RDEPENDS:${PN} += "pciutils python3-core"

FILES:${PN}-examples = " \
                        ${datadir}/dpdk/examples/* \
"
RDEPENDS:${PN}-examples += "bash"

FILES:${PN}-tools = " \
                     ${bindir}/dpdk-pdump \
                     ${bindir}/dpdk-test \
                     ${bindir}/dpdk-test-* \
                     ${bindir}/dpdk-*.py \
"

COMPATIBLE_MACHINE = "(imx-nxp-bsp|qoriq)"
