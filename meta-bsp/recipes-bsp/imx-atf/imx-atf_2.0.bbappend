SRCBRANCH = "imx_2.0.y"
ATF_SRC ?= "git://source.codeaurora.org/external/imx/imx-atf.git;protocol=https"
SRC_URI = "${ATF_SRC};branch=${SRCBRANCH} \
           file://0001-Allow-BUILD_STRING-to-be-set-in-.revision-file.patch \
"
SRCREV = "7542d31462b483d17c936c77f83b754145e7ac0d"

PLATFORM_mx8x   = "imx8qx"
# Override PLATFORM_mx8qxp from the included recipe
PLATFORM_mx8qxp = "imx8qx"
PLATFORM_mx8mn  = "imx8mn"
PLATFORM_mx8mp  = "imx8mp"
PLATFORM_imx8dxlevk = "imx8dxl"
PLATFORM_mx8dxlevk-phantom = "imx8qx"

BUILD_OPTEE = "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'true', 'false', d)}"

do_compile_append() {
    if [ "${BUILD_OPTEE}" = "true" ]; then
        oe_runmake clean BUILD_BASE=build-optee
        oe_runmake BUILD_BASE=build-optee SPD=opteed bl31
    fi
}

do_deploy_append () {
    if [ "${BUILD_OPTEE}" = "true" ]; then
        install -m 0644 ${S}/build-optee/${PLATFORM}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${PLATFORM}.bin-optee
    fi
}
