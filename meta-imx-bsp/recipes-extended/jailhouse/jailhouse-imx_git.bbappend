
SRCBRANCH = "imx_jailhouse_2023.03"
SRCREV = "ba9cf4401b52f9ab4349341572620ebac2bdd67c"

PV = "2023.03+git${SRCPV}"

IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"

RDEPENDS:${PN} += " \
    pyjailhouse \
"
ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

COMPATIBLE_MACHINE = "(mx8m-nxp-bsp|mx8ulp-nxp-bsp|mx9-nxp-bsp)"
