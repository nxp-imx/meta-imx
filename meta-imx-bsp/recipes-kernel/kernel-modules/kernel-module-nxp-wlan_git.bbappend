# Use latest NXP Wi-Fi kernel module
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "dd4c01c5f5597006665dfcacd518ea0c40655d05"

# Populate Module "moal" configure file as modprobe.d/moal.conf
KERNEL_MODULE_PROBECONF += "moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"

# Auto-loading module "moal" during boot
KERNEL_MODULE_AUTOLOAD += "moal"
