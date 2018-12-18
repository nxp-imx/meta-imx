
DEPENDS_append_imxgpu2d = " virtual/libg2d"

SRCBRANCH = "imx-1.14.x"

SRC_URI_append_mx8mm = " \
    file://0001-Improve-8MM-color-balance-YOCIMX-3135.patch \
"
SRCREV = "318a9477159d6b162e480faf29f56153b27fb6a7"
