EXTRA_PROVIDES_mx8  = " virtual/libgl virtual/libgles1 virtual/libgles2"

PACKAGES =+ "imx-viv-dpu-g2d imx-viv-dpu-g2d-dev"

IS_MX8 = "0"
IS_MX8_mx8 = "1"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}${bindir}

    cp -P ${S}/gpu-core/usr/lib/*.so* ${D}${libdir}
    cp  ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -r ${S}/gpu-core/usr/include/* ${D}${includedir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}

    if [ "${IS_MX8}" = "0" ]; then
        cp -r ${S}/gpu-tools/gmem-info/usr/bin/* ${D}${bindir}
    fi

    install -d ${D}${libdir}/pkgconfig

    # The preference order, based in DISTRO_FEATURES, is Wayland (with or without X11), X11 and fb
    if [ "${HAS_WL}" = "yes" ]; then
        cp -r ${S}/apitrace/non-x11/usr/lib/* ${D}${libdir}
        cp -r ${S}/apitrace/non-x11/usr/bin/* ${D}${bindir}

        backend=wl

        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/egl_wayland.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv1_cm.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv2.pc ${D}${libdir}/pkgconfig/glesv2.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/vg.pc ${D}${libdir}/pkgconfig/vg.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/gc_wayland_protocol.pc ${D}${libdir}/pkgconfig/gc_wayland_protocol.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/wayland-egl.pc ${D}${libdir}/pkgconfig/wayland-egl.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/wayland-viv.pc ${D}${libdir}/pkgconfig/wayland-viv.pc

       if [ "${HAS_X11}" = "yes" ]; then

        cp -r ${S}/gpu-core/usr/lib/dri ${D}${libdir}

       fi

    elif [ "${HAS_X11}" = "yes" ]; then

        cp -r ${S}/gpu-core/usr/lib/dri ${D}${libdir}
        cp -r ${S}/apitrace/x11/usr/lib/* ${D}${libdir}
        cp -r ${S}/apitrace/x11/usr/bin/* ${D}${bindir}


        backend=x11

        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/egl_x11.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv1_cm_x11.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv2_x11.pc ${D}${libdir}/pkgconfig/glesv2.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/vg_x11.pc ${D}${libdir}/pkgconfig/vg.pc

    else
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv1_cm.pc ${D}${libdir}/pkgconfig/glesv1_cm.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/glesv2.pc ${D}${libdir}/pkgconfig/glesv2.pc
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/vg.pc ${D}${libdir}/pkgconfig/vg.pc

        # Regular framebuffer
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/egl_linuxfb.pc ${D}${libdir}/pkgconfig/egl.pc
        cp -r ${S}/apitrace/non-x11/usr/lib/* ${D}${libdir}
        cp -r ${S}/apitrace/non-x11/usr/bin/* ${D}${bindir}
        
        backend=fb

    fi

    # Install Vendor ICDs for OpenCL's installable client driver loader (ICDs Loader)
    install -d ${D}${sysconfdir}/OpenCL/vendors/
    install -m 0644 ${S}/gpu-core/etc/Vivante.icd ${D}${sysconfdir}/OpenCL/vendors/Vivante.icd

    # We'll only have one backend here so we rename it to generic name
    # and avoid rework in other packages, when possible
    mv ${D}${libdir}/libGL.so.1.2 ${D}${libdir}/libGL.so.1.2.0
    ln -sf libGL.so.1.2.0 ${D}${libdir}/libGL.so.1.2
    ln -sf libGL.so.1.2.0 ${D}${libdir}/libGL.so.1
    ln -sf libGL.so.1.2.0 ${D}${libdir}/libGL.so
    mv ${D}${libdir}/libEGL-${backend}.so ${D}${libdir}/libEGL.so.1.0
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so.1
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so
    mv ${D}${libdir}/libGAL-${backend}.so ${D}${libdir}/libGAL.so
    mv ${D}${libdir}/libVIVANTE-${backend}.so ${D}${libdir}/libVIVANTE.so

    # update libglesv2 as backend dependent
    rm -rf ${D}${libdir}/libGLESv2*
    cp ${S}/gpu-core/usr/lib/libGLESv2-${backend}.so ${D}${libdir}/libGLESv2.so.2.0.0
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so.2
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so

    # skip packaging wayland libraries if no support is requested
    if [ "${HAS_WL}" = "no" ]; then
        rm ${D}${libdir}/libgc_wayland_protocol.*
        rm ${D}${libdir}/libwayland-viv.*
    fi

    for backend in wl x11 fb dri; do
        find ${D}${libdir} -name "*-$backend.so" -exec rm '{}' ';'
        find ${D}${libdir} -name "*.$backend.so" -exec rm '{}' ';'
    done

    # FIXME: MX6SL does not have 3D support; hack it for now
    if [ "${IS_MX6SL}" = "1" ]; then
        rm -rf ${D}${libdir}/libCLC* ${D}${includedir}/CL \
               \
               ${D}${libdir}/libGL* ${D}${includedir}/GL* \ 
               \
               ${D}${libdir}/libGLES* \
               \
               ${D}${libdir}/libOpenCL* ${D}${includedir}/CL \
               \
               ${D}${libdir}/libOpenVG.so ${D}${libdir}/libOpenVG.3d.so \
               \
               ${D}${libdir}/libVivanteOpenCL.so \
               \
               ${D}/opt/viv_samples/vdk \
               ${D}/opt/viv_samples/es20 ${D}/opt/viv_samples/cl11

        ln -sf libOpenVG.2d.so ${D}${libdir}/libOpenVG.so
    fi

    find ${D}${libdir} -type f -exec chmod 644 {} \;
    find ${D}${includedir} -type f -exec chmod 644 {} \;

    chown -R root:root "${D}"
}

RPROVIDES_libwayland-viv-mx6 += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xf86-video-mx6fb-vivante', '', d)}"

INSANE_SKIP_imx-gpu-viv-g2d_mx6 += "dev-so"
FILES_imx-gpu-viv-g2d_mx6 = "${libdir}/libg2d* "
FILES_imx-gpu-viv-g2d-dev_mx6 = "${includedir}/g2d.h"

INSANE_SKIP_imx-viv-dpu-g2d_mx8 += "dev-so"
FILES_imx-viv-dpu-g2d_mx8 = "${libdir}/libg2d* "
FILES_imx-viv-dpu-g2d-dev_mx8 = "${includedir}/g2d.h"

# COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx8)"
