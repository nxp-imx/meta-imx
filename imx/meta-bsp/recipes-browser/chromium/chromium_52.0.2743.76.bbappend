FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Add changes from meta-fsl-arm

include chromium-imx.inc

#CHROMIUM_IMX_BRANCH = "master"
#CHROMIUM_IMX_SRCREV = "4a2d15ab899b9944bb3adb2ddd250530da5b2e1a"
CHROMIUM_IMX_COMMON_PATCHES_remove_mx6 = "file://${PATCH_BASE_DIR}/common/0001-Enable-share-group-workaround-for-Vivante-GPUs.patch"

CHROMIUM_IMX_WAYLAND_PATCHES += "file://${PATCH_BASE_DIR}/wayland/0001-Modify-eglwayland-versions-for-Vivante-GPUs.patch"

# Don't use X if it's running through Wayland

CHROMIUM_ENABLE_WAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '1', \
                      bb.utils.contains('DISTRO_FEATURES', 'x11', '0', \
                      '0', d),d)}"

# This is the workaround for the segfault when running google-chrome

PACKAGECONFIG[ignore-gpu-blacklist] = ""
PACKAGECONFIG_append = " ignore-gpu-blacklist"

CHROMIUM_EXTRA_ARGS_append = " \
	${@bb.utils.contains('PACKAGECONFIG', 'ignore-gpu-blacklist', '--ignore-gpu-blacklist', '', d)} \ 
"

# Remove packages as Chromium is changed to statically link against ffmpeg.

PACKAGES_remove = "${PN}-codecs-ffmpeg ${PN}-plugin-pdf"

# chromium changes for mx7ulp

SRC_URI_append_mx7ulp = " file://fix_buildbreak_toolchain_7ulp.patch"

# chromium changes for mx8 (64 bit)

SRC_URI_append_mx8 = " file://chromium_aarch64_buildbreak.patch"

COMPATIBLE_MACHINE_aarch64 = "(.*)"

COMPATIBLE_MACHINE = "(mx6|7ulp|mx8)"
