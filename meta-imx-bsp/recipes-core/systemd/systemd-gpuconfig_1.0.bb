SUMMARY = "i.MX GPU Configuration for systemd boot mode"
DESCRIPTION = "Use systemd service to implement the former script rc_gpu.S and other scripts"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = " file://gpuconfig \
            file://gpuconfig.service \
"
S = "${WORKDIR}"

RDEPENDS:${PN} = "systemd"

do_install () {
    install -d ${D}${sysconfdir}
    install -d ${D}${systemd_unitdir}/system/
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/

    install -m 0755 ${WORKDIR}/gpuconfig ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/gpuconfig.service ${D}${systemd_unitdir}/system

    # Enable the gpuconfig.service
    ln -sf ${systemd_unitdir}/system/gpuconfig.service \
            ${D}${sysconfdir}/systemd/system/multi-user.target.wants/gpuconfig.service
}

FILES:${PN} = "${systemd_unitdir}/system/*.service ${sysconfdir}"

# As this package is tied to systemd, only build it when we're also building systemd.
python () {
    if not bb.utils.contains ('DISTRO_FEATURES', 'systemd', True, False, d):
        raise bb.parse.SkipPackage("'systemd' not in DISTRO_FEATURES")
}
