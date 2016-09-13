# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU driver and apps for imx"
SECTION = "libs"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://gpu-core/usr/include/gc_vdk.h;beginline=5;endline=11;md5=12c028cbbbedb4b8770267131500592c"

DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'virtual/libx11 libxdamage libxext libxfixes mesa', \
                             bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
                                           '', d), d)} \
            libpng"

EXTRA_PROVIDES = ""
EXTRA_PROVIDES_mx6q   = "virtual/libgl virtual/libgles1 virtual/libgles2"
EXTRA_PROVIDES_mx6dl  = "virtual/libgl virtual/libgles1 virtual/libgles2"
EXTRA_PROVIDES_mx6sx  = "virtual/libgl virtual/libgles1 virtual/libgles2"
EXTRA_PROVIDES_mx7ulp = "virtual/libgl virtual/libgles1 virtual/libgles2"
EXTRA_PROVIDES_mx8    = "virtual/libgl virtual/libgles1 virtual/libgles2"
PROVIDES += "imx-gpu-viv virtual/wayland-egl virtual/libgal-x11 virtual/egl virtual/libopenvg ${EXTRA_PROVIDES}"
RPROVIDES_${PN}_mx6q   += "imx-gpu-viv"
RPROVIDES_${PN}_mx6dl  += "imx-gpu-viv"
RPROVIDES_${PN}_mx6sx  += "imx-gpu-viv"
RPROVIDES_${PN}_mx7ulp += "imx-gpu-viv"
RPROVIDES_${PN}_mx8    += "imx-gpu-viv"

PE = "1"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

PACKAGES =+ "libclc-imx libclc-imx-dev \
	libgl-imx libgl-imx-dev \
	libgles-imx libgles-imx-dev \
	libgles2-imx libgles2-imx-dev \
	libgles3-imx-dev \
	libglslc-imx libglslc-imx-dev \
	libopencl-imx libopencl-imx-dev \
	libopenvg-imx libopenvg-imx-dev \
	libvdk-imx libvdk-imx-dev \
	libegl-imx libegl-imx-dev \
	libgal-imx libgal-imx-dev \
	libvivante-imx libvivante-imx-dev \
	libvivante-dri-imx \
	libvsc-imx \
	libgbm-imx libgbm-imx-dev \
	libwayland-viv-imx libwayland-viv-imx-dev \
	libgc-wayland-protocol-imx libgc-wayland-protocol-imx-dev \
	libwayland-egl-imx-dev \
	imx-gpu-viv-tools \
	imx-gpu-viv-tools-apitrace \
	imx-gpu-viv-demos \
"
PACKAGES_append_mx8 = " libvulkan-imx libvulkan-imx-dev \
                        libopenvx-imx libopenvx-imx-dev \
"

python __anonymous () {
        has_vivante_kernel_driver_support = (d.getVar('MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT', True) or '0')
        if has_vivante_kernel_driver_support != '1':
                raise bb.parse.SkipPackage('The kernel of machine needs to have Vivante kernel driver support for this recipe to be used.')
}

USE_X11 = "${@bb.utils.contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"
USE_WL = "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "yes", "no", d)}"

# Inhibit warnings about files being stripped.
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# FIXME: The provided binary doesn't provide soname. If in future BSP
# release the libraries are fixed, we can drop this hack.
REALSOLIBS := "${SOLIBS}"
SOLIBS = "${SOLIBSDEV}"

# For the packages that make up the OpenGL interfaces, inject variables so that
# they don't get Debian-renamed (which would remove the -imx suffix).
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
        fullp = p[0] + "-imx"
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

IS_MX6SL = "0"
IS_MX6SL_mx6sl = "1"

