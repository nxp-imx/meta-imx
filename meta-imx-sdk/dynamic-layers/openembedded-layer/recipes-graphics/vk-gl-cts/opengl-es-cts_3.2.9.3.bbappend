FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
    file://0002-CL489625-escts-3.2.8-Fix-escts3.2.8-fail-on-8mm-boar.patch \
    file://0003-Fix-transform-feedback-issue.patch"
SRC_URI:append:imxgpu = " ${GPU_PATCHES}"
GPU_PATCHES             = ""
GPU_PATCHES:mx6-nxp-bsp = "file://0004-LF-4977-imx-2949-Add-patch-to-change-the-precison-re.patch"
GPU_PATCHES:mx7-nxp-bsp = "${GPU_PATCHES:mx6-nxp-bsp}"

PACKAGECONFIG ?= "egl ${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[egl] = ",,virtual/egl"
PACKAGECONFIG[x11] = ",,libxcb libx11 libxrandr"

CTSDIR = "/opt/${BPN}"
