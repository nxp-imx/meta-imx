# Add needed Freescale packages and definitions

SOC_TOOLS_TEST_mx6ul = "imx-test"
SOC_TOOLS_TEST_mx7 = "imx-test"

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS_${PN}-fslcodec-testapps += " \
    imx-codec-test-bin \
    imx-codec-test-source \
"

ALLOW_EMPTY_${PN}-fslcodec-testapps = "1"

# Install i.MX specific UAPI headers to rootfs
SOC_UAPI_HEADERS = "${@base_conditional('PREFERRED_PROVIDER_virtual/kernel','linux-imx','linux-imx-soc-headers','',d)}"

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
"

SOC_TOOLS_TESTAPPS = ""
SOC_TOOLS_TESTAPPS_mx6 += " \
    imx-kobs \
    vlan \
    cryptodev-module \
    cryptodev-tests \
    ${PN}-fslcodec-testapps \
"
SOC_TOOLS_TESTAPPS_mx6ul += " \
    imx-kobs \
    vlan \
    cryptodev-module \
    cryptodev-tests \
    ${PN}-fslcodec-testapps \
"
SOC_TOOLS_TESTAPPS_mx7 += " \
    imx-kobs \
    vlan \
    cryptodev-module \
    cryptodev-tests \
    ${PN}-fslcodec-testapps \
"