IS_MX8 = "0"
IS_MX8_mx8 = "1"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}${bindir}

    cp -P ${S}/gpu-core/usr/lib/*.so* ${D}${libdir}
    cp -r ${S}/gpu-core/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}

    if [ "${IS_MX8}" = "0" ]; then
        cp -r ${S}/gpu-tools/gmem-info/usr/bin/* ${D}${bindir}
    fi

    install -d ${D}${libdir}/pkgconfig

    # The preference order, based in DISTRO_FEATURES, is Wayland (with or without X11), X11 and fb
    if [ "${USE_WL}" = "yes" ]; then
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
        install -m 0644 ${S}/gpu-core/usr/lib/pkgconfig/gbm.pc ${D}${libdir}/pkgconfig/gbm.pc

       if [ "${USE_X11}" = "yes" ]; then

        cp -r ${S}/gpu-core/usr/lib/dri ${D}${libdir}

       fi

    elif [ "${USE_X11}" = "yes" ]; then

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
    mv ${D}${libdir}/libVDK-${backend}.so ${D}${libdir}/libVDK.so
    mv ${D}${libdir}/libVIVANTE-${backend}.so ${D}${libdir}/libVIVANTE.so

    # update libglesv2 as backend dependent
    rm -rf ${D}${libdir}/libGLESv2*
    cp ${S}/gpu-core/usr/lib/libGLESv2-${backend}.so ${D}${libdir}/libGLESv2.so.2.0.0
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so.2
    ln -sf libGLESv2.so.2.0.0 ${D}${libdir}/libGLESv2.so

    # update libvulkan so link
    mv ${D}${libdir}/libvulkan.so ${D}${libdir}/libvulkan.so.1.0.0
    ln -sf libvulkan.so.1.0.0 ${D}${libdir}/libvulkan.so.1
    ln -sf libvulkan.so.1.0.0 ${D}${libdir}/libvulkan.so

    # skip packaging wayland libraries if no support is requested
    if [ "${USE_WL}" = "no" ]; then
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

ALLOW_EMPTY_${PN} = "1"

# FIXME: Remove the following lines after adding libopenvx package
INSANE_SKIP_imx-gpu-viv-dev += "dev-elf"
INSANE_SKIP_libclc-imx += "dev-deps"

RDEPENDS_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'libgc-wayland-protocol-imx', '', d)}"
RDEPENDS_${PN} += "virtual/libg2d"

FILES_libclc-imx = "${libdir}/libCLC${SOLIBS}"
FILES_libclc-imx-dev = "${includedir}/CL ${libdir}/libCLC${SOLIBSDEV}"

# libEGL.so is used by some demo apps from Freescale
INSANE_SKIP_libegl-imx += "dev-so"
FILES_libegl-imx = "${libdir}/libEGL${REALSOLIBS} ${libdir}/libEGL${SOLIBSDEV} "
FILES_libegl-imx-dev = "${includedir}/EGL ${includedir}/KHR ${libdir}/pkgconfig/egl.pc"

FILES_libgal-imx = "${libdir}/libGAL${SOLIBS} ${libdir}/libGAL_egl${SOLIBS}"
FILES_libgal-imx-dev = "${libdir}/libGAL${SOLIBSDEV} ${includedir}/HAL"
RDEPENDS_libgal-imx += "kernel-module-imx-gpu-viv"
RPROVIDES_libgal-imx += "libgal-imx"
INSANE_SKIP_libgal-imx += "build-deps"

FILES_libvsc-imx = "${libdir}/libVSC${SOLIBS}"

FILES_libgbm-imx = "${libdir}/libgbm${SOLIBS} ${libdir}/libVIVANTE.gbm${SOLIBS} ${libdir}/gbm_viv${SOLIBS}"
FILES_libgbm-imx-dev = "${libdir}/pkgconfig/gbm.pc ${includedir}/gbm.h ${libdir}/libgbm${SOLIBSDEV}"

FILES_libvulkan-imx = "${libdir}/libvulkan${SOLIBS} ${libdir}/libvulkan${REALSOLIBS}"
FILES_libvulkan-imx-dev = "${includedir}/vulkan ${libdir}/libvulkan${SOLIBSDEV}"
INSANE_SKIP_libvulkan-imx += "dev-deps"

FILES_libopenvx-imx = "${libdir}/libOpenVX${SOLIBS} ${libdir}/libOpenVXC${SOLIBS} ${libdir}/libOpenVXU${SOLIBS}"
FILES_libopenvx-imx-dev = "${includedir}/VX ${libdir}/libopenVX${SOLIBSDEV}"

FILES_libgl-imx = "${libdir}/libGL${REALSOLIBS}"
FILES_libgl-imx-dev = "${libdir}/libGL${SOLIBSDEV}"
# Includes GL headers from mesa
RDEPENDS_libgl-imx-dev += "libgl-mesa-dev"

# libEGL needs to open libGLESv1.so
INSANE_SKIP_libgles-imx += "dev-so"
FILES_libgles-imx = "${libdir}/libGLESv1*${REALSOLIBS} ${libdir}/libGLESv1*${SOLIBS} ${libdir}/libGLES_*${REALSOLIBS} ${libdir}/libGLES_*${SOLIBS}"
FILES_libgles-imx-dev = "${includedir}/GLES ${libdir}/libGLESv1*${SOLIBS} ${libdir}/libGLES_*${SOLIBSDEV} ${libdir}/pkgconfig/glesv1_cm.pc"

# libEGL needs to open libGLESv2.so
INSANE_SKIP_libgles2-imx += "dev-so"
FILES_libgles2-imx = "${libdir}/libGLESv2${REALSOLIBS} ${libdir}/libGLESv2${SOLIBS}"
FILES_libgles2-imx-dev = "${includedir}/GLES2 ${libdir}/libGLESv2${SOLIBSDEV} ${libdir}/pkgconfig/glesv2.pc"
RDEPENDS_libgles2-imx = "libglslc-imx"

FILES_libgles3-imx-dev = "${includedir}/GLES3"
# as long as there is no libgles3: ship libgles3-dev along with
# libgles2-dev - otherwise GLES3 headers have to be added manually
RDEPENDS_libgles2-imx-dev += "libgles3-imx-dev"

FILES_libglslc-imx = "${libdir}/libGLSLC${SOLIBS}"
FILES_libglslc-imx-dev = "${includedir}/CL ${libdir}/libGLSLC${SOLIBSDEV}"

FILES_libopencl-imx = "${libdir}/libOpenCL${SOLIBS} \
                       ${libdir}/libVivanteOpenCL${SOLIBS} \
                       ${sysconfdir}/OpenCL/vendors/Vivante.icd"
FILES_libopencl-imx-dev = "${includedir}/CL ${libdir}/libOpenCL${SOLIBSDEV}"
RDEPENDS_libopencl-imx= "libclc-imx"

INSANE_SKIP_libopenvg-imx += "dev-so"
FILES_libopenvg-imx = "${libdir}/libOpenVG*${SOLIBS}"
FILES_libopenvg-imx-dev = "${includedir}/VG ${libdir}/libOpenVG*${SOLIBSDEV} ${libdir}/pkgconfig/vg.pc"

FILES_libvdk-imx = "${libdir}/libVDK${SOLIBS}"
FILES_libvdk-imx-dev = "${includedir}/*vdk*.h ${libdir}/libVDK${SOLIBSDEV}"

FILES_libvivante-imx = "${libdir}/libVIVANTE${SOLIBS}"
FILES_libvivante-imx-dev = "${libdir}/libVIVANTE${SOLIBSDEV}"

FILES_libvivante-dri-imx = "${libdir}/dri/vivante_dri.so"
RDEPENDS_libvivante-dri-imx = "libdrm"

INSANE_SKIP_libwayland-viv-imx += "dev-so"
FILES_libwayland-viv-imx =  "${libdir}/libwayland-viv${REALSOLIBS}  ${libdir}/libwayland-viv${SOLIBS}"
FILES_libwayland-viv-imx-dev = "${includedir}/wayland-viv ${libdir})/libwayland-viv${SOLIBSDEV} ${libdir}/pkgconfig/wayland-viv.pc"
RPROVIDES_libwayland-viv-imx += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'xf86-video-imxfb-vivante', '', d)}"

INSANE_SKIP_libgc-wayland-protocol-imx += "dev-so"
FILES_libgc-wayland-protocol-imx = "${libdir}/libgc_wayland_protocol${REALSOLIBS} ${libdir}/libgc_wayland_protocol${SOLIBS}"
FILES_libgc-wayland-protocol-imx-dev = "${libdir}/libgc_wayland_protocol${SOLIBSDEV} ${libdir}/pkgconfig/gc_wayland_protocol.pc"

FILES_libwayland-egl-imx-dev = "${libdir}/pkgconfig/wayland-egl.pc"

FILES_imx-gpu-viv-tools = "${bindir}/gmem_info"

INSANE_SKIP_imx-gpu-viv-tools-apitrace += "dev-so"
FILES_imx-gpu-viv-tools-apitrace = " \
    ${bindir}/apitrace \
    ${bindir}/eglretrace \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "", \
       bb.utils.contains("DISTRO_FEATURES",     "x11", "glretrace", \
                                                       "", d), d)} \
    ${libdir}/apitrace \
"
RDEPENDS_imx-gpu-viv-tools-apitrace = "virtual/libg2d"

FILES_imx-gpu-viv-demos = "/opt"
INSANE_SKIP_imx-gpu-viv-demos += "rpaths dev-deps"

# COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx8)"
