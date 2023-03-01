# Copyright 2018-2021 NXP

DESCRIPTION = "i.MX DSP Codec Wrapper and Lib owned by NXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479" 

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "01cb4664770b44b92b18f88954d9d46b"
SRC_URI[sha256sum] = "0f56b964af226356d3f288961d348e8d0fff21a9ae5226052881908216933634"

# Fix strip command failed: 'Unable to recognise the format of the input file'
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INSANE_SKIP:${PN} = "arch dev-so"

FILES:${PN} += "${libdir}/imx-mm/audio-codec ${datadir}/imx-mm"
COMPATIBLE_MACHINE = "(mx8qm-nxp-bsp|mx8qxp-nxp-bsp|mx8dx-nxp-bsp|mx8mp-nxp-bsp|mx8ulp-nxp-bsp)"
