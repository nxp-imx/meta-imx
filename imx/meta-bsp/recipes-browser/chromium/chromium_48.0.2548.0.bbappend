FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Don't use X if it's running through Wayland

CHROMIUM_ENABLE_WAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '1', \
                      bb.utils.contains('DISTRO_FEATURES', 'x11', '0', \
                      '0', d),d)}"

SRC_URI_append_mx6sx = "\
        ${@oe.utils.conditional('CHROMIUM_ENABLE_WAYLAND', '1', ' file://chromium.patch', '', d)} \
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

VPU_PATCHES = "file://${PATCH_BASE_DIR}/common/0002-Add-VPU-video-decode-accelerator-to-Chromium-GPU-.patch"
CHROMIUM_IMX_VPU_PATCHES_mx8 += "${VPU_PATCHES}"

COMPATIBLE_MACHINE_aarch64 = "(.*)"

COMPATIBLE_MACHINE = "(mx6|mx8)"
