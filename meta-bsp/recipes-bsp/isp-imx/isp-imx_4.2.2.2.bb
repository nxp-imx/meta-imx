# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

inherit fsl-eula-unpack systemd

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "796b494b97e7c356aa43bff5384b1b3e"
SRC_URI[sha256sum] = "4f8e494140dcf9006fa37b8e3a9b9df03d8b1f2d7a1b0bfa0b1e2b491f665a9f"

SYSTEMD_SERVICE_${PN} = "imx8-isp.service"

do_install() {
    install -d ${D}/${libdir}
    install -d ${D}/${includedir}
    install -d ${D}/opt/imx8-isp/bin
    cp -r ${S}/opt/imx8-isp/bin/* ${D}/opt/imx8-isp/bin
    cp -r ${S}/usr/lib/* ${D}/${libdir}
    cp -r ${S}/usr/include/* ${D}/${includedir}
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
      install -d ${D}${systemd_system_unitdir}
      install -m 0644 ${S}/opt/imx8-isp/bin/imx8-isp.service ${D}${systemd_system_unitdir}
    fi
}

RDEPENDS_${PN} = "libdrm libpython2 bash"

PACKAGES = "${PN} ${PN}-dev ${PN}-dbg"

FILES_${PN} = "${libdir} /opt ${systemd_system_unitdir}/imx8-isp.service"
FILES_${PN}-dbg += "${libdir}/.debug"

INSANE_SKIP_${PN} += "rpaths dev-deps dev-so"
INSANE_SKIP_${PN}-dev += "rpaths dev-elf"
