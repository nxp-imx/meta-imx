SUMMARY_append = " (with i.MX support)"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# Use i.MX fork of weston for customizations.
SRC_URI_remove_imxgpu  = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
WESTON_SRC ?= "git://git.freescale.com/imx/weston-imx.git;protocol=http"
SRCBRANCH = "weston-imx-2.0"
SRC_URI_prepend_imxgpu = "${WESTON_SRC};branch=${SRCBRANCH} "
SRCREV_imxgpu = "1a2d8db6da022340400eb6aa4485884303cb5e51"
S_imxgpu = "${WORKDIR}/git"

# Define RECIPE_SYSROOT since it doesn't exist in morty
# for this backported recipe
RECIPE_SYSROOT = "${STAGING_DIR}/${MACHINE}"

# Use FBDEV for parts that support it
EXTRA_OECONF_IMX_FBDEV          = ""
EXTRA_OECONF_IMX_FBDEV_imxfbdev = "WESTON_NATIVE_BACKEND=fbdev-backend.so"
EXTRA_OECONF_append_imxgpu      = " ${EXTRA_OECONF_IMX_FBDEV}"

# Disable OpenGL for parts with GPU support for 2D but not 3D
REQUIRED_DISTRO_FEATURES_remove_mx6sl = "opengl"
EXTRA_OECONF_append_mx6sl = " --disable-opengl"

PACKAGECONFIG_append_imxgpu3d = " cairo-glesv2"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
