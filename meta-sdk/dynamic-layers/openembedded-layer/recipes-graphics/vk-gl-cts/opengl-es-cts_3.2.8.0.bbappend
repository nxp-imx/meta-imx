FILESEXTRAPATHS:prepend := "${THISDIR}/${BP}:"

SRC_URI += " \
    file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
    file://0001-CL489625-escts-3.2.8-Fix-escts3.2.8-fail-on-8mm-boar.patch \
    file://0001-Handle-latest-Wayland-version.patch \
    file://0001-cmake-Define-WAYLAND_SCANNER-and-WAYLAND_PROTOCOLS_D.patch"

PACKAGECONFIG ?= " \
    egl \
    gles2 \
    ${@bb.utils.filter('DISTRO_FEATURES', 'opengl wayland x11', d)}"

PACKAGECONFIG[egl]     = ",,virtual/egl"
PACKAGECONFIG[gles1]   = ",,virtual/libgles1"
PACKAGECONFIG[gles2]   = ",,virtual/libgles2"
PACKAGECONFIG[opengl]  = ",,virtual/libgl"
PACKAGECONFIG[x11]     = ",,libxcb libx11 libxrandr"

CTSDIR = "/opt/${BPN}"
