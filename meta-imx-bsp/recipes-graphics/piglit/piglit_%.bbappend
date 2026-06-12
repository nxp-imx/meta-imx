FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-cl-program-build-fix-double-vector-types-to-require-.patch \
            file://0002-piglit-fix-incompatible-pointer-types-in-generated-g.patch"

PACKAGECONFIG_REMOVE:imxgpu:mx6-nxp-bsp = "glx opencl x11"
PACKAGECONFIG_REMOVE:imxgpu:mx7-nxp-bsp = "glx opencl x11"
