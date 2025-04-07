PACKAGECONFIG ?= "egl ${@bb.utils.filter('DISTRO_FEATURES', 'wayland x11', d)}"

PACKAGECONFIG[egl] = ",,virtual/egl"
PACKAGECONFIG[x11] = ",,libxcb libx11 libxrandr"

CTSDIR = "/opt/${BPN}"
