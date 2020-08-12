require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI[md5sum] = "503f289aa4aea6b745512d5202fe4df3"
SRC_URI[sha256sum] = "028349ada1d43b8664d5c5c6179e26efc6671c938ed8ad686f364b562b795689"

do_install_append() {
    rm ${D}${libdir}/libGL.so.1.2.0
    cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0

    # Install the newly versioned EGL library files
    rm ${D}${libdir}/libEGL.so.1.0
    cp ${S}/gpu-core/usr/lib/libEGL-${backend}.so ${D}${libdir}/libEGL.so.1.5
    ln -sf libEGL.so.1.5 ${D}${libdir}/libEGL.so.1
    ln -sf libEGL.so.1.5 ${D}${libdir}/libEGL.so

    # Remove the work done by the upstream install for libvulkan so
    # we can install the newly versioned library files
    rm ${D}${libdir}/libvulkan_VSI.so
    # Copy backend-specific library and rename it for use by vulkan-loader
    # library of the same name
    for i in fb wl x11; do
        if [ "$i" = "${backend}" ]; then
            mv ${D}${libdir}/libvulkan-${backend}.so.1.1.6 ${D}${libdir}/libvulkan_VSI.so.1.1.6
        else
            rm ${D}${libdir}/libvulkan-${i}.so.1.1.6
        fi
    done
    patchelf --set-soname libvulkan_VSI.so.1 ${D}${libdir}/libvulkan_VSI.so.1.1.6
    rm ${D}${libdir}/libvulkan.so.1 ${D}${libdir}/libvulkan.so
    ln -s libvulkan_VSI.so.1.1.6 ${D}${libdir}/libvulkan_VSI.so.1
    ln -s libvulkan_VSI.so.1.1.6 ${D}${libdir}/libvulkan_VSI.so
}

COMPATIBLE_MACHINE = "(mx8)"
