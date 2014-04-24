# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-mx6q.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.31-1.1.0_alpha-hfp.bin;fsl-eula=true \
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
          "

S="${WORKDIR}/${PN}-3.10.31-1.1.0_alpha-hfp"

SRC_URI[md5sum] = "01b77f83acdc085d55bc18a2d304b5e1"
SRC_URI[sha256sum] = "ad4e44d58240d78cec9b806526c0b62a3293e8550c1c6548fd63ec9dc1754917"

INHIBIT_PACKAGE_STRIP = "1" 

PACKAGE_FP_TYPE = "hardfp"
