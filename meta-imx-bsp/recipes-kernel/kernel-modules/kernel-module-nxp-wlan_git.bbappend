# Use latest NXP Wi-Fi kernel module
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "44f90628e368de23e9991de424fc2a1799c81044"

# Populate Module "moal" configure file as modprobe.d/moal.conf
KERNEL_MODULE_PROBECONF += "moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"

# Auto-loading module "moal" during boot
KERNEL_MODULE_AUTOLOAD += "moal"
