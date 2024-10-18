FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
    file://0002-CL489625-escts-3.2.8-Fix-escts3.2.8-fail-on-8mm-boar.patch \
    file://0003-Fix-transform-feedback-issue.patch"

PACKAGECONFIG ?= "egl ${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[egl] = ",,virtual/egl"
PACKAGECONFIG[x11] = ",,libxcb libx11 libxrandr"

CTSDIR = "/opt/${BPN}"
