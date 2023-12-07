# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS:${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
"

ALLOW_EMPTY:${PN}-fslcodec-testapps = "1"

# Update SOC_TOOLS_TEST defined in meta-freescale-distro
SOC_TOOLS_TEST:append:imx-nxp-bsp    = " \
    imx-kobs \
    kernel-tools-iio \
    kernel-tools-pci \
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TEST:append:mx8qm-nxp-bsp  = " imx-seco-libs dvbapp-tests"
SOC_TOOLS_TEST:append:mx8x-nxp-bsp   = " imx-seco-libs"
SOC_TOOLS_TEST:append:mx8m-nxp-bsp   = " kernel-tools-virtio"
SOC_TOOLS_TEST:mx95-nxp-bsp   = "imx-test"

RDEPENDS:${PN} += " \
    can-utils \
    coreutils \
    cpufrequtils \
    cryptodev-module \
    cryptodev-tests \
    ${@bb.utils.contains('MACHINE_FEATURES', 'dpdk', 'dpdk dpdk-examples', '', d)} \
    e2fsprogs-resize2fs \
    gnutls-bin \
    iw \
    libp11 \
    linuxptp \
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
