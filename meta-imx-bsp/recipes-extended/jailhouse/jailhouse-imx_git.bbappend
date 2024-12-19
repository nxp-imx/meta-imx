
SRCBRANCH = "lf-6.12.3_1.0.0"
SRCREV = "a41801cafd26797250e25e56272c111ab28849fb"

PV = "2023.03+git${SRCPV}"

IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"

RDEPENDS:${PN} += " \
    pyjailhouse \
"
ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

COMPATIBLE_MACHINE = "(mx8m-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
