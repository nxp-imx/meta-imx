# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "05e8e7e73ec4c1bea41f18d14cb23b42"
SRC_URI[sha256sum] = "21870dcaa40effe47518e48c5a8375e56f844218de09dd75e6c18583ed26854b"

SRC_URI += "file://.directfbrc"

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
            cp -a ${WORKDIR}/.directfbrc ${D}/home/root
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
