# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "67e2ff83ad2b97a4cd43ba709476653d"
SRC_URI[sha256sum] = "cff1e26cb5c63ebb9eeab1e7ceee280d8c744ab4c3e2e5625844dd2bc110f388"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP:${PN} = "already-stripped"

FILES:${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"

INSANE_SKIP:append:libc-musl = " file-rdeps"

RDEPENDS:${PN}:append:libc-musl = " gcompat"
