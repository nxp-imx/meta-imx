SRCBRANCH = "lf_3.10.y"
OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = " \
    ${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
    file://tee-supplicant.service \
"
SRCREV = "2a77cf88d956c34cb4a1c191bea6113e327f5fe0"
