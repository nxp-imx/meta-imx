# Add needed Freescale packages and definitions

RDEPENDS_${PN}-gstreamer += " \
    gst-meta-debug \
"

RDEPENDS_${PN}-tools-testapps_mx6 = " \
    ${SOC_TOOLS_TESTAPPS} \
    ${@base_contains("MACHINE_GSTREAMER_PLUGIN", "gst-fsl-plugin", "gst-fsl-plugin-gplay", "", d)} \
    alsa-utils \
    alsa-tools \
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
    bluez4 \
    obexftp \
    procps \
"

SOC_TOOLS_TESTAPPS += " \
    iw \
    can-utils \
"

SOC_TOOLS_TESTAPPS_mx6 += " \
    imx-kobs \
"

# only add in cryptodev for non solo-lite mx6 devices
SOC_TOOLS_TESTAPPS_mx6q += " cryptodev "
SOC_TOOLS_TESTAPPS_mx6dl += " cryptodev "
SOC_TOOLS_TESTAPPS_mx6s += " cryptodev "
