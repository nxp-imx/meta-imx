FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Add changes from meta-freescale

include chromium-imx.inc

CHROMIUM_IMX_BRANCH = "master"
CHROMIUM_IMX_SRCREV = "4a2d15ab899b9944bb3adb2ddd250530da5b2e1a"
CHROMIUM_IMX_COMMON_PATCHES += "file://${PATCH_BASE_DIR}/common/0001-Enable-share-group-workaround-for-Vivante-GPUs.patch"
# CHROMIUM_IMX_VPU_PATCHES_imxvpu += "file://${PATCH_BASE_DIR}/common/0002-Add-VPU-video-decode-accelerator-to-Chromium-GPU-.patch"

# Need to rebase the patch for new version
SRC_URI_remove = "file://0001-Remove-accelerated-Canvas-support-from-blacklist.patch"

# Remove packages as Chromium is changed to statically link against ffmpeg.

PACKAGES_remove = "${PN}-codecs-ffmpeg ${PN}-plugin-pdf"

COMPATIBLE_MACHINE_aarch64 = "(.*)"

COMPATIBLE_MACHINE = "(mx6|mx7ulp|mx8)"
