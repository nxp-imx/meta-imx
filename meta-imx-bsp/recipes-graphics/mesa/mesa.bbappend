FILESEXTRAPATHS:prepend := "${THISDIR}/mesa:"

# RVGPU Emulator feature
SRC_URI += "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '${SRC_URI_RVGPU}', '', d)}"
SRC_URI_RVGPU = "file://0001-PATCH-mesa-rvgpu-emu-patch-for-Mesa25.2.3.patch \
                 file://0001-RVGPU-FW-Remove-support-for-eglBindWaylandDisplayWL-.patch \
                 file://0001-RVGPU-FW-prioritize-softpipe-over-llvmpipe-for-swras.patch"
PACKAGECONFIG:append = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', ' rvgpu', '', d)}"
PACKAGECONFIG:remove = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', 'virgl zink', '', d)}"
PACKAGECONFIG[rvgpu] = "${RVGPU_ENABLED},${RVGPU_DISABLED},mesa-rvgpu-emu"
RVGPU_ENABLED = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '-Dmesa-rvgpu=true', '', d)}"
RVGPU_DISABLED = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '-Dmesa-rvgpu=false', '', d)}"

# Fix package arch
PACKAGE_ARCH:imx-nxp-bsp = "${MACHINE_SOCARCH}"
