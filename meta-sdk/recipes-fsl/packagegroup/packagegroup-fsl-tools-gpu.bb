# Copyright (C) 2012-2014, 2016 Freescale Semiconductor
# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group used by FSL Community to add the packages which provide GPU support."
SUMMARY = "FSL Community package group - tools/gpu"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    ${SOC_TOOLS_GPU} \
"
SOC_TOOLS_GPU = ""
SOC_TOOLS_GPU:imxgpu ??= " \
    ${SOC_TOOLS_GPU_APITRACE} \
    ${SOC_TOOLS_GPU_DRM} \
    gputop \
    imx-gpu-sdk \
    imx-gpu-viv-tools"
SOC_TOOLS_GPU_APITRACE          = ""
SOC_TOOLS_GPU_APITRACE:imxgpu3d = "imx-gpu-apitrace"
SOC_TOOLS_GPU_DRM               = ""
SOC_TOOLS_GPU_DRM:imxdrm        = "libdrm-tests"
