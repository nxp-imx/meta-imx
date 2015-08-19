# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group used by freescale to provide a set of GPU benchmark applications"
SUMMARY = "Freescale Package group for graphics benchmarks"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


inherit packagegroup

GPU_BENCHMARK = "${@base_contains('DISTRO_FEATURES', 'x11', 'gtkperf','', d)}"
GL_BENCHMARK = "${@base_contains('DISTRO_FEATURES', 'x11 opengl', 'glmark2 glcompbench','', d)}"

RDEPENDS_${PN} = " \
    packagegroup-fsl-graphics-core \
    ${GPU_BENCHMARK} \
    ${GL_BENCHMARK} \
"
RDEPENDS_${PN}_remove_mx6sl = " \
    glcompbench \
"
