require recipes-libraries/neutron/neutron_1.0.0.bb

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "main"
SRCREV = "d338e62c70ff57c1ab58d223eb5a5da0726b2474"

NEUTRON_TARGET:mx937-nxp-bsp  = "imx952"
NEUTRON_TARGET:mx952-nxp-bsp  = "imx952"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp|mx937-nxp-bsp)"
