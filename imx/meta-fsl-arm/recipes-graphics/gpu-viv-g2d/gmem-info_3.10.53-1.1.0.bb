# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Tool to trace gpu memory info"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

inherit fsl-eula-unpack

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

DEPENDS += "gpu-viv-bin-mx6q"

SRC_URI = "${FSL_MIRROR}/gpu-viv-g2d-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/gpu-viv-g2d-${PV}"

SRC_URI[md5sum] = "e214ec2267819ee8a725afd6919b7b68"
SRC_URI[sha256sum] = "ccbb4f5daeb22a35f57775401ba430c5f4398e41211aee70dc451fcb1f051bdf"

do_install () {
    install -d ${D}${bindir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
}

FILES_${PN} += "  ${bindir}/gmem_info "

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
