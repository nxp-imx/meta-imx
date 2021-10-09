SOC_TOOLS_GPU:append:imxgpu = " gputop \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'imx-gpu-sdk', '', d)}\
    "
SOC_TOOLS_GPU:remove:imxgpu3d = "imx-gpu-apitrace-bin"

SOC_TOOLS_GPU:append:imxdrm = " libdrm-tests"
