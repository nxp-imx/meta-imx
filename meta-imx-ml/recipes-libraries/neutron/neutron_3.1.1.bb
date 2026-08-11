require recipes-libraries/neutron/neutron_1.0.0.bb

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "af575d6b086d7237474e46d59767292b000e727d"

NEUTRON_TARGET:mx937-nxp-bsp  = "imx952"
NEUTRON_TARGET:mx952-nxp-bsp  = "imx952"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp|mx937-nxp-bsp)"
