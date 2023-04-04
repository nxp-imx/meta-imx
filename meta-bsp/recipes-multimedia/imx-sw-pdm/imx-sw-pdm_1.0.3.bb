# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "9fb5eb3f448bd1ce791d4249b7e689f1"
SRC_URI[sha256sum] = "9e5a203ad4f9ed6024fe4bb612813f35172c2aaa0fd96be9e6522fdb46d13f0a"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP:${PN} = "already-stripped"

FILES:${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"

INSANE_SKIP:append:libc-musl = " file-rdeps"

RDEPENDS:${PN}:append:libc-musl = " gcompat"
