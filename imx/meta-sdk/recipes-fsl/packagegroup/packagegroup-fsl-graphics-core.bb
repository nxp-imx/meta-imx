# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group used by freescale to add packages which provides core graphics support"
SUMMARY = "Freescale Package group for core graphics"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

# Direct FB packages
DFB_GRAPHICS_PACKAGES = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'packagegroup-core-full-cmdline packagegroup-core-directfb', '', d)}"

# Wayland packages
WAYLAND_GRAPHICS_PACKAGES = "${@base_contains('DISTRO_FEATURES', 'x11', '', \
       base_contains('DISTRO_FEATURES', 'wayland','weston weston-init', '', d),d)}"

# X11 packages
X11_GRAPHICS_PACKAGES = "${@base_contains('DISTRO_FEATURES', 'x11', \
   'xorg-minimal-fonts liberation-fonts', '', d)}"

#OpenGL packages
GL_GRAPHICS_PACKAGES = "${@base_contains('DISTRO_FEATURES', 'opengl', \
   'mesa', '', d)}"

RDEPENDS_${PN} = " \
    ${DFB_GRAPHICS_PACKAGES} \
    ${WAYLAND_GRAPHICS_PACKAGES} \
    ${X11_GRAPHICS_PACKAGES} \
    ${GL_GRAPHICS_PACKAGES} \
    packagegroup-fsl-graphics-minimal \
"

SOC_TOOLS_GPU = ""
SOC_TOOLS_GPU_mx5 = " \
    ${@base_contains('DISTRO_FEATURES', 'x11', 'amd-gpu-x11-bin-mx51', 'amd-gpu-bin-mx51', d)} \
"

SOC_TOOLS_GPU_FULL_LIST = " \
    imx-gpu-viv-g2d \
    imx-gpu-viv-tools \
    imx-gpu-viv-tools-apitrace \
    ${@base_contains('DISTRO_FEATURES', 'x11', \
                     'xserver-xorg-extension-viv-autohdmi', '', d)} \
"

SOC_TOOLS_GPU_mx6  = "${SOC_TOOLS_GPU_FULL_LIST}"
SOC_TOOLS_GPU_remove_mx6ul = "${SOC_TOOLS_GPU_FULL_LIST}"
SOC_TOOLS_GPU_remove_mx6sl = "imx-gpu-viv-tools-apitrace"


DFB_TOOLS_INSTALL = ""
DFB_TOOLS_INSTALL_mx6 = "${@base_contains('DISTRO_FEATURES', 'directfb', \
    'libvivante-dfb-mx6', '', d)}"

RDEPENDS_${PN}_append_imx = " \
    ${SOC_TOOLS_GPU} \
    ${DFB_TOOLS_INSTALL} \
"
