SUMMARY = "VKTS library and samples"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://VKTS_Licenses/VKTS_license.txt;md5=1d414ecff94dba50052204ec190085c4"
DEPENDS = "imx-gpu-viv virtual/libvulkan python3-native"

inherit cmake

SRC_URI = "git://github.com/prabhusundar/Vulkan.git;protocol=https;branch=master"
SRCREV= "${AUTOREV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DVKTS_WSI=VKTS_WAYLAND_VISUAL', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',                               '', \
                                                        '-DVKTS_WSI=VKTS_DISPLAY_VISUAL', d), d)}"

do_configure_prepend () {
    cd ${S}
    python3 create_cmakelist_all.py
}

do_install () {
    install -d ${D}/opt
    install -d ${D}${libdir}
    cp -r ${S}/VKTS_Binaries/ ${D}/opt
    rm -rf ${D}/opt/VKTS_Binaries/.gitignore
    cp -r ${WORKDIR}/build/lib/* ${D}${libdir}
}

FILES_${PN} = "/opt"
FILES_${PN}-staticdev += "${libdir}/*.a"

INSANE_SKIP_${PN} += "dev-so rpaths dev-deps"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8)"
