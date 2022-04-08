FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0005-glfw-fix-glfw3.h-gl-error.patch"

do_install() {
    install -d ${D}${bindir}
    cp ${B}/app/bin/aarch64/vulkan_samples ${D}${bindir}/
    chmod a+x ${D}${bindir}/vulkan_samples
    cp -r ${S}/assets ${D}${bindir}/
    cp -r ${S}/shaders ${D}${bindir}/
}
