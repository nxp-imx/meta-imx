# Use latest NXP Wi-Fi kernel module
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "ad25a73bca3de4d0de4fbeca280d99875b767690"

# Populate Module "moal" configure file as modprobe.d/moal.conf
KERNEL_MODULE_PROBECONF += "moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"

# Auto-loading module "moal" during boot
KERNEL_MODULE_AUTOLOAD += "moal"
