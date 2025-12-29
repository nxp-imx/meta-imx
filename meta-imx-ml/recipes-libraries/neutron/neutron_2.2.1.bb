require recipes-libraries/neutron/neutron_1.0.0.bb

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "0e191aba2380f22f1148be51d35e0788ddeb4b74"

NEUTRON_TARGET:mx952-nxp-bsp  = "imx952"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
