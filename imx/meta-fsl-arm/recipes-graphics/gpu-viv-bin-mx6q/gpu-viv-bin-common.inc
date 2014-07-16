# Copyright (C) 2012-2014 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Common meta data for all i.MX GPUs"
SECTION = "libs"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/include/gc_vdk.h;endline=11;md5=c4713c78d7f52bf2f92688a6f8f0cc93"

DEPENDS += "${@base_contains('DISTRO_FEATURES', 'x11', 'virtual/libx11 libxdamage libxext libxfixes mesa', \
                             base_contains('DISTRO_FEATURES', 'wayland', 'wayland', \
                                           '', d), d)}"

PROVIDES += "virtual/wayland-egl virtual/libgal-x11 virtual/egl virtual/libopenvg"

PE = "1"

inherit fsl-eula-unpack

FILESEXTRAPATHS_prepend := "${THISDIR}/gpu-viv-bin-mx6q:"

SRC_URI = "file://egl.pc \
           file://egl_x11.pc \
           file://vg.pc \
           file://vg_x11.pc \
           file://gc_wayland_protocol.pc \
           file://wayland-egl.pc \
           file://wayland-viv.pc \
           file://directfbrc \
          "
PACKAGES =+ "libopenvg-mx6 libopenvg-mx6-dev libopenvg-mx6-dbg \
	libvdk-mx6 libvdk-mx6-dev libvdk-mx6-dbg \
	libegl-mx6 libegl-mx6-dev libegl-mx6-dbg \
	libgal-mx6 libgal-mx6-dev libgal-mx6-dbg \
	libvivante-mx6 libvivante-mx6-dev libvivante-mx6-dbg \
	libvivante-dfb-mx6 \
	libwayland-viv-mx6 libwayland-viv-mx6-dev libwayland-viv-mx6-dbg \
	libgc-wayland-protocol-mx6 libgc-wayland-protocol-mx6-dev libgc-wayland-protocol-mx6-dbg \
	libwayland-egl-mx6-dev \
"

# Skip package if it does not match the machine float-point type in use
python __anonymous () {
        is_machine_hardfp = base_contains("TUNE_FEATURES", "callconvention-hard", True, False, d)
        is_package_hardfp = d.getVar("PACKAGE_FP_TYPE", True) == "hardfp"

        if is_package_hardfp != is_machine_hardfp:
                PN = d.getVar("PN", True)
                PV = d.getVar("PV", True)
                bb.debug(1, "Skipping %s (%s) as machine and package float-point does not match" % (PN, PV))
                raise bb.parse.SkipPackage("Package Float-Point is not compatible with the machine")
}

USE_X11 = "${@base_contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"
USE_DFB = "${@base_contains("DISTRO_FEATURES", "directfb", "yes", "no", d)}"
USE_WL = "${@base_contains("DISTRO_FEATURES", "wayland", "yes", "no", d)}"
USE_SL = ""
USE_SL_mx6sl = "yes"

# Inhibit warnings about files being stripped.
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# FIXME: The provided binary doesn't provide soname. If in future BSP
# release the libraries are fixed, we can drop this hack.
REALSOLIBS := "${SOLIBS}"
SOLIBS = "${SOLIBSDEV}"

