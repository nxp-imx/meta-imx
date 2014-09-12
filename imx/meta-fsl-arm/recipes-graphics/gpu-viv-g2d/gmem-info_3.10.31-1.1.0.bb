# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Tool to trace gpu memory info"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/include/g2d.h;endline=7;md5=53b61e015f8e1c386057c5ba8b081d53"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/gpu-viv-g2d-${PV}.bin;fsl-eula=true"
S="${WORKDIR}/gpu-viv-g2d-${PV}"

SRC_URI[md5sum] = "4f5e7537955ce62aa54bac037dcc1569"
SRC_URI[sha256sum] = "cbb1f03312d5eabcdba97db5e94bdc5cfb06220ff206f00179a9aebf622aceac"

do_install () {
    install -d ${D}${bindir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
    find ${D}${bindir} -type f -exec chmod 644 {} \;
}

FILES_${PN} += "  ${bindir}/gmem_info "

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
