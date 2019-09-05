FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-freescale/recipes-bsp/${BPN}/${BPN}:"

require recipes-bsp/imx-atf/imx-atf_1.5.0.bb

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

# Upstream this:
#PV .= "+git${SRCPV}"
# So we don't have to do this:
PV = "2.0+git${SRCPV}"

SRCBRANCH = "imx_2.0.y"
ATF_SRC ?= "git://source.codeaurora.org/external/imx/imx-atf.git;protocol=https"
SRC_URI = "${ATF_SRC};branch=${SRCBRANCH} \
           file://0001-Allow-BUILD_STRING-to-be-set-in-.revision-file.patch \
"
SRCREV = "7f172a28d203a597d151ded5c374086a2cf16455"

PLATFORM_mx8x   = "imx8qx"
# Override PLATFORM_mx8qxp from the included recipe
PLATFORM_mx8qxp = "imx8qx"
PLATFORM_mx8mn  = "imx8mn"

BUILD_OPTEE = "${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'true', 'false', d)}"

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
