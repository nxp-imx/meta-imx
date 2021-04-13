SRCBRANCH = "lf-5.10.y_1.0.0"
OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"
SRCREV = "87b3b15498f07a9e4d3da3977722a506d1fa9509"

PLATFORM_FLAVOR_mx8mnlite = "mx8mnevk"
