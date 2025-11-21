require recipes-libraries/neutron/neutron_1.0.0.bb

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI = "${NEUTRON_SRC};branch=${SRCBRANCH}"
NEUTRON_SRC ?= "git://github.com/nxp-imx/neutron.git;protocol=https"
SRCBRANCH = "lf-6.12.49_2.2.0"
SRCREV = "08a3772b4830887d1ad7309046cf4116d20a5815"
