DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"

SRC_URI += " \
    file://icd_VSI.json \
    file://Add-install-vulkan-headers-option.patch \
"
SRC_URI_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'file://0001-CMakeLists-add-include-path-so-Xlib.h-is-found-as-ne.patch', d), d)}"

DEPENDS_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'libx11 libxcb libxext libice libsm', d), d)}"

RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'libxcb-sync libxcb-present libxcb-dri3', d), d)}"
RDEPENDS_${PN} += "libvulkan-imx"

REQUIRED_DISTRO_FEATURES_remove = "x11"

EXTRA_OECMAKE_remove = " \
    -DBUILD_TESTS=1 \
"
BUILD_WSI_WAYLAND_SUPPORT = \
    "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "ON", "OFF", d)}"
EXTRA_OECMAKE_append = " \
    -DBUILD_WSI_MIR_SUPPORT=OFF \
    -DBUILD_WSI_XCB_SUPPORT=OFF \
    -DBUILD_WSI_XLIB_SUPPORT=OFF \
    -DBUILD_WSI_WAYLAND_SUPPORT=${BUILD_WSI_WAYLAND_SUPPORT} \
    -DBUILD_TESTS=OFF \
    -DBUILD_DEMOS=OFF \
    -DCMAKE_BUILD_TYPE=Debug \
    -DCMAKE_SYSTEM_PROCESSOR=arm \
    -DCMAKE_SYSTEM_NAME=Linux \
    -DCMAKE_SYSROOT=${STAGING_DIR_HOST} \
    -DINSTALL_VULKAN_HEADERS=OFF \
"

do_install_append () {
    install -d ${D}${sysconfdir}/vulkan/icd.d
    cp ${WORKDIR}/icd_VSI.json ${D}${sysconfdir}/vulkan/icd.d
    sed -i "s,/usr/lib,${libdir}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
    sed -i "s,1.0.30,${PV}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
}

FILES_${PN} += "${sysconfdir}/vulkan/icd.d"
