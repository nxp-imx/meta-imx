# Add needed Freescale packages and definitions

PACKAGES += " \
    ${PN}-fslcodec-testapps \
"

RDEPENDS_${PN}-fslcodec-testapps_mx6 += " \
    libfslcodec-testapps \
"

RDEPENDS_${PN}-gstreamer += " \
    ${PN}-fslcodec-testapps \
"

ALLOW_EMPTY_${PN}-fslcodec-testapps_mx6 = "1"

RDEPENDS_${PN}_mx6 = " \
    ${SOC_TOOLS_TESTAPPS} \
    ${@base_contains("MACHINE_GSTREAMER_PLUGIN", "gst-fsl-plugin", "gst-fsl-plugin-gplay", "", d)} \
    alsa-utils \
    dosfstools \
    evtest \
    e2fsprogs-mke2fs \
    fsl-rc-local \
    gst-plugins-base-tcp \
    i2c-tools \
    imx-test \
    iproute2 \
    memtester \
    python-subprocess \
    python-datetime \
    python-json \
    ethtool \
    mtd-utils \
    mtd-utils-ubifs \
    obexftp \
    procps \
    ptpd \
    linuxptp \
    iw \
    can-utils \
"
# exclude it for poky master build error
#    alsa-tools 

SOC_TOOLS_TESTAPPS_mx6 += " \
    imx-kobs \
    vlan \
    cryptodev \
"

