SRCBRANCH = "imx_3.2.y"
SRCREV = "61f39d8e1e886c847602381993d27cee4cb8d468"

PLATFORM_FLAVOR_mx8mm = "mx8mmevk"
PLATFORM_FLAVOR_mx8mn = "mx8mnevk"
PLATFORM_FLAVOR_mx8qxp = "mx8qxpmek"

EXTRA_OEMAKE_remove = "CFG_SECURE_DATA_PATH=y \
                       CFG_TEE_SDP_MEM_BASE=0xCC000000 \
                       CFG_TEE_SDP_MEM_SIZE=0x02000000 \
                       CFG_TEE_SDP_NONCACHE=y \
                      "
