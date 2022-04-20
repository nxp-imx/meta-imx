# Copyright (C) 2014, 2016 Freescale Semiconductor
# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Package group used by FSL Community to provide graphic packages used \
to test the several hardware accelerated graphics APIs including packages not \
provided by Freescale."
SUMMARY = "FSL Community Package group - tools/gpu/external"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN}        = ""
RDEPENDS:${PN}:imxgpu = " \
    ${DRM_TOOLS} \
    ${3D_TOOLS} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "${SOC_TOOLS_GPU_XWAYLAND}", \
       bb.utils.contains("DISTRO_FEATURES",     "wayland", "${SOC_TOOLS_GPU_WAYLAND}", \
                                                           "", d)} \
    ${VULKAN_TOOLS} \
"
DRM_TOOLS         = ""
DRM_TOOLS:imxdrm  = "kmscube"
3D_TOOLS          = ""
3D_TOOLS:imxgpu3d = "glmark2"
# Tools for wayland and x11
SOC_TOOLS_GPU_XWAYLAND                 = "mesa-demos gtkperf renderdoc"
# Tools for wayland and !x11
SOC_TOOLS_GPU_WAYLAND                  = "mesa-demos"
VULKAN_TOOLS                      = ""
VULKAN_TOOLS:mx8-nxp-bsp:imxgpu3d = "vulkan-loader vulkan-validationlayers vulkan-headers vkmark vulkan-tools gfxreconstruct"
VULKAN_TOOLS:mx8mm-nxp-bsp        = ""
