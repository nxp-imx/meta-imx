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

SRC_URI[md5sum] = "d2d134307a892de46f245c898ccf3a4b"
SRC_URI[sha256sum] = "06afa1bb29be698b44a02193b2fb2d543f9065c064e3a47cdc7eb99236106edb"

PACKAGE_FP_TYPE = "hardfp"
