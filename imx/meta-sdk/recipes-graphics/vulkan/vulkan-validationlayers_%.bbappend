FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://icd_VSI.json \
    file://0001-CMakeLists.txt-Change-the-installation-path-of-JSON-.patch \
"
# choose wayland
PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '' ,d)}"

DEPENDS += " virtual/egl glslang spirv-tools"

EXTRA_OECMAKE_remove = "-DBUILD_LAYERS=OFF"
# Enable validation layers
EXTRA_OECMAKE_append = " -DBUILD_LAYERS=ON"

do_install_append () {

    install -d ${D}${sysconfdir}/vulkan/icd.d
    cp ${WORKDIR}/icd_VSI.json ${D}${sysconfdir}/vulkan/icd.d
    sed -i "s,/usr/lib,${libdir}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
    sed -i "s,1.0.30,${PV}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libVkLayer_*.so"

# The package libvulkan-imx is required to configure the imx-gpu-viv vulkan drivers for the validation layers
RDEPENDS_${PN} += "libvulkan-imx"

INSANE_SKIP_${PN} = "dev-so"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8mm = "(^$)"
