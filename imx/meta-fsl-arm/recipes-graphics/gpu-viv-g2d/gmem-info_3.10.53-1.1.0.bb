# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Tool to trace gpu memory info"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

inherit fsl-eula-unpack

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

DEPENDS += "gpu-viv-bin-mx6q"

SRC_URI = "${FSL_MIRROR}/gpu-viv-g2d-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/gpu-viv-g2d-${PV}"

SRC_URI[md5sum] = "f5362f32e4a46d68a5c1711603759585"
SRC_URI[sha256sum] = "fc020f6dfafc3372356bcdac3d48ea63ad2d75d3bf9faaf4c91515fd5af293e7"

do_install () {
    install -d ${D}${bindir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
}

FILES_${PN} += "  ${bindir}/gmem_info "

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
