# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS_${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
"

ALLOW_EMPTY_${PN}-fslcodec-testapps = "1"

SOC_TOOLS_IMX_TESTAPPS = " \
    imx-kobs \
    vlan \
    cryptodev-module \
    cryptodev-tests \
    ${PN}-fslcodec-testapps \
"

SOC_TOOLS_TESTAPPS = ""
SOC_TOOLS_TESTAPPS_imx = "${SOC_TOOLS_IMX_TESTAPPS}"

# Overwrite the original setting in meta-freescale-distro layer
# imx-test should be installed on all i.MX SoC
SOC_TOOLS_TEST = ""
SOC_TOOLS_TEST_imx = "imx-test"
SOC_TOOLS_TEST_imxgpu  = "imx-test imx-gpu-viv-demos"

RDEPENDS_${PN} += " \
    ${SOC_TOOLS_TESTAPPS} \
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
