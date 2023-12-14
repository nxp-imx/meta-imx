SUMMARY = "Graphics libraries and driver for i.MX Mali GPU"
SECTION = "libs"
DEPENDS = " \
    libdrm \
    vulkan-loader \
    wayland \
    wayland-protocols"
PROVIDES = " \
    virtual/egl \
    virtual/libgbm \
    virtual/libgles1 \
    virtual/libgles2 \
    virtual/libgles3 \
    ${PROVIDES_OPENCL}"
PROVIDES_OPENCL = " \
    opencl-clhpp \
    opencl-headers \
    opencl-icd-loader \
    virtual/opencl-icd"

# The packaged binaries have been stripped of debug info, so disable
# operations accordingly.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

PACKAGES =+ " \
    ${PN}-libegl    ${PN}-libegl-dev \
    ${PN}-libgbm    ${PN}-libgbm-dev \
    ${PN}-libgles1  ${PN}-libgles1-dev \
    ${PN}-libgles2  ${PN}-libgles2-dev \
    ${PN}-libgles3  ${PN}-libgles3-dev \
    ${PN}-libopencl ${PN}-libopencl-dev \
    ${PN}-libvulkan"

# Since libmali.so is loaded by dlopen, include it in the main package
FILES:${PN} += " \
    ${libdir}/libmali.so \
    ${nonarch_base_libdir}/firmware"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} = "dev-so"
FILES:${PN}-libegl = " \
    ${libdir}/libEGL${SOLIBS}"
FILES:${PN}-libgbm = " \
    ${libdir}/libgbm${SOLIBS}"
FILES:${PN}-libgles1 = " \
    ${libdir}/libGLESv1_CM${SOLIBS}"
FILES:${PN}-libgles2 = " \
    ${libdir}/libGLESv2${SOLIBS}"
FILES:${PN}-libopencl = " \
    ${libdir}/libOpenCL${SOLIBS} \
    ${sysconfdir}/OpenCL"
FILES:${PN}-libvulkan = " \
    ${sysconfdir}/vulkan"

FILES:${PN}-dev = " \
    ${bindir}/malisc"
FILES:${PN}-libegl-dev = " \
    ${includedir}/EGL \
    ${includedir}/KHR \
    ${libdir}/libEGL${SOLIBSDEV} \
    ${libdir}/pkgconfig/egl.pc"
FILES:${PN}-libgbm-dev = " \
    ${includedir}/gbm.h \
    ${libdir}/libgbm${SOLIBSDEV} \
    ${libdir}/pkgconfig/gbm.pc"
FILES:${PN}-libgles1-dev = " \
    ${includedir}/GLES \
    ${libdir}/libGLESv1_CM${SOLIBSDEV} \
    ${libdir}/pkgconfig/glesv1_cm.pc"
FILES:${PN}-libgles2-dev = " \
    ${includedir}/GLES2 \
    ${libdir}/libGLESv2${SOLIBSDEV} \
    ${libdir}/pkgconfig/glesv2.pc"
FILES:${PN}-libgles3-dev = " \
    ${includedir}/GLES3"
# Note: libGLESv2.so contains both GLES 2 and 3 implementations, so pull in
# GLES 3 headers manually
RDEPENDS:${PN}-libgles2-dev = "${PN}-libgles3-dev"
FILES:${PN}-libopencl-dev = " \
    ${bindir}/mali_clcc \
    ${includedir}/CL \
    ${libdir}/libOpenCL${SOLIBSDEV} \
    ${libdir}/pkgconfig/OpenCL.pc"

python __anonymous() {

    # Avoid Debian-renaming
    for p in (("libegl",    "libegl1"      ),
              ("libgbm",    "libgbm1"      ),
              ("libgles1",  "libglesv1-cm1"),
              ("libgles2",  "libglesv2-2"  ),
              ("libgles3",                 ),
              ("libopencl",                )):
        fullp = "${PN}-" + p[0]
        pkgs = "".join(' %s' % i for i in p)
        d.setVar("DEBIAN_NOAUTONAME:" + fullp, "1")
        d.appendVar("RREPLACES:"  + fullp, pkgs)
        d.appendVar("RPROVIDES:"  + fullp, pkgs)
        d.appendVar("RCONFLICTS:" + fullp, pkgs)
        # libmali.so is loaded with dlopen, so an explicit runtime dependency is necessary
        d.appendVar("RDEPENDS:"   + fullp, "${PN}")

        # For -dev, the first element is both the Debian and original name
        fullp += "-dev"
        pkgs = p[0] + "-dev"
        d.setVar("DEBIAN_NOAUTONAME:" + fullp, "1")
        d.appendVar("RREPLACES:"  + fullp, pkgs)
        d.appendVar("RPROVIDES:"  + fullp, pkgs)
        d.appendVar("RCONFLICTS:" + fullp, pkgs)
}

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
