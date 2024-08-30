
SRCBRANCH = "lf-6.6.36_2.1.0"
SRCREV = "327e56941e3e96ef9a291d2decb7add21078d8de"

PV = "2023.03+git${SRCPV}"

IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"

RDEPENDS:${PN} += " \
    pyjailhouse \
"
COMPATIBLE_MACHINE = "(mx8m-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
