
IMXALSA_SRC ?= "git://source.codeaurora.org/external/imx/imx-alsa-plugins.git;protocol=https"
NXP_REPO_MIRROR ?= "nxp/"
SRCBRANCH = "${NXP_REPO_MIRROR}master"

SRC_URI = "${IMXALSA_SRC};branch=${SRCBRANCH}"
SRCREV = "9a63071e7734bd164017f3761b8d1944c017611f"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
