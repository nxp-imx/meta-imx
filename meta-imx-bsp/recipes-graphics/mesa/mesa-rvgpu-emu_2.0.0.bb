# Copyright (C) 2025 NXP
SUMMARY = "Mesa emulated RISC-V GPU renderer"
DESCRIPTION = "Mesa graphics renderer providing improved software-based performance via emulated RISC-V GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "c5d57b28a780b1ebce6e0c918bc224250678168369f7b22c0c8a9e4229a5bb58"

IMX_SRCREV_ABBREV = "8d58e9e"

inherit fsl-eula2-unpack2 fsl-eula-recent

# Libraries are unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# Install includes RISC-V firmware
FILES:${PN} += "${nonarch_base_libdir}/firmware"
INSANE_SKIP:${PN} += "arch"

BBCLASSEXTEND = "native nativesdk"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx943-nxp-bsp)"
