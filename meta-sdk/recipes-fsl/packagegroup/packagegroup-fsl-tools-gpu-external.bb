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

VULKAN_TOOLS       = ""
VULKAN_TOOLS:imxgpu3d:mx8   = "vulkan-loader vulkan-validationlayers vulkan-headers vkmark vulkan-tools"
VULKAN_TOOLS:mx8mm = ""

# Common tools independent of the graphics backend
SOC_TOOLS_GPU                          = "${VULKAN_TOOLS}"
SOC_TOOLS_GPU:append:imxdrm            = " kmscube"

# Tools for wayland and x11
SOC_TOOLS_GPU_XWAYLAND                 = "mesa-demos gtkperf renderdoc"
SOC_TOOLS_GPU_XWAYLAND:append:imxgpu3d = " glmark2"

# Tools for wayland and !x11
SOC_TOOLS_GPU_WAYLAND                  = ""
SOC_TOOLS_GPU_WAYLAND:imxgpu3d         = "glmark2"

# Tools for !wayland and x11
SOC_TOOLS_GPU_X11                      = "mesa-demos gtkperf renderdoc"
SOC_TOOLS_GPU_X11:append:imxgpu3d      = " glmark2"

# Tools for !wayland and !x11
SOC_TOOLS_GPU_FB                       = ""
SOC_TOOLS_GPU_FB:append:mx8            = " glmark2"

RDEPENDS:${PN}:append:imxgpu = " \
    ${SOC_TOOLS_GPU} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11 wayland", "${SOC_TOOLS_GPU_XWAYLAND}", \
       bb.utils.contains("DISTRO_FEATURES",     "wayland", "${SOC_TOOLS_GPU_WAYLAND}", \
       bb.utils.contains("DISTRO_FEATURES",         "x11", "${SOC_TOOLS_GPU_X11}", \
                                                           "${SOC_TOOLS_GPU_FB}", d), d), d)} \
"

