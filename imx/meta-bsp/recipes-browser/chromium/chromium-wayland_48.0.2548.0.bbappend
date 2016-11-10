FILESEXTRAPATHS_prepend := "${THISDIR}/chromium:"

# Add changes from meta-fsl-arm

include chromium-imx.inc

CHROMIUM_IMX_BRANCH = "master"
CHROMIUM_IMX_SRCREV = "4a2d15ab899b9944bb3adb2ddd250530da5b2e1a"

VPU_PATCHES = "file://${PATCH_BASE_DIR}/common/0002-Add-VPU-video-decode-accelerator-to-Chromium-GPU-.patch"

# Don't use X if it's running through Wayland

CHROMIUM_ENABLE_WAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '1', \
                      bb.utils.contains('DISTRO_FEATURES', 'x11', '0', \
                      '0', d),d)}"

SRC_URI += "\
        ${@oe.utils.conditional('CHROMIUM_ENABLE_WAYLAND', '1', 'git://github.com/01org/ozone-wayland.git;destsuffix=${OZONE_WAYLAND_GIT_DESTSUFFIX};branch=${OZONE_WAYLAND_GIT_BRANCH};rev=${OZONE_WAYLAND_GIT_SRCREV}', '', d)} \
"
# This is the workaround for the segfault when running google-chrome

PACKAGECONFIG[ignore-gpu-blacklist] = ""
PACKAGECONFIG_append = " ignore-gpu-blacklist"

CHROMIUM_EXTRA_ARGS_append = " \
	${@bb.utils.contains('PACKAGECONFIG', 'ignore-gpu-blacklist', '--ignore-gpu-blacklist', '', d)} \ 
"

# Remove packages as Chromium is changed to statically link against ffmpeg.

PACKAGES_remove = "${PN}-codecs-ffmpeg ${PN}-plugin-pdf"


# chromium changes for mx8 (64 bit)

SRC_URI_append_mx8 = " file://fix_64bit_build_breaks.patch"

CHROMIUM_IMX_VPU_PATCHES_mx8 += "${VPU_PATCHES}"

COMPATIBLE_MACHINE_aarch64 = "(.*)"

COMPATIBLE_MACHINE = "(mx6|mx8)"
