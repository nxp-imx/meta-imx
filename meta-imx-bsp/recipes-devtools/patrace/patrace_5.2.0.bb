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

SRC_URI = " \
    gitsm://github.com/ARM-software/${BPN}.git;branch=master;protocol=https \
    file://0001-CMakeLists.txt-Switch-to-python3.patch"
SRCREV = "ca798a0223c876dcc680b68b00ca1147db121954"

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
    ln -s libEGL.so       ${D}/opt/${BPN}/lib/libEGL.so.1
    ln -s libEGL.so       ${D}/opt/${BPN}/lib/libEGL.so.1.4.0
    ln -s libGLESv1_CM.so ${D}/opt/${BPN}/lib/libGLESv1_CM.so.1
    ln -s libGLESv1_CM.so ${D}/opt/${BPN}/lib/libGLESv1_CM.so.1.1.0
    ln -s libGLESv2.so    ${D}/opt/${BPN}/lib/libGLESv2.so.2
    ln -s libGLESv2.so    ${D}/opt/${BPN}/lib/libGLESv2.so.2.1.0
}

FILES:${PN} = "/opt"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
