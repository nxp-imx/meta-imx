require recipes-libraries/neutron/neutron_1.0.0.bb

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "d0ff138390aeba2b6c5169d8f0ca13f6a6b8219a"

NEUTRON_TARGET:mx952-nxp-bsp  = "imx952"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
