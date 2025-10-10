PACKAGECONFIG_REMOVE:imxgpu:mx6-nxp-bsp = "glx opencl x11"
PACKAGECONFIG_REMOVE:imxgpu:mx7-nxp-bsp = "glx opencl x11"

CFLAGS:append:imxgpu = " -Wno-error=int-conversion -Wno-error=incompatible-pointer-types"
