# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS_${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
"

ALLOW_EMPTY_${PN}-fslcodec-testapps = "1"

# Install i.MX specific UAPI headers to rootfs
SOC_UAPI_HEADERS = ""
SOC_UAPI_HEADERS_imx = "${@base_conditional('PREFERRED_PROVIDER_virtual/kernel','linux-imx','linux-imx-soc-headers','',d)}"

SOC_TOOLS_IMX_TESTAPPS = " \
    imx-kobs \
    vlan \
    cryptodev-module \
    cryptodev-tests \
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TESTAPPS = ""
SOC_TOOLS_TESTAPPS_imx = "${SOC_TOOLS_IMX_TESTAPPS}"

RDEPENDS_${PN} += " \
    ${SOC_TOOLS_TESTAPPS} \
    ${SOC_UAPI_HEADERS} \
    procps \
    ptpd \
    linuxptp \
    iw \
    can-utils \
    cpufrequtils \
    nano \
    ntpdate \
    minicom \
    coreutils \
    mmc-utils \
    udev-extraconf \
    e2fsprogs-resize2fs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'tk', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston-examples', '', d)} \
"