# For the packages that make up the OpenGL interfaces, inject variables so that
# they don't get Debian-renamed (which would remove the -mx6 suffix).
#
# FIXME: All binaries lack GNU_HASH in elf binary but as we don't have
# the source we cannot fix it. Disable the insane check for now.
python __anonymous() {
    packages = d.getVar('PACKAGES', True).split()
    for p in packages:
        d.appendVar("INSANE_SKIP_%s" % p, " ldflags")

    for p in (("libegl", "libegl1"), ("libgl", "libgl1"),
              ("libgles1", "libglesv1-cm1"), ("libgles2", "libglesv2-2"),
              ("libgles3",)):
        fullp = p[0] + "-mx6"
        pkgs = " ".join(p)
        d.setVar("DEBIAN_NOAUTONAME_" + fullp, "1")
        d.appendVar("RREPLACES_" + fullp, pkgs)
        d.appendVar("RPROVIDES_" + fullp, pkgs)
        d.appendVar("RCONFLICTS_" + fullp, pkgs)

        # For -dev, the first element is both the Debian and original name
        fullp += "-dev"
        pkgs = p[0] + "-dev"
        d.setVar("DEBIAN_NOAUTONAME_" + fullp, "1")
        d.appendVar("RREPLACES_" + fullp, pkgs)
        d.appendVar("RPROVIDES_" + fullp, pkgs)
        d.appendVar("RCONFLICTS_" + fullp, pkgs)
}

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp -a ${S}/usr/lib/*.so* ${D}${libdir}
    cp -axr ${S}/usr/include/* ${D}${includedir}
    cp -axr ${S}/opt ${D}

    if [ "${USE_SL}" = "yes" ]; then
        cd ${D}${libdir}
        rm -rf libGL* libCLC.so libOpenCL.so libOpenVG.3d.so libVivanteOpenCL.so libOpenVG.so
        mv libOpenVG.2d.so libOpenVG.so
        cd ${D}${includedir}
        rm -rf GL* CL
        cd ${D}/opt/viv_samples
        rm -rf vdk tiger es20 cl11
    fi

    install -d ${D}${libdir}/pkgconfig

    # The preference order, based in DISTRO_FEATURES, is x11, wayland, directfb and fb
    if [ "${USE_X11}" = "yes" ]; then

        backend=x11

        install -m 0644 ${WORKDIR}/egl_x11.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/vg_x11.pc ${D}${libdir}/pkgconfig/vg.pc
        mv ${D}${libdir}/libGAL_egl.dri.so ${D}${libdir}/libGAL_egl.so
        #FIXME: WL & X11 is not currently functional
        #if [ "${USE_WL}" = "yes" ]; then
        #    install -m 0644 ${WORKDIR}/gc_wayland_protocol.pc ${D}${libdir}/pkgconfig/gc_wayland_protocol.pc
        #    install -m 0644 ${WORKDIR}/wayland-egl.pc ${D}${libdir}/pkgconfig/wayland-egl.pc
        #    install -m 0644 ${WORKDIR}/wayland-viv.pc ${D}${libdir}/pkgconfig/wayland-viv.pc
        #fi
    elif [ "${USE_WL}" = "yes" ]; then
        backend=wl

        install -m 0644 ${WORKDIR}/egl.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/vg.pc ${D}${libdir}/pkgconfig/vg.pc
        install -m 0644 ${WORKDIR}/gc_wayland_protocol.pc ${D}${libdir}/pkgconfig/gc_wayland_protocol.pc
        install -m 0644 ${WORKDIR}/wayland-egl.pc ${D}${libdir}/pkgconfig/wayland-egl.pc
        install -m 0644 ${WORKDIR}/wayland-viv.pc ${D}${libdir}/pkgconfig/wayland-viv.pc
        mv ${D}${libdir}/libGAL_egl.${backend}.so ${D}${libdir}/libGAL_egl.so
    else
        install -m 0644 ${WORKDIR}/egl.pc ${D}${libdir}/pkgconfig/egl.pc
        install -m 0644 ${WORKDIR}/vg.pc ${D}${libdir}/pkgconfig/vg.pc

        if [ "${USE_DFB}" = "yes" ]; then
            install -d ${D}/${sysconfdir}
            install -m 644 ${WORKDIR}/directfbrc ${D}/${sysconfdir}/directfbrc

            cp -r ${S}/usr/lib/directfb-1.7-1 ${D}${libdir}
            backend=dfb
        else
            # Regular framebuffer
            backend=fb
        fi
        mv ${D}${libdir}/libGAL_egl.${backend}.so ${D}${libdir}/libGAL_egl.so
    fi

    # We'll only have one backend here so we rename it to generic name
    # and avoid rework in other packages, when possible
    mv ${D}${libdir}/libEGL-${backend}.so ${D}${libdir}/libEGL.so.1.0
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so.1
    ln -sf libEGL.so.1.0 ${D}${libdir}/libEGL.so
    mv ${D}${libdir}/libGAL-${backend}.so ${D}${libdir}/libGAL.so
    mv ${D}${libdir}/libVIVANTE-${backend}.so ${D}${libdir}/libVIVANTE.so

    for backend in wl x11 fb dfb dri; do
        find ${D}${libdir} -name "*-$backend.so" -exec rm '{}' ';'
        find ${D}${libdir} -name "*.$backend.so" -exec rm '{}' ';'
    done

    find ${D}${libdir} -type f -exec chmod 644 {} \;
    find ${D}${includedir} -type f -exec chmod 644 {} \;
}

FILES_${PN} += "/opt"
FILES_${PN}-dev = "${includedir}"
FILES_${PN}-dbg = "${libdir}/.debug /opt/viv_samples/*/*/.debug"

