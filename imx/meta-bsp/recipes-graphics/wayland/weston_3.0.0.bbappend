SUMMARY_append = " (with i.MX support)"

DEPENDS_append_imxgpu2d = " virtual/libg2d"

# Use i.MX fork of weston for customizations.
SRC_URI_remove = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz"
WESTON_SRC ?= "git://source.codeaurora.org/external/imx/weston-imx.git;protocol=https"
SRCBRANCH = "weston-imx-3.0"
SRC_URI_prepend = "${WESTON_SRC};branch=${SRCBRANCH} "
SRCREV = "c91bb94e27a2f61bc6d397ecd5e71327f0ceed48"
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

PACKAGECONFIG_append_imxgpu3d = " cairo-glesv2"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
