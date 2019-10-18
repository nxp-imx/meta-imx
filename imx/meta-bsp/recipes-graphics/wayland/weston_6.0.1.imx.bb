require recipes-graphics/wayland/weston_5.0.0.imx.bb

DEFAULT_PREFERENCE = ""

SRC_URI_remove = "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https;branch=weston-imx-5.0"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI_prepend = "${WESTON_SRC};branch=weston-imx-6.0.1 "
SRC_URI_remove = "file://0001-make-error-portable.patch"
SRC_URI_append_mx6sl = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'systemd wayland x11', ' file://weston.config', '', d)}"
SRC_URI_remove_mx8mq = " file://0001-weston.ini-using-argb8888-as-gbm-default-on-mscale-8.patch \
                         file://0002-weston.ini-configure-desktop-shell-size-in-weston-co.patch \
"
SRCREV = "ab864976ed5c4ebc0349ce0c0e84c47913636aa7"

EXTRA_OECONF += "--enable-autotools"

PACKAGECONFIG_remove = "wayland"

SOCNAME        = "none"
SOCNAME_mx7ulp = "7ulp"
SOCNAME_mx8mq  = "8mq"
SOCNAME_mx8mm  = "8mm"

uncomment() {
    if ! (grep "^#$1" $2); then
        bbfatal "Commented setting '#$1' not found in file $PWD/$2"
    fi
    sed -i -e 's,^#'"$1"','"$1"',g' $2
}

do_install_append() {
    if [ ! -e "${D}${sysconfdir}/xdg/weston/weston.ini" ]; then
        bbfatal "Upstream installation of weston.ini missing."
    fi
    if [ -z "${@bb.utils.filter('BBFILE_COLLECTIONS', 'aglprofilegraphical', d)}" ]; then
        if [ "${@bb.utils.filter('BBFILE_COLLECTIONS', 'ivi', d)}" ]; then
            WESTON_INI_SRC=${B}/ivi-shell/weston.ini
        else
            WESTON_INI_SRC=${B}/weston.ini
        fi
        WESTON_INI_DEST_DIR=${D}${sysconfdir}/xdg/weston
        install -d ${WESTON_INI_DEST_DIR}
        install -m 0644 ${WESTON_INI_SRC} ${WESTON_INI_DEST_DIR}
        cd ${WESTON_INI_DEST_DIR}
        case ${SOCNAME} in
        8mq)
            uncomment "gbm-format=argb8888" weston.ini
            uncomment "\\[shell\\]"         weston.ini
            uncomment "size=1920x1080"      weston.ini
            ;;
        7ulp|8mm)
            uncomment "use-g2d=1"           weston.ini
            ;;
        esac
        if "${@bb.utils.contains('PACKAGECONFIG', 'xwayland', 'true', 'false', d)}"; then
            uncomment "xwayland=true"       weston.ini
        fi
        cd -
    fi

    if [ -f ${WORKDIR}/weston.config ]; then
        install -Dm0755 ${WORKDIR}/weston.config ${D}${sysconfdir}/default/weston
    fi
}