# libEGL.so is used by some demo apps from Freescale
INSANE_SKIP_libegl-mx6 += "dev-so"
FILES_libegl-mx6 = "${libdir}/libEGL${REALSOLIBS} ${libdir}/libEGL${SOLIBSDEV} "
FILES_libegl-mx6-dev = "${includedir}/EGL ${includedir}/KHR ${libdir}/pkgconfig/egl.pc"
FILES_libegl-mx6-dbg = "${libdir}/.debug/libEGL${SOLIBS}"

FILES_libgal-mx6 = "${libdir}/libGAL${SOLIBS}"
FILES_libgal-mx6-dev = "${libdir}/libGAL${SOLIBSDEV}"
FILES_libgal-mx6-dbg = "${libdir}/.debug/libGAL${SOLIBS}"

FILES_libopenvg-mx6 = "${libdir}/libOpenVG*${SOLIBS}"
FILES_libopenvg-mx6-dev = "${includedir}/VG ${libdir}/libOpenVG*${SOLIBSDEV} ${libdir}/pkgconfig/vg.pc"
FILES_libopenvg-mx6-dbg = "${libdir}/.debug/libOpenVG*${SOLIBS}"

FILES_libvdk-mx6 = "${libdir}/libVDK${SOLIBS}"
FILES_libvdk-mx6-dev = "${includedir}/*vdk.h ${libdir}/libVDK${SOLIBSDEV}"
FILES_libvdk-mx6-dbg = "${libdir}/.debug/libVDK${SOLIBS}"

FILES_libvivante-mx6 = "${libdir}/libVIVANTE${SOLIBS}"
FILES_libvivante-mx6-dev = "${libdir}/libVIVANTE${SOLIBSDEV}"
FILES_libvivante-mx6-dbg = "${libdir}/.debug/libVIVANTE${SOLIBS}"

FILES_libvivante-dfb-mx6 = "${libdir}/directfb-1.7-1/gfxdrivers/libdirectfb_gal.so"

INSANE_SKIP_libwayland-viv-mx6 += "dev-so"
FILES_libwayland-viv-mx6 =  "${libdir}/libwayland-viv${REALSOLIBS}  ${libdir}/libwayland-viv${SOLIBS}"
FILES_libwayland-viv-mx6-dev = "${libdir})/libwayland-viv${SOLIBSDEV} ${libdir}/pkgconfig/wayland-viv.pc"
FILES_libwayland-viv-mx6-dbg = "${libdir}/.debug/libwayland-viv${SOLIBS}"

INSANE_SKIP_libgc-wayland-protocol-mx6 += "dev-so"
FILES_libgc-wayland-protocol-mx6 = "${libdir}/libgc_wayland_protocol${REALSOLIBS} ${libdir}/libgc_wayland_protocol${SOLIBS}"
FILES_libgc-wayland-protocol-mx6-dev = "${libdir}/libgc_wayland_protocol${SOLIBSDEV} ${libdir}/pkgconfig/gc_wayland_protocol.pc"
FILES_libgc-wayland-protocol-mx6-dbg = "${libdir}/libgc_wayland_protocol${SOLIBS}"

FILES_libwayland-egl-mx6-dev = "${libdir}/pkgconfig/wayland-egl.pc"

FILES_libvivante-dfb-mx6 += "${sysconfdir}/directfbrc"

COMPATIBLE_MACHINE = "(mx6|mx6sl)"
