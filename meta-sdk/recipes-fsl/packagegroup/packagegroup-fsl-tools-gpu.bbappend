SOC_TOOLS_GPU_append_imxgpu   = " gputop imx-gpu-sdk"

SOC_TOOLS_GPU_append_mx8   = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' xf86-video-modesetting xserver-xorg-extension-glx','', d)}"

SOC_TOOLS_GPU_remove_imxgpu3d = "imx-gpu-apitrace-bin"

SOC_TOOLS_GPU_append_imxdrm = " libdrm-tests"
