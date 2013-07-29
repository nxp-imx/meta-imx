# Copyright (C) 2012-2013 Freescale Semiconductor

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

LIC_FILES_CHKSUM = "file://usr/include/gc_vdk.h;endline=11;md5=19f5925343fa3da65596eeaa4ddb5fd3"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true \
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
           file://gpu-viv-bin-mx6q.sh \
          "

SRC_URI[md5sum] = "104136b6f281446d8a7bfb892550e930"
SRC_URI[sha256sum] = "18148fe6ba20439aae41083a60073ce0ebf57d228a911cfd2bcf5b7c6e424866"

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

    if [ "${USE_X11}" = "yes" ]; then
        install -d ${D}${sysconfdir}/profile.d/
        install -m 0755 ${WORKDIR}/gpu-viv-bin-mx6q.sh ${D}${sysconfdir}/profile.d/
    fi

    mv ${D}${libdir}/libEGL.so.1 ${D}${libdir}/libEGL.so.1.0
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so.1

    find ${D}${libdir} -type f -exec chmod 644 {} \;
}

FILES_${PN}-conf = "${sysconfdir}/profile.d/gpu-viv-bin-mx6q.sh"

FILES_libvivante-dfb-mx6 = "${libdir}/directfb-1.6-0/gfxdrivers/libdirectfb_gal.so"
