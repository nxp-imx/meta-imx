FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Using the enhanced verison of connman script.
#   - Fixes the issue that 2 Ethernet port board failed to mount nfs rootfs
#   - Support below kernel IP cfg parameters:  ip=:::::eth0:dhcp
#     (Support static ip address like: ip=10.192.242.179:10.192.242.47:10.192.242.254:255.255.255.0:imx:eth0:off)

SRC_URI += " \
             file://replace-hardcode-and-add-EnvironmentFile-and-Wants.patch \
             file://connmand-env \
             file://connman-env.service \
"

do_install_append () {
    if ${@base_contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -m 0755 ${WORKDIR}/connmand-env ${D}${sbindir}/
        install -m 0644 ${WORKDIR}/connman-env.service  ${D}/${systemd_unitdir}/system/
        sed -i  -e 's,@SBINDIR@,${sbindir},g' \
                -e 's,@LIBDIR@,${libdir},g' \
                -e 's,@LOCALSTATEDIR@,${localstatedir},g' \
                ${D}${systemd_unitdir}/system/*.service
    fi
}

SYSTEMD_SERVICE_${PN} += "connman-env.service"

FILES_${PN} += "${systemd_unitdir}/system/connman-env.service"
