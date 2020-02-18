SRCBRANCH = "lf-5.4.y"
SRCREV = "6d99b525af752ecdaabdca6098b2564b2665f2b2"

PLATFORM_FLAVOR_imx6ulz14x14evk = "mx6ulzevk"
PLATFORM_FLAVOR_mx8mm = "mx8mmevk"
PLATFORM_FLAVOR_mx8mn = "mx8mnevk"
PLATFORM_FLAVOR_mx8qxp = "mx8qxpmek"

EXTRA_OEMAKE_remove = "CFG_SECURE_DATA_PATH=y \
                       CFG_TEE_SDP_MEM_BASE=0xCC000000 \
                       CFG_TEE_SDP_MEM_SIZE=0x02000000 \
                       CFG_TEE_SDP_NONCACHE=y \
                      "
