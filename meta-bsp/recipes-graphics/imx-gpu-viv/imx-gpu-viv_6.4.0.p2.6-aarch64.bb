require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[md5sum] = "83a2988b79e9b9be370d8a2820bb0a51"
SRC_URI[sha256sum] = "b3aef0d9c4e7a2242dfff5ad80e18a478fb75d6fcc12994d30ae4a84d2804f70"

do_install_append() {
    if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
        cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
    fi

    # Remove the work done by the upstream install for libvulkan so
    # we can install the newly versioned library files
    rm ${D}${libdir}/libvulkan_VSI.so
    # Copy backend-specific library and rename it for use by vulkan-loader
    # library of the same name
    for i in fb wl x11; do
        if [ "$i" = "${backend}" ]; then
            mv ${D}${libdir}/libvulkan-${backend}.so.1.1.3 ${D}${libdir}/libvulkan_VSI.so.1.1.3
        else
            rm ${D}${libdir}/libvulkan-${i}.so.1.1.3
        fi
    done
    patchelf --set-soname libvulkan_VSI.so.1 ${D}${libdir}/libvulkan_VSI.so.1.1.3
    rm ${D}${libdir}/libvulkan.so.1 ${D}${libdir}/libvulkan.so
    ln -s libvulkan_VSI.so.1.1.3 ${D}${libdir}/libvulkan_VSI.so.1
    ln -s libvulkan_VSI.so.1.1.3 ${D}${libdir}/libvulkan_VSI.so
}

COMPATIBLE_MACHINE = "(mx8)"
