# Use latest NXP Wi-Fi kernel module
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "cff70be1506253c149d1a19c0d8cedd6e7f1ddd0"

# Populate Module "moal" configure file as modprobe.d/moal.conf
KERNEL_MODULE_PROBECONF += "moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"

# Auto-loading module "moal" during boot
KERNEL_MODULE_AUTOLOAD += "moal"
