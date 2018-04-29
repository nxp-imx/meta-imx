SUMMARY_append = " (with i.MX support)"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# Use i.MX fork of weston for customizations.
SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
SRC_URI_remove = "file://weston-gl-renderer-Set-pitch-correctly-for-subsampled-textures.patch"
SRC_URI_remove = "file://fix-missing-header.patch"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRCBRANCH = "weston-imx-3.0"
SRC_URI_prepend = "${WESTON_SRC};branch=${SRCBRANCH} "
SRCREV = "5b77bec4e4a1bd6bd0e205cd4bc9864616bcc494"
S = "${WORKDIR}/git"

# Define RECIPE_SYSROOT since it doesn't exist in morty
# for this backported recipe
RECIPE_SYSROOT = "${STAGING_DIR}/${MACHINE}"

# Use FBDEV for parts that support it
EXTRA_OECONF_IMX_FBDEV          = ""
EXTRA_OECONF_IMX_FBDEV_imxfbdev = "WESTON_NATIVE_BACKEND=fbdev-backend.so"
EXTRA_OECONF_append_imxgpu      = " ${EXTRA_OECONF_IMX_FBDEV}"

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
    install -d ${WESTON_INI_DEST_DIR}
    install -m 0644 ${WESTON_INI_SRC} ${WESTON_INI_DEST_DIR}
}

FILES_${PN} += "${sysconfdir}/xdg/weston"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
