# Copyright (C) 2025 NXP
SUMMARY = "Mesa emulated RISC-V GPU renderer"
DESCRIPTION = "Mesa graphics renderer providing improved software-based performance via emulated RISC-V GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "7a3f8352a394771fd6192439069b679c7e6ee3b548b828c407bd17bb53640410"

IMX_SRCREV_ABBREV = "59960e4"

inherit fsl-eula2-unpack2 fsl-eula-recent

# Libraries are unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# Install includes RISC-V firmware
FILES:${PN} += "${nonarch_base_libdir}/firmware"
INSANE_SKIP:${PN} += "arch"

BBCLASSEXTEND = "native nativesdk"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx943-nxp-bsp)"
