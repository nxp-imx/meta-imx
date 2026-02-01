# Use latest NXP Wi-Fi kernel module
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "604ebe608a9857e2ae683a0b89132ec0f4ced3be"

# Populate Module "moal" configure file as modprobe.d/moal.conf
KERNEL_MODULE_PROBECONF += "moal"
module_conf_moal = "options moal mod_para=nxp/wifi_mod_para.conf"

# Auto-loading module "moal" during boot
KERNEL_MODULE_AUTOLOAD += "moal"
