# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-mx6q.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true \
           file://egl.pc \
           file://egl_x11.pc \
           file://glesv1_cm.pc \
           file://glesv1_cm_x11.pc \
           file://glesv2.pc \
           file://glesv2_x11.pc \
           file://vg.pc \
           file://vg_x11.pc \
           file://gc_wayland_protocol.pc \
           file://wayland-egl.pc \
           file://wayland-viv.pc \
           file://directfbrc \
           file://Vivante.icd \
          "

S="${WORKDIR}/${PN}-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "133c4a09c02ae18b966f88f1861ec0ce"
SRC_URI[sha256sum] = "ea743c3112a05967204c7df7670a5c9e7f900e4bee95741481b38f6e4847ca95"

PACKAGE_FP_TYPE = "hardfp"
