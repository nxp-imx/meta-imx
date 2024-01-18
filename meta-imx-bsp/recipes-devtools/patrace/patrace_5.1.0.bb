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

SRC_URI = "gitsm://github.com/ARM-software/${BPN}.git;branch=master;protocol=https"
SRCREV = "06ab2eb1be315408f9ac652715f2f19c5c4b3182"

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

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

FILES:${PN} = "/opt"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
