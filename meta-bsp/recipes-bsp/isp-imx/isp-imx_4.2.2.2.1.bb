# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

inherit fsl-eula-unpack systemd

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "4f27fde105a322a01d3f81cdfeb54764"
SRC_URI[sha256sum] = "21ef9a88a4c17e6f0688b610a0b55cc87a4769cabfe72dc3fdf8abc2a49ec92d"

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
