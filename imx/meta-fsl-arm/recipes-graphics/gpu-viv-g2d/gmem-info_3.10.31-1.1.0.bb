# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Tool to trace gpu memory info"

#require recipes-graphics/gpu-viv-g2d/gpu-viv-g2d.inc
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/gpu-viv-g2d-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/gpu-viv-g2d-${PV}"

SRC_URI[md5sum] = "5bf36981a865f8aaa9de90bc3db6645a"
SRC_URI[sha256sum] = "cd545032d191ebd2d7df5589911d49886406eddf4409130e4175f62b798a2433"

do_install () {
    install -d ${D}${bindir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
    find ${D}${bindir} -type f -exec chmod 644 {} \;
}

FILES_${PN} += "  ${bindir}/gmem_info "

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
