# Copyright (C) 2012-2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

LIC_FILES_CHKSUM = "file://usr/include/gc_vdk.h;endline=11;md5=19f5925343fa3da65596eeaa4ddb5fd3"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-3.5.7-1.0.0-alpha.2-sfp.bin;fsl-eula=true \
           file://0001-change-header-path-to-HAL.patch \
           file://gc_hal_eglplatform-remove-xlib-undefs.patch \
           file://egl.pc \
           file://egl_x11.pc \
           file://glesv1_cm.pc \
           file://glesv1_cm_x11.pc \
           file://glesv2.pc \
           file://glesv2_x11.pc \
           file://gc_wayland_protocol.pc \
           file://wayland-egl.pc \
           file://wayland-viv.pc \
          "

SRC_URI[md5sum] = "ef08a4ad04c7886a44af16e826d0f444"
SRC_URI[sha256sum] = "e212e361044eb1f9089761e115e71b27dab67c832ebb1ddbc830c17d2b1e2fba"

S = "${WORKDIR}/${PN}-3.5.7-1.0.0-alpha.2-sfp"

PACKAGES =+ "libvivante-dfb-mx6"

USE_HFP = "${@base_contains("TUNE_FEATURES", "callconvention-hard", "yes", "no", d)}"

# FIXME: community install is broken, always picks WL
USE_WL = "no"

do_configure () {

    if [ "${USE_HFP}" = "yes" ]; then
        bberror "${PN}-${PV} uses Soft Floating Point binaries, which are incompatible with your machine tuning"
        exit 1
    fi
}

do_install_append () {

    if [ "${USE_DFB}" = "yes" ]; then
        cp -r ${S}/usr/lib/directfb-1.6-0 ${D}${libdir}
    fi

    mv ${D}${libdir}/libEGL.so.1 ${D}${libdir}/libEGL.so.1.0
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so.1

    find ${D}${libdir} -type f -exec chmod 644 {} \;
}

FILES_libvivante-dfb-mx6 = "${libdir}/directfb-1.6-0/gfxdrivers/libdirectfb_gal.so"
