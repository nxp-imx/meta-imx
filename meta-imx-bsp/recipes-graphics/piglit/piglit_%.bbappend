FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-cl-program-build-fix-double-vector-types-to-require-.patch \
            file://0002-piglit-fix-incompatible-pointer-types-in-generated-g.patch \
            file://0003-cl-api-skip-CL_QUEUE_SIZE-query-on-host-command-queu.patch \
            file://0004-cl-api-downgrade-CL_KERNEL_ARG_INFO_NOT_AVAILABLE-ch.patch"

PACKAGECONFIG_REMOVE:imxgpu:mx6-nxp-bsp = "glx opencl x11"
PACKAGECONFIG_REMOVE:imxgpu:mx7-nxp-bsp = "glx opencl x11"

CFLAGS:append:imxgpu = " -Wno-error=int-conversion -Wno-error=incompatible-pointer-types"
