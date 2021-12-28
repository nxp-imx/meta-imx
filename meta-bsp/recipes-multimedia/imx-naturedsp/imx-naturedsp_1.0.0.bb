# Copyright 2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "i.MX NatureDSP Firmware Binary, Test Applications"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "6acf5dd3e4f2c848a0cbd66abfd7ecdf"
SRC_URI[sha256sum] = "c55fde5ddd22c426505d9641f437ca950d5de97b202ad81384bca1ba94107c7d"

EXTRA_OECONF = "--datadir=${base_libdir}/firmware --bindir=/unit_tests ${@bb.utils.contains('TUNE_FEATURES', 'aarch64', '--enable-armv8', ' ', d)}"

HIFI4_BIN ?= "hifi4_naturedsp_imx8qmqxp.bin"
HIFI4_BIN:mx8qm = "hifi4_naturedsp_imx8qmqxp.bin"
HIFI4_BIN:mx8qxp = "hifi4_naturedsp_imx8qmqxp.bin"
HIFI4_BIN:mx8mp = "hifi4_naturedsp_imx8mp.bin"
HIFI4_BIN:mx8ulp = "hifi4_naturedsp_imx8ulp.bin"

# No need to do install about fsl_unia.h & fsl_types.h, which are duplicate with the ones' in imx-codec
do_install:append () {
    # Install different DSP Firmware according to the platform
    if [ -f ${D}/lib/firmware/imx/dsp/${HIFI4_BIN} ]; then
        # Rename DSP Firmware and remove unneeded binary
        echo "---Rename ${D}/lib/firmware/imx/dsp/${HIFI4_BIN} to ${D}/lib/firmware/imx/dsp/hifi4_naturedsp.bin---"
        mv ${D}/lib/firmware/imx/dsp/${HIFI4_BIN} ${D}/lib/firmware/imx/dsp/hifi4_naturedsp.bin
        find ${D}/lib/firmware/imx/dsp -name hifi4_naturedsp*.bin -not -name hifi4_naturedsp.bin -exec rm {} \;
    fi
}

#INSANE_SKIP:${PN} = "already-stripped arch ldflags dev-so"
FILES:${PN} = " \
               ${base_libdir}/firmware/imx/dsp \
               /unit_tests \
"
INSANE_SKIP:${PN} = "arch"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8qm|mx8qxp|mx8mp|mx8ulp)"
