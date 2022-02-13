require conf/distro/poky.conf

DISTRO = "imx-nxp"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "5.15-honister"

MAINTAINER = "NXP <lauren.post@nxp.com>"

REMOVE_VULKAN_FEATURE = "vulkan"
REMOVE_VULKAN_FEATURE:mx8 = ""
POKY_DEFAULT_DISTRO_FEATURES:remove      = "wayland ${REMOVE_VULKAN_FEATURE}"
POKY_DEFAULT_DISTRO_FEATURES:append:mx8  = " jailhouse"

DISTRO_FEATURES:append:mx8 = " virtualization"

INHERIT:remove = "uninative"

CONNECTIVITY_CHECK_URIS ?= "https://yoctoproject.org/connectivity.html"

PACKAGECONFIG:append:pn-gstreamer1.0-plugins-ugly = " x264"
