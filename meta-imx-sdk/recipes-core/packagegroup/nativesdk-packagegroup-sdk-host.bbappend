RDEPENDS:${PN} += "${RDEPENDS_IMX_GPU_SDK}"
RDEPENDS_IMX_GPU_SDK               = ""
RDEPENDS_IMX_GPU_SDK:imxdrm        = "nativesdk-glslang"
RDEPENDS_IMX_GPU_SDK:mx8mm-nxp-bsp = ""
