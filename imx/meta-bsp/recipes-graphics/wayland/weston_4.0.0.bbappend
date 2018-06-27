SUMMARY_append = " (with i.MX support)"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# Use i.MX fork of weston for customizations.
SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
SRC_URI += "file://0001-weston.ini.in-Modify-paths-to-point-to-right-directo.patch"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRCBRANCH = "weston-imx-4.0"
SRC_URI_prepend = "${WESTON_SRC};branch=${SRCBRANCH} "
SRCREV = "a400f041e68b25da8ef9f6376d30209e43b507fb"
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

# Disable G2D for parts without GPU support for 2D
IMX_EXTRA_OECONF_G2D          = " --disable-imxg2d"
IMX_EXTRA_OECONF_G2D_imxgpu2d = ""
EXTRA_OECONF_append = "${IMX_EXTRA_OECONF_G2D}"

# drm is not supported on mx6/mx7
PACKAGECONFIG_remove_mx6 = "kms"
PACKAGECONFIG_remove_mx7 = "kms"

PACKAGECONFIG_append_imxgpu3d = " cairo-glesv2"

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
