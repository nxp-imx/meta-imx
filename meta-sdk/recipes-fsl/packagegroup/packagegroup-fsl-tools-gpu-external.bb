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
    ${VULKAN_TOOLS} \
    ${OPENCL_TOOLS} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "${WAYLAND_TOOLS}", "", d)} \
"

DRM_TOOLS         = ""
DRM_TOOLS:imxdrm  = "kmscube"

OPENCL_TOOLS               = "clblast"
OPENCL_TOOLS:mx7-nxp-bsp   = ""
OPENCL_TOOLS:mx8mm-nxp-bsp = ""

VULKAN_TOOLS                      = ""
VULKAN_TOOLS:mx8-nxp-bsp:imxgpu3d = "vulkan-loader vulkan-validationlayers vulkan-headers vkmark vulkan-tools gfxreconstruct"
VULKAN_TOOLS:mx8mm-nxp-bsp        = ""

WAYLAND_TOOLS = " \
    mesa-demos \
    ${GLMARK2} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "gtkperf renderdoc", "", d)} \
"

GLMARK2          = ""
GLMARK2:imxgpu3d = "glmark2"
