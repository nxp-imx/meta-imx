# Copyright (C) 2019-2020 NXP

require recipes-security/optee-imx/optee-os_3.7.0.imx.bb

LIC_FILES_CHKSUM = "file://LICENSE;md5=c1f21c4f72f372ef38a5a4aee55ec173"

SRC_URI_remove = " \
                  file://0001-optee-os-fix-gcc10-compilation-issue-and-missing-cc-.patch"

OPTEE_CORE_LOG_LEVEL ?= "1"
OPTEE_TA_LOG_LEVEL ?= "0"

PLATFORM_FLAVOR_mx8mnlite       = "mx8mnevk"

EXTRA_OEMAKE_remove = "NOWERROR=1 \
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

