FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://icd_VSI.json \
"
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

RDEPENDS_${PN} += "libvulkan-imx"

do_install_append () {

    install -d ${D}${sysconfdir}/vulkan/icd.d
    cp ${WORKDIR}/icd_VSI.json ${D}${sysconfdir}/vulkan/icd.d
    sed -i "s,/usr/lib,${libdir}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
    sed -i "s,1.0.30,${PV}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json

# Use some vulkan headers from imx-gpu-viv
    rm -rf ${D}${includedir}/vulkan/vk_*
}

COMPATIBLE_MACHINE = "(mx8)"
