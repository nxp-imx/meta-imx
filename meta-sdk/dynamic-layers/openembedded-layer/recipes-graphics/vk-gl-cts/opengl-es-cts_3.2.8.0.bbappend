FILESEXTRAPATHS:prepend := "${THISDIR}/${BP}:"

SRC_URI += " \
    file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
    file://0001-CL489625-escts-3.2.8-Fix-escts3.2.8-fail-on-8mm-boar.patch \
"
SRC_URI:remove = " \
    file://0001-Workaround-for-GCC-11-uninit-variable-warnings-946.patch;patchdir=external/amber/src \
    file://0001-Include-limits-header-for-numeric_limits.patch;patchdir=external/vulkancts \
"

PACKAGECONFIG ?= " \
    egl \
    gles2 \
    ${@bb.utils.filter('DISTRO_FEATURES', 'opengl wayland x11', d)} \
"

PACKAGECONFIG[egl]     = ",,virtual/egl"
PACKAGECONFIG[gles1]   = ",,virtual/libgles1"
PACKAGECONFIG[gles2]   = ",,virtual/libgles2"
PACKAGECONFIG[opengl]  = ",,virtual/libgl"
PACKAGECONFIG[x11]     = ",,libxcb libx11 libxrandr"
PACKAGECONFIG[wayland] = "-DDEQP_TARGET=wayland,,wayland"

CTSDIR = "/opt/${BPN}"
