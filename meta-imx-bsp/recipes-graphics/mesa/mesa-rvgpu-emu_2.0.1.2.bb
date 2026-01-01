# Copyright (C) 2025 NXP
SUMMARY = "Mesa emulated RISC-V GPU renderer"
DESCRIPTION = "Mesa graphics renderer providing improved software-based performance via emulated RISC-V GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[sha256sum] = "f75621b18c70c0acd609a59ad11bc394119664002f8776de25acc1a8c969e0c7"

IMX_SRCREV_ABBREV = "a02d6e3"

inherit fsl-eula2-unpack2 fsl-eula-recent

# Libraries are unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# Install includes RISC-V firmware
FILES:${PN} += "${nonarch_base_libdir}/firmware"
INSANE_SKIP:${PN} += "arch"

BBCLASSEXTEND = "native nativesdk"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx943-nxp-bsp)"
