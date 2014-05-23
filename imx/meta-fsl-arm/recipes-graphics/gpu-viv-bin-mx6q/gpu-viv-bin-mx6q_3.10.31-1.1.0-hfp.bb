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
          "

S="${WORKDIR}/${PN}-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "efa7a8ae6f11157bade0aca094b6a019"
SRC_URI[sha256sum] = "12bf8998de0029787febd87648ac41e76b4505990f5fcffe122edd2c85d27d1f"

PACKAGE_FP_TYPE = "hardfp"
