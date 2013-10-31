# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/gpu-viv-bin-mx6q/gpu-viv-bin-mx6q.inc

SRC_URI[md5sum] = "769df5e2f635c7e3f375bb608be50a7d"
SRC_URI[sha256sum] = "775d10bf20ac7d5130d9a2358737341d67f0c748e4cc3352947d1719b44aeb38"

PACKAGE_FP_TYPE = "hardfp"

RDEPENDS_libgl-mx6-dev = "libgl-mesa-dev"


do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp -a ${S}/usr/lib/*.so* ${D}${libdir}
    cp -axr ${S}/usr/include/* ${D}${includedir}
    cp -axr ${S}/opt ${D}

    install -d ${D}${libdir}/pkgconfig

    # The preference order, based in DISTRO_FEATURES, is x11, wayland, directfb and fb
    if [ "${USE_X11}" = "yes" ]; then
        cp -r ${S}/usr/lib/dri ${D}${libdir}
        backend=x11

        install -m 0644 ${WORKDIR}/egl_x11.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/glesv1_cm_x11.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${WORKDIR}/glesv2_x11.pc ${D}${libdir}/pkgconfig/glesv2.pc
    elif [ "${USE_WL}" = "yes" ]; then
        backend=wl

        install -m 0644 ${WORKDIR}/egl.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/glesv1_cm.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${WORKDIR}/glesv2.pc ${D}${libdir}/pkgconfig/glesv2.pc
        install -m 0644 ${WORKDIR}/gc_wayland_protocol.pc ${D}${libdir}/pkgconfig/gc_wayland_protocol.pc
        install -m 0644 ${WORKDIR}/wayland-egl.pc ${D}${libdir}/pkgconfig/wayland-egl.pc
        install -m 0644 ${WORKDIR}/wayland-viv.pc ${D}${libdir}/pkgconfig/wayland-viv.pc

        # Wayland + X11 support
        if [ "${USE_X11}" = "yes" ]; then
            cp -r ${S}/usr/lib/dri ${D}${libdir}
        fi
    else
        install -m 0644 ${WORKDIR}/egl.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/glesv1_cm.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${WORKDIR}/glesv2.pc ${D}${libdir}/pkgconfig/glesv2.pc

        if [ "${USE_DFB}" = "yes" ]; then
            cp -r ${S}/usr/lib/directfb-1.6-3 ${D}${libdir}
            backend=dfb
        else
            # Regular framebuffer
            backend=fb
        fi
    fi

    # We'll only have one backend here so we rename it to generic name
    # and avoid rework in other packages, when possible
    mv ${D}${libdir}/libGL.so.1.2 ${D}${libdir}/libGL.so.1.2.0
    ln -sf libGL.so.1.2.0 ${D}${libdir}/libGL.so.1.2
    ln -sf libGL.so.1.2.0 ${D}${libdir}/libGL.so
    mv ${D}${libdir}/libEGL-${backend}.so ${D}${libdir}/libEGL.so.1.0
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so.1
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so
    mv ${D}${libdir}/libGAL-${backend}.so ${D}${libdir}/libGAL.so
    mv ${D}${libdir}/libVIVANTE-${backend}.so ${D}${libdir}/libVIVANTE.so

    for backend in wl x11 fb dfb; do
        find ${D}${libdir} -name "*-$backend.so" -exec rm '{}' ';'
    done

    find ${D}${libdir} -type f -exec chmod 644 {} \;
    find ${D}${includedir} -type f -exec chmod 644 {} \;
}

FILES_libvivante-dfb-mx6 = "${libdir}/directfb-1.6-3/gfxdrivers/libdirectfb_gal.so"
