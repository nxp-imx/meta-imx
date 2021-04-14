SRCBRANCH = "lf_3.10.y"
OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"
SRCREV = "c15e1e9bf9fbd1d0466a38ef937eafb1acf34c43"

PLATFORM_FLAVOR_mx8mnlite = "mx8mnevk"
