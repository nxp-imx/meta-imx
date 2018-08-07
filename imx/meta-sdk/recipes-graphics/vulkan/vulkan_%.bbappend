FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://icd_VSI.json \
    file://0001-CMakeLists.txt-Modify-the-library-path-to-point-to.patch \
"
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

DEPENDS = "virtual/egl glslang spirv-tools"
RDEPENDS_${PN} += "libvulkan-imx"

EXTRA_OECMAKE_remove = "-DBUILD_LAYERS=OFF"
# Enable validation layers
EXTRA_OECMAKE_append = " -DBUILD_LAYERS=ON"

do_install_append () {

    install -d ${D}${sysconfdir}/vulkan/icd.d
    cp ${WORKDIR}/icd_VSI.json ${D}${sysconfdir}/vulkan/icd.d
    sed -i "s,/usr/lib,${libdir}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
    sed -i "s,1.0.30,${PV}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json

# Use some vulkan headers from imx-gpu-viv
    rm -rf ${D}${includedir}/vulkan/vk_*
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libvulkan.so ${libdir}/libVkLayer_*.so"
INSANE_SKIP_${PN} = "dev-so"

COMPATIBLE_MACHINE = "(mx8)"
