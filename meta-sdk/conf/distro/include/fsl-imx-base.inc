require conf/distro/poky.conf

DISTRO = "imx-nxp"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "5.15-kirkstone"

MAINTAINER = "NXP <lauren.post@nxp.com>"

REMOVE_VULKAN_FEATURE = "vulkan"
REMOVE_VULKAN_FEATURE:mx8 = ""
POKY_DEFAULT_DISTRO_FEATURES:remove      = "wayland ${REMOVE_VULKAN_FEATURE}"
POKY_DEFAULT_DISTRO_FEATURES:append:mx8  = " jailhouse"

DISTRO_FEATURES:append:mx8 = " virtualization"

IMX_REMOVE_INHERIT_UNINATIVE ?= "uninative"
INHERIT:remove = "${IMX_REMOVE_INHERIT_UNINATIVE}"

PACKAGECONFIG:append:pn-gstreamer1.0-plugins-ugly = " x264"
