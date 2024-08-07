# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS:${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
    ${RDEPENDS_CODEC_SRC} \
"
RDEPENDS_CODEC_SRC             = ""
RDEPENDS_CODEC_SRC:mx9-nxp-bsp = " \
    nxp-ssrc-test-source \
"

ALLOW_EMPTY:${PN}-fslcodec-testapps = "1"

# Update SOC_TOOLS_TEST defined in meta-freescale-distro
SOC_TOOLS_TEST:append:imx-nxp-bsp    = " \
    imx-kobs \
    kernel-tools-iio \
    kernel-tools-pci \
    kernel-tools-virtio \
    kernel-tools-vsock \
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TEST:append:mx8qm-nxp-bsp  = " dvbapp-tests"

SOC_TOOLS_TEST:imxgpu  = "imx-test ${SOC_TOOLS_TEST_VIVANTE}"
SOC_TOOLS_TEST_VIVANTE             = ""
SOC_TOOLS_TEST_VIVANTE:mx6-nxp-bsp = "imx-gpu-viv-demos"
SOC_TOOLS_TEST_VIVANTE:mx7-nxp-bsp = "imx-gpu-viv-demos"
SOC_TOOLS_TEST_VIVANTE:mx8-nxp-bsp = "imx-gpu-viv-demos"

RDEPENDS:${PN} += " \
    bridge-utils \
    can-utils \
    coreutils \
    cpufrequtils \
    cryptodev-module \
    cryptodev-tests \
    ${@bb.utils.contains('MACHINE_FEATURES', 'dpdk', '${RDEPENDS_DPDK}', '', d)} \
    e2fsprogs-resize2fs \
    gnutls-bin \
    iw \
    libp11 \
    linuxptp \
    media-ctl \
    minicom \
    mmc-utils \
    nano \
    ntp \
    openssl-bin \
    openssl-engines \
    parted \
    pciutils \
    procps \
    ptpd \
    python3-pip \
    screen \
    spidev-test \
    tmux \
    udev-extraconf \
    vlan \
    zstd \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'tk', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-examples', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'hostapd sigma-dut', '', d)} \
"

RDEPENDS_DPDK ?= "dpdk ${RDEPENDS_DPDK_FPR}"
RDEPENDS_DPDK_FPR = ""
RDEPENDS_DPDK_FPR:mx95-nxp-bsp = "dpdk-fpr"
