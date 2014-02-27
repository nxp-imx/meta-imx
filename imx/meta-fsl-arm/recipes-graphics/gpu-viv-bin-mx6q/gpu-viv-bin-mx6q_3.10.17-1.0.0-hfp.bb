# Copyright (C) 2013-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

DEPENDS += "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

SRC_URI[md5sum] = "9eb9808625fc1aade32ee7748183480b"
SRC_URI[sha256sum] = "1af479581fae356dee126059f9f647813a793789ba399fc9cb6b4339684ada83"

SRC_URI += "file://directfbrc"

PACKAGE_FP_TYPE = "hardfp"

do_install_append () {

    rm -rf ${D}${libdir}/libGLESv2*

    # The preference order, based in DISTRO_FEATURES, is x11, wayland, directfb and fb
    if [ "${USE_X11}" = "yes" ]; then
        backend=x11
    elif [ "${USE_WL}" = "yes" ]; then
        backend=wl
    else
        if [ "${USE_DFB}" = "yes" ]; then
            backend=dfb
            install -d ${D}/home/root
            cp -a ${WORKDIR}/directfbrc ${D}/home/root/.directfbrc
        else
            # Regular framebuffer
            backend=fb
        fi
    fi

    # update libglesv2 as backend dependent
    cp -a ${S}/usr/lib/libGLESv2-${backend}.so ${D}${libdir}/libGLESv2.so.2.0.0
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so.2
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so
}

FILES_libvivante-dfb-mx6 += "/home/root/.directfbrc"
