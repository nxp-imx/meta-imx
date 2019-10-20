require recipes-graphics/wayland/weston_7.0.0.bb

SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRC_URI_prepend = "${WESTON_SRC};branch=weston-imx-7.0 "
SRC_URI += "file://0003-weston-touch-calibrator-Advertise-the-touchscreen-ca.patch"
SRC_URI_append_mx6sl = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'systemd wayland x11', ' file://weston.config', '', d)}"
SRCREV = "1a7d7d15547d97aada3f2ff38370afa53f850f90"
S = "${WORKDIR}/git"

# Disable OpenGL for parts with GPU support for 2D but not 3D
REQUIRED_DISTRO_FEATURES_imxgpu2d = ""
REQUIRED_DISTRO_FEATURES_imxgpu3d = "opengl"
PACKAGECONFIG_OPENGL              = "opengl"
PACKAGECONFIG_OPENGL_imxgpu2d     = ""
PACKAGECONFIG_OPENGL_imxgpu3d     = "opengl"

EXTRA_OEMESON += "-Dsimple-dmabuf-drm=auto"

PACKAGECONFIG_remove = "wayland"
PACKAGECONFIG_append = " ${@bb.utils.filter('DISTRO_FEATURES', '${PACKAGECONFIG_OPENGL}', d)}"
PACKAGECONFIG_remove_imxfbdev = "kms"
PACKAGECONFIG_append_imxgpu   = " imxgpu"
PACKAGECONFIG_append_imxgpu2d = " g2d"
PACKAGECONFIG_append_imxgpu3d = " cairo-glesv2"

# Weston with cairo glesv2 support
PACKAGECONFIG[cairo-glesv2] = "-Dcairo-glesv2=true,-Dcairo=image"
# Weston with i.MX GPU support
PACKAGECONFIG[imxgpu] = "-Dimxgpu=true,-Dimxgpu=false"
# Weston with i.MX G2D renderer
PACKAGECONFIG[g2d] = "-Drenderer-g2d=true,-Drenderer-g2d=false,virtual/libg2d"
# Weston with OpenGL support
PACKAGECONFIG[opengl] = "-Dopengl=true,-Dopengl=false"

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
    if [ -z "${@bb.utils.filter('BBFILE_COLLECTIONS', 'aglprofilegraphical', d)}" ]; then
        if [ "${@bb.utils.filter('BBFILE_COLLECTIONS', 'ivi', d)}" ]; then
            WESTON_INI_SRC=${B}/ivi-shell/weston.ini
        else
            WESTON_INI_SRC=${B}/compositor/weston.ini
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

FILES_${PN} += "${sysconfdir}/xdg/weston"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(imxfbdev|imxgpu)"
