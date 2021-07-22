# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS_${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
"

ALLOW_EMPTY_${PN}-fslcodec-testapps = "1"

# Update SOC_TOOLS_TEST defined in meta-freescale-distro
SOC_TOOLS_TEST_append_imx    = " \
    imx-kobs \
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TEST_append_mx8qm  = " imx-seco-libs dvbapp-tests"
SOC_TOOLS_TEST_append_mx8x   = " imx-seco-libs"
SOC_TOOLS_TEST_append_mx8m   = " kernel-tools-virtio"

RDEPENDS_${PN} += " \
    can-utils \
    coreutils \
    cpufrequtils \
    cryptodev-module \
    cryptodev-tests \
    e2fsprogs-resize2fs \
    iw \
    linuxptp \
    kernel-tools-pci \
    minicom \
    mmc-utils \
    nano \
    ntpdate \
    openssl-bin \
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
    ${@bb.utils.contains('MACHINE_FEATURES', 'qca6174', 'qca-tools', \
       bb.utils.contains('MACHINE_FEATURES', 'qca9377', 'qca-tools', \
                                                                 '', d), d)} \
"
