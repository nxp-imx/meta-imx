# Copyright 2018-2021 NXP

DESCRIPTION = "i.MX DSP Codec Wrapper and Lib owned by NXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "1301613791dfa0c2b38325309b67fdbb"
SRC_URI[sha256sum] = "5f6e85dfc6c5c1a37adf205e50f024a6ac612fbd868d64a5c4745893fb261534"

# Fix strip command failed: 'Unable to recognise the format of the input file'
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INSANE_SKIP:${PN} = "arch dev-so ldflags"

DSP_PLATFORM:mx8qm-nxp-bsp  = "imx8qmqxp"
DSP_PLATFORM:mx8qxp-nxp-bsp = "imx8qmqxp"
DSP_PLATFORM:mx8mp-nxp-bsp  = "imx8m"
DSP_PLATFORM:mx8dx-nxp-bsp  = "imx8m"
DSP_PLATFORM:mx8ulp-nxp-bsp = "imx8ulp"
do_install() {
    install -d ${D}${libdir}/imx-mm/audio-codec/dsp

    cp -rfv ${S}/release/lib/dsp/${DSP_PLATFORM}/lib*so ${D}${libdir}/imx-mm/audio-codec/dsp
}

FILES:${PN} += "${libdir}/imx-mm/audio-codec/dsp ${datadir}/imx-mm"
COMPATIBLE_MACHINE = "(mx8qm-nxp-bsp|mx8qxp-nxp-bsp|mx8dx-nxp-bsp|mx8mp-nxp-bsp|mx8ulp-nxp-bsp)"
