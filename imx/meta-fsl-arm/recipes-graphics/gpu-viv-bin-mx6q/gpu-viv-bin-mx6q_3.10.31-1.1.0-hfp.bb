# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-mx6q.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.31-1.1.0-alpha-hfp.bin;fsl-eula=true \
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

S="${WORKDIR}/${PN}-3.10.31-1.1.0-alpha-hfp"

SRC_URI[md5sum] = "c4d1552c972fde87de6ce89b8cf1c439"
SRC_URI[sha256sum] = "ed2c2e5bccd2781a4abecdfdd3ff80d653437119c92be22d9a676f34e2354107"

PACKAGE_FP_TYPE = "hardfp"
