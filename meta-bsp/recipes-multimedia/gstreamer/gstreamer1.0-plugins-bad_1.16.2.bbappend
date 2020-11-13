PV="1.16.2.imx"

DEPENDS += "jpeg libdrm"
DEPENDS_append_imxgpu2d = " virtual/libg2d"

GST1.0-PLUGINS-BAD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-bad.git;protocol=https"
SRCBRANCH = "imx-1.16.x"
SRCREV = "9aaee39ed9f0170ff5cea436e993d4e591f720e3"
SRC_URI = " \
    ${GST1.0-PLUGINS-BAD_SRC};branch=${SRCBRANCH} \
    file://configure-allow-to-disable-libssh2.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
"

S = "${WORKDIR}/git"

PACKAGECONFIG[tinycompress] = "--enable-tinycompress,--disable-tinycompress,tinycompress"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

PACKAGE_ARCH_imxpxp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"

PACKAGECONFIG_append_mx8 = " kms tinycompress"

#Remove vulkan as it's incompatible for i.MX 8M Mini
PACKAGECONFIG_remove_mx8mm = " vulkan"

# Disable introspection to fix [GstPlayer-1.0.gir] Error
EXTRA_OECONF += " \
    --disable-introspection \
"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
