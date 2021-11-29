FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch"

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
