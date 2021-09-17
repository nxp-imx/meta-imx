require conf/distro/poky.conf

DISTRO = "imx-nxp"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "5.10-hardknott"

MAINTAINER = "NXP <lauren.post@nxp.com>"

REMOVE_VULKAN_FEATURE = "vulkan"
REMOVE_VULKAN_FEATURE_mx8 = ""
POKY_DEFAULT_DISTRO_FEATURES_remove      = "wayland ${REMOVE_VULKAN_FEATURE}"
POKY_DEFAULT_DISTRO_FEATURES_append_mx8  = " jailhouse"

DISTRO_FEATURES_append_mx8 = " virtualization"

INHERIT_remove = "uninative"

PACKAGECONFIG_append_pn-gstreamer1.0-plugins-ugly = " x264"
