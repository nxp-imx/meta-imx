# Copyright (C) 2025 NXP
SUMMARY = "Mesa emulated RISC-V GPU renderer"
DESCRIPTION = "Mesa graphics renderer providing improved software-based performance via emulated RISC-V GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[sha256sum] = "97b1beee04fbb9f26da22377fd61509c57b341b9985ec5ead4258f2905c9ffc2"

IMX_SRCREV_ABBREV = "345aa9d"

inherit fsl-eula2-unpack2 fsl-eula-recent

# Libraries are unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# Install includes RISC-V firmware
FILES:${PN} += "${nonarch_base_libdir}/firmware"
INSANE_SKIP:${PN} += "arch"

BBCLASSEXTEND = "native nativesdk"

COMPATIBLE_MACHINE = "(mx93-nxp-bsp|mx943-nxp-bsp)"
