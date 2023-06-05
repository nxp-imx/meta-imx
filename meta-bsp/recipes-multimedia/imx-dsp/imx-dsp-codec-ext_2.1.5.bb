# Copyright 2018-2021,2023 NXP

DESCRIPTION = "i.MX DSP Codec Wrapper and Lib owned by NXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "8a800e7e70c544dbfd45658026c94150"
SRC_URI[sha256sum] = "1bc21b506272913d9e10c0c18a1dccfc1af3c3639ed11f4b8c95e4209421dc8d"

# Fix strip command failed: 'Unable to recognise the format of the input file'
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INSANE_SKIP:${PN} = "arch dev-so ldflags"

EXTRA_OECONF:append:mx8qm-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8qxp-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8dx-nxp-bsp = " --enable-imx8qmqxp"
EXTRA_OECONF:append:mx8mp-nxp-bsp = " --enable-imx8m"
EXTRA_OECONF:append:mx8ulp-nxp-bsp = " --enable-imx8ulp"

FILES:${PN} += "${libdir}/imx-mm/audio-codec/dsp ${datadir}/imx-mm"
COMPATIBLE_MACHINE = "(mx8qm-nxp-bsp|mx8qxp-nxp-bsp|mx8dx-nxp-bsp|mx8mp-nxp-bsp|mx8ulp-nxp-bsp)"
