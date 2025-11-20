require recipes-libraries/neutron/neutron_1.0.0.bb

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "main"
SRCREV = "a7d5f17a9210c45aef2bbc9dc09d637f41fd3a7c"
