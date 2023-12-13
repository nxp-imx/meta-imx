# Copyright (C) 2012-2014, 2016 Freescale Semiconductor
# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group used by FSL Community to add the packages which provide GPU support."
SUMMARY = "FSL Community package group - tools/gpu"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    ${SOC_TOOLS_DRM} \
    ${SOC_TOOLS_GPU} \
"

SOC_TOOLS_DRM ??= ""
SOC_TOOLS_DRM:imxdrm ??= " \
    libdrm-tests"

SOC_TOOLS_GPU ??= ""
SOC_TOOLS_GPU:imxgpu ??= " \
    imx-gpu-sdk \
    ${SOC_TOOLS_GPU_APITRACE} \
    ${SOC_TOOLS_GPU_MALI} \
    ${SOC_TOOLS_GPU_VIVANTE}"

SOC_TOOLS_GPU_MALI = ""
SOC_TOOLS_GPU_MALI:mx95-nxp-bsp = " \
    mali-imx-dev \
    mali-imx-libopencl-dev \
"

SOC_TOOLS_GPU_VIVANTE = " \
    gputop \
    imx-gpu-viv-tools \
"
SOC_TOOLS_GPU_VIVANTE:mx95-nxp-bsp = ""

SOC_TOOLS_GPU_APITRACE = ""
SOC_TOOLS_GPU_APITRACE:imxgpu3d = " \
    imx-gpu-apitrace"
