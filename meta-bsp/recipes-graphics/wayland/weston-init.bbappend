FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG ??= " \
    no-idle-timeout \
    ${PACKAGECONFIG_REPAINT_WINDOW} \
    ${PACKAGECONFIG_USE_G2D}"

PACKAGECONFIG_REPAINT_WINDOW             ?= ""
PACKAGECONFIG_REPAINT_WINDOW:mx8-nxp-bsp ?= "repaint-window"
PACKAGECONFIG_REPAINT_WINDOW:mx9-nxp-bsp ?= "repaint-window"

PACKAGECONFIG_USE_G2D                ?= ""
PACKAGECONFIG_USE_G2D:imxgpu2d       ?= "use-g2d"
PACKAGECONFIG_USE_G2D:mx8qm-nxp-bsp  ?= ""
PACKAGECONFIG_USE_G2D:mx8qxp-nxp-bsp ?= ""
PACKAGECONFIG_USE_G2D:mx8dx-nxp-bsp  ?= ""
PACKAGECONFIG_USE_G2D:mx93-nxp-bsp   ?= "use-g2d"

PACKAGECONFIG[rdp] = ",,"
PACKAGECONFIG[repaint-window] = ",,"
PACKAGECONFIG[use-g2d] = ",,"

INI_UNCOMMENT_ASSIGNMENTS:remove = "repaint-window=16"
INI_UNCOMMENT_ASSIGNMENTS:remove = "use-g2d=1"

USE_G2D_VALUE             = "true"
USE_G2D_VALUE:mx6-nxp-bsp = "1"
USE_G2D_VALUE:mx7-nxp-bsp = "1"

update_file() {
    if ! grep -q "$1" $3; then
        bbfatal $1 not found in $3
    fi
    sed -i -e "s,$1,$2," $3
}

do_install:append() {
    # Add weston.log back, used by NXP for testing
    update_file "ExecStart=/usr/bin/weston " "ExecStart=/usr/bin/weston --log=\$\{XDG_RUNTIME_DIR\}/weston.log " ${D}${systemd_system_unitdir}/weston.service

    # FIXME: weston should be run as weston, not as root
    update_file "User=weston" "User=root" ${D}${systemd_system_unitdir}/weston.service
    update_file "Group=weston" "Group=root" ${D}${systemd_system_unitdir}/weston.service

    if [ "${@bb.utils.contains('PACKAGECONFIG', 'rdp', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "s|^command=${bindir}/weston .*|& --rdp-tls-cert=${sysconfdir}/freerdp/keys/server.crt --rdp-tls-key=${sysconfdir}/freerdp/keys/server.key|" ${D}${sysconfdir}/xdg/weston/weston.ini
        sed -i -e "/^\[core\]/a modules=screen-share.so" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi

    if [ "${@bb.utils.contains('PACKAGECONFIG', 'repaint-window', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "/^\[core\]/a repaint-window=16" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi

    if [ "${@bb.utils.contains('PACKAGECONFIG', 'use-g2d', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "/^\[core\]/a use-g2d=${USE_G2D_VALUE}" ${D}${sysconfdir}/xdg/weston/weston.ini
    else
        sed -i -e "/^\[core\]/a #use-g2d=${USE_G2D_VALUE}" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi
}
