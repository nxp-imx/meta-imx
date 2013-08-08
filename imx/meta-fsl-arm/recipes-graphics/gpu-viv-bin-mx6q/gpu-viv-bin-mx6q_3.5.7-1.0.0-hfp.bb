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
           file://gpu-viv-bin-mx6q.sh \
          "

SRC_URI[md5sum] = "080225adc7aa61af7bfdab17527e62e3"
SRC_URI[sha256sum] = "b0ece40672933127b774b8ea6c45ef02ba6fc85af4679285e5bc5022502714bc"

PACKAGES =+ "libvivante-dfb-mx6"

USE_HFP = "${@base_contains("TUNE_FEATURES", "callconvention-hard", "yes", "no", d)}"

do_configure () {

    if [ "${USE_HFP}" = "no" ]; then
        bberror "${PN}-${PV} uses Hard Floating Point binaries, which are incompatible with your machine tuning"
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
