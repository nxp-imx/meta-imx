FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6q = "  file://0001-MGS-1733-Add-OCL-Runtime-Control.patch"

PACKAGECONFIG[opencl] = "-DWITH_OPENCL=ON,-DWITH_OPENCL=OFF,imx-gpu-viv"
PACKAGECONFIG_append_mx6q = " opencl"

# Remove libav as it has LICENSE_FLAG commmerical
PACKAGECONFIG_remove_mx6 = "v4l"
