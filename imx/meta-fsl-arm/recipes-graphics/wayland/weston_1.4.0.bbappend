FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-ENGR00306154-3-ccc-Add-Wayland-1.4.0-support.patch \
            file://weston.sh"

do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/
}

FILES_${PN} += "${sysconfdir}/profile.d/weston.sh"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"
