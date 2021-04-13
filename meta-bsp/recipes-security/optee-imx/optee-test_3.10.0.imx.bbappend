SRCBRANCH = "lf-5.10.y_1.0.0"

OPTEE_TEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"
