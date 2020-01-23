SRCBRANCH = "imx_3.2.y"
SRCREV = "5929b19dbe910003442ff14349765f4f476f1c6b"

PLATFORM_FLAVOR_mx8mm = "mx8mmevk"
PLATFORM_FLAVOR_mx8mn = "mx8mnevk"
PLATFORM_FLAVOR_mx8qxp = "mx8qxpmek"

EXTRA_OEMAKE_remove = "CFG_SECURE_DATA_PATH=y \
                       CFG_TEE_SDP_MEM_BASE=0xCC000000 \
                       CFG_TEE_SDP_MEM_SIZE=0x02000000 \
                       CFG_TEE_SDP_NONCACHE=y \
                      "
