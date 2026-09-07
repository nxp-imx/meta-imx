require recipes-libraries/neutron/neutron_1.0.0.bb
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "2eded13667d1a30fe4412ba5310faa6f29ac7f4c"

NEUTRON_TARGET:mx937-nxp-bsp  = "imx952"
NEUTRON_TARGET:mx952-nxp-bsp  = "imx952"

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp|mx937-nxp-bsp)"
