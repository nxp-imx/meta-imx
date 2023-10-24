# StandAlomeMM: Require edk2-firmware to generate BL32_AP_MM.fd
DEPENDS:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'stmm', 'stmm-imx', '', d)}"

# i.MX 8MQ and 93 EVK emmc is dev 0
RPMB_FS_DEV_ID ?= "2"
RPMB_FS_DEV_ID:mx8mq-nxp-bsp = "0"
RPMB_FS_DEV_ID:mx93-nxp-bsp = "0"

STMM_EXTRA_OEMAKE = " \
        CFG_STMM_PATH=${STAGING_DIR_TARGET}/firmware/BL32_AP_MM.fd \
        CFG_RPMB_FS=y \
        CFG_IMX_SNVS=n \
        CFG_NXP_CAAM=n \
        CFG_RPMB_WRITE_KEY=y \
        CFG_RPMB_FS_DEV_ID=${RPMB_FS_DEV_ID} \
        CFG_CORE_DYN_SHM=y CFG_RPMB_TESTKEY=y \
        CFG_REE_FS=n \
        CFG_SCTLR_ALIGNMENT_CHECK=n \
        CFG_CORE_HEAP_SIZE=2097152 \
        CFG_TEE_RAM_VA_SIZE=4194304 \
        CFG_PREALLOC_RPC_CACHE=n \
"
# Add compilation flags required by StandAlomeMM compilation
# BL32_AP_MM.fd needs to be exported by the edk2-firmware recipe with do_install
EXTRA_OEMAKE:append = " ${@bb.utils.contains('MACHINE_FEATURES', 'stmm', '${STMM_EXTRA_OEMAKE}', '', d)}"
