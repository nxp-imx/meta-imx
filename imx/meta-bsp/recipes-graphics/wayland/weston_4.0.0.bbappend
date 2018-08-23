SUMMARY_append = " (with i.MX support)"

# Use i.MX fork of weston for customizations.
SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
SRC_URI += "file://0001-weston.ini.in-Modify-paths-to-point-to-right-directo.patch"
# Use argb8888 as gbm-format for i.MX8MQ only
SRC_URI_append_mx8mq = " file://0001-weston.ini-using-argb8888-as-gbm-default-on-mscale-8.patch \
                         file://0002-weston.ini-configure-desktop-shell-size-in-weston-co.patch \
"

WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRCBRANCH = "weston-imx-4.0"
SRC_URI_prepend = "${WESTON_SRC};branch=${SRCBRANCH} "
SRCREV = "ef41ae049d113e369e5358786bd959516e13e940"
S = "${WORKDIR}/git"

EXTRA_OECONF_append_imxfbdev = " WESTON_NATIVE_BACKEND=fbdev-backend.so"

# Disable OpenGL for parts with GPU support for 2D but not 3D
IMX_REQUIRED_DISTRO_FEATURES_REMOVE          = ""
IMX_REQUIRED_DISTRO_FEATURES_REMOVE_imxgpu2d = "opengl"
IMX_REQUIRED_DISTRO_FEATURES_REMOVE_imxgpu3d = ""
REQUIRED_DISTRO_FEATURES_remove = "${IMX_REQUIRED_DISTRO_FEATURES_REMOVE}"
IMX_EXTRA_OECONF_OPENGL          = ""
IMX_EXTRA_OECONF_OPENGL_imxgpu2d = " --disable-opengl"
IMX_EXTRA_OECONF_OPENGL_imxgpu3d = ""
EXTRA_OECONF_append = "${IMX_EXTRA_OECONF_OPENGL}"

# drm is not supported on mx6/mx7
PACKAGECONFIG_remove_mx6 = "kms"
PACKAGECONFIG_remove_mx7 = "kms"

PACKAGECONFIG_append_imxgpu   = " imxgpu"
PACKAGECONFIG_append_imxgpu2d = " imxg2d"
PACKAGECONFIG_append_imxgpu3d = " cairo-glesv2"

PACKAGECONFIG[imxgpu] = "--enable-imxgpu,--disable-imxgpu"
PACKAGECONFIG[imxg2d] = "--enable-imxg2d,--disable-imxg2d,virtual/libg2d"

do_install_append() {
    if [ "${@bb.utils.filter('BBFILE_COLLECTIONS', 'ivi', d)}" ]; then
        WESTON_INI_SRC=${B}/ivi-shell/weston.ini
    else
        WESTON_INI_SRC=${B}/weston.ini
    fi
    WESTON_INI_DEST_DIR=${D}${sysconfdir}/xdg/weston
    if [ -z "${@bb.utils.filter('BBFILE_COLLECTIONS', 'aglprofilegraphical', d)}" ]; then
        install -d ${WESTON_INI_DEST_DIR}
        install -m 0644 ${WESTON_INI_SRC} ${WESTON_INI_DEST_DIR}
    fi
}

FILES_${PN} += "${sysconfdir}/xdg/weston"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
