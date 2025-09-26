FILESEXTRAPATHS:prepend := "${THISDIR}/mesa:"

SRC_URI += "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '${SRC_URI_RVGPU}', '', d)}"
SRC_URI_RVGPU = "file://0001-egl-Avoid-initializing-zink-driver-if-not-enabled-at.patch \
                 file://0001-Link-rvgpu-library-with-mesa-softpipe-and-gallium-dr.patch \
                 file://0002-Use-rvgpu-firmware-to-render-triangle.patch \
                 file://0003-Enable-rvgpu-vertex-shader.patch \
                 file://0004-Disable-wide-point-line-feature-to-avoid-CTS-failure.patch \
                 file://0005-Clamp-output-color-for-fragment-and-vertex-shaders.patch \
"

PACKAGECONFIG:append = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', ' rvgpu', '', d)}"
PACKAGECONFIG:remove = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', 'virgl zink', '', d)}"
PACKAGECONFIG[rvgpu] = "${RVGPU_ENABLED},${RVGPU_DISABLED},mesa-rvgpu-emu"
RVGPU_ENABLED = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '-Dmesa-rvgpu=true', '', d)}"
RVGPU_DISABLED = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '-Dmesa-rvgpu=false', '', d)}"
