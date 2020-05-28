# Copyright 2020 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack systemd

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "af2b934048df408aa2d5fa951655afed"
SRC_URI[sha256sum] = "e4caf991d5900dfcc624314a45fe67d982e5aa5ee78bd82dfd2daeef3cfbf588"

SYSTEMD_SERVICE_${PN} = "imx8-isp.service"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
      install -d ${D}${systemd_system_unitdir}
      install -m 0644 ${S}/opt/imx8-isp/bin/imx8-isp.service ${D}${systemd_system_unitdir}
    fi
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES_${PN} = "${libdir} /opt ${systemd_system_unitdir}/imx8-isp.service"
INSANE_SKIP_${PN} = "file-rdeps already-stripped"
