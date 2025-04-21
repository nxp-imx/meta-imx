SUMMARY = "Software for capturing GLES calls of an application"
DESCRIPTION = "\
PATrace is software for capturing GLES calls of an application and \
replaying them on a different device, keeping the GPU workload the \
same. It's similar to the open source Apitrace project, but optimised \
for performance measurements."
SECTION = "console/tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a1fcde5f6838616beb564260554a388f"
DEPENDS = "wayland"

SRC_URI = "gitsm://github.com/ARM-software/${BPN}.git;branch=master;protocol=https \
           file://0001-CMakeLists.txt-Switch-to-python3.patch \
"
SRCREV = "9e0f8ce6b5d6056a4ede30ece59836a7bcaf5ea0"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

OECMAKE_GENERATOR = "Unix Makefiles"

OECMAKE_SOURCEPATH = "${S}/patrace/project/cmake"

EXTRA_OECMAKE = " \
    -DWINDOWSYSTEM=wayland \
    -DCMAKE_INSTALL_PREFIX:PATH=/opt/${BPN}"

# FIXME: Don't ignore problems
CFLAGS += "-Wno-maybe-uninitialized"
CXXFLAGS += "-Wno-range-loop-construct -Wno-unused-variable"

do_install:append() {
    ln -s libEGL.so       ${D}/opt/${BPN}/${baselib}/libEGL.so.1
    ln -s libEGL.so       ${D}/opt/${BPN}/${baselib}/libEGL.so.1.4.0
    ln -s libGLESv1_CM.so ${D}/opt/${BPN}/${baselib}/libGLESv1_CM.so.1
    ln -s libGLESv1_CM.so ${D}/opt/${BPN}/${baselib}/libGLESv1_CM.so.1.1.0
    ln -s libGLESv2.so    ${D}/opt/${BPN}/${baselib}/libGLESv2.so.2
    ln -s libGLESv2.so    ${D}/opt/${BPN}/${baselib}/libGLESv2.so.2.1.0
}

FILES:${PN} = "/opt"
INSANE_SKIP:${PN}-src += "buildpaths"
COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
