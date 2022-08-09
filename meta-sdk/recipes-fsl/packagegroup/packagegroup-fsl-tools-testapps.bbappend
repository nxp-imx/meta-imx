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
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TEST:append:mx8qm-nxp-bsp  = " imx-seco-libs dvbapp-tests"
SOC_TOOLS_TEST:append:mx8x-nxp-bsp   = " imx-seco-libs"
SOC_TOOLS_TEST:append:mx8m-nxp-bsp   = " kernel-tools-virtio"
SOC_TOOLS_TEST:append:mx8ulp-nxp-bsp = " imx-secure-enclave"
SOC_TOOLS_TEST:append:mx93-nxp-bsp = " imx-secure-enclave"

RDEPENDS:${PN} += " \
    can-utils \
    coreutils \
    cpufrequtils \
    cryptodev-module \
    cryptodev-tests \
    ${@bb.utils.contains('MACHINE_FEATURES', 'dpdk', 'dpdk dpdk-examples', '', d)} \
    e2fsprogs-resize2fs \
    iw \
    linuxptp \
    kernel-tools-iio \
    kernel-tools-pci \
    minicom \
    mmc-utils \
    nano \
    ntpdate \
    openssl-bin \
    openssl-engines \
    libp11 \
    gnutls-bin \
    pciutils \
    procps \
    ptpd \
    python3-pip \
    screen \
    spidev-test \
    tmux \
    udev-extraconf \
    vlan \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'tk', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-examples', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'hostapd sigma-dut', '', d)} \
"
