require conf/distro/poky.conf

DISTRO = "imx-nxp"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "5.10-hardknott"

MAINTAINER = "NXP <lauren.post@nxp.com>"

REMOVE_VULKAN_FEATURE = "vulkan"
REMOVE_VULKAN_FEATURE_mx8 = ""
POKY_DEFAULT_DISTRO_FEATURES_remove      = "wayland ${REMOVE_VULKAN_FEATURE}"
POKY_DEFAULT_DISTRO_FEATURES_append_mx8  = " jailhouse"

INHERIT_remove = "uninative"

# Set nobranch since bugfix branches like 5.15.2 were dropped
QT_MODULE_BRANCH_PARAM = "${QT_MODULE_BRANCH_PARAM_IMX}"
QT_MODULE_BRANCH_PARAM_IMX ?= "nobranch=1"
