
SRCBRANCH = "imx_jailhouse_2023.03"
SRCREV = "d3484c68313c2c837eb213ca1aa373e491fbc55f"

PV = "2023.03+git${SRCPV}"

IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"
