# Copyright (C) 2019-2020 NXP

require recipes-security/optee-imx/optee-os_3.2.0.imx.bb

LIC_FILES_CHKSUM = "file://LICENSE;md5=c1f21c4f72f372ef38a5a4aee55ec173"

inherit python3native
DEPENDS_remove = "python-pycrypto-native"
DEPENDS_append = " python3-pycrypto-native python3-pyelftools-native"

# The recipe uses Machine overrides variable 
# to select the suitable OP-TEE Platform Flavor.
# The reason is that from an OP-TEE point of view there
# are no differences between for example a imx8mnddr4evk
# and a imx8mnevk MACHINE. In this example, the PLATFORM_FLAVOR 
# defined is imx8mnevk, the other MACHINE derivatives 
# are just using the original one.
PLATFORM_FLAVOR_mx8mn		= "mx8mnevk"
PLATFORM_FLAVOR_mx8qxp		= "mx8qxpmek"
PLATFORM_FLAVOR_mx8mp   	= "mx8mpevk"
PLATFORM_FLAVOR_mx8dx   	= "mx8dxmek"
PLATFORM_FLAVOR_mx8dxl  	= "mx8dxlevk"
PLATFORM_FLAVOR_mx8phantomdxl 	= "mx8qxpmek"

OPTEE_CORE_LOG_LEVEL ?= "1"
OPTEE_TA_LOG_LEVEL ?= "0"

EXTRA_OEMAKE_remove = "NOWERROR=1 \
                       CFG_SECURE_DATA_PATH=y \
                       CFG_TEE_SDP_MEM_BASE=0xCC000000 \
                       CFG_TEE_SDP_MEM_SIZE=0x02000000 \
                       CFG_TEE_SDP_NONCACHE=y \
                      "

EXTRA_OEMAKE += "CFG_WERROR=y \
                       CFG_TEE_CORE_LOG_LEVEL=${OPTEE_CORE_LOG_LEVEL} \
                       CFG_TEE_TA_LOG_LEVEL=${OPTEE_TA_LOG_LEVEL} \
                      "

do_compile () {
    unset LDFLAGS
    export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
    oe_runmake -C ${S} all
}

