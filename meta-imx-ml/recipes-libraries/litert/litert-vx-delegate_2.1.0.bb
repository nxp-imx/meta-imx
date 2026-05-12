# Copyright 2025-2026 NXP
DESCRIPTION = "LiteRT VX Delegate"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d6260e4f3f6f85de05af9c8f87e6fb5"

DEPENDS = "litert tim-vx litert-flatbuffers-native"

require litert-${PV}.inc

TENSORFLOW_LITE_VX_DELEGATE_SRC ?= "git://github.com/nxp-imx/tflite-vx-delegate-imx.git;protocol=https" 
SRCBRANCH_vx = "lf-6.18.20_2.0.0"
SRCREV_vx = "7adb855b49b4d5e6809372b6224cf6907561c803"

SRCREV_FORMAT = "vx_tf"

SRC_URI = "${TENSORFLOW_LITE_VX_DELEGATE_SRC};branch=${SRCBRANCH_vx};name=vx \
           ${LITERT_SRC};branch=${SRCBRANCH_litert};name=litert;destsuffix=litertgit \
           ${SRC_URI_DEPS} \
"
SRCREV_FORMAT = "vx_litert_${SRCREV_FORMAT_DEPS}"

inherit python3native cmake

EXTRA_OECMAKE = "-DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR}"
EXTRA_OECMAKE += " \
     -DBUILD_FOR_LITERT=ON \
     -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
     -DTIM_VX_INSTALL=${STAGING_DIR_HOST}/usr \
     -DFETCHCONTENT_SOURCE_DIR_LITERT=${UNPACKDIR}/litertgit \
     ${DEPS_CMAKE_FLAGS} \
"

OECMAKE_TARGET_COMPILE = "tensorflow-lite litert_vx_delegate"

CXXFLAGS += "-fPIC"

do_configure[network] = "1"
do_configure:prepend() {
    # There is no Fortran compiler in the toolchain, but bitbake sets this variable anyway
    # with unavailable binary.
    export FC=""
}

do_configure:append() {
    # Find all schema_generated.h files and fix version checks
    find "${DEPS_DIR}/tensorflow" -name "*_generated.h" -type f | while read hdr; do
        if grep -q "FLATBUFFERS_VERSION_MAJOR == 24" "$hdr" 2>/dev/null; then
            sed -i \
                -e 's/FLATBUFFERS_VERSION_MAJOR == 24/FLATBUFFERS_VERSION_MAJOR == 25/g' \
                -e 's/FLATBUFFERS_VERSION_MINOR == [0-9]*/FLATBUFFERS_VERSION_MINOR == 9/g' \
                -e 's/FLATBUFFERS_VERSION_REVISION == [0-9]*/FLATBUFFERS_VERSION_REVISION == 23/g' \
               "$hdr"
        fi
    done
}

do_install() {
    # install libraries
    install -d ${D}${libdir}
    for lib in ${B}/lib*.so*
    do
        cp --no-preserve=ownership -d $lib ${D}${libdir}
    done
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# Output library is unversioned
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

COMPATIBLE_MACHINE          = "(^$)"
COMPATIBLE_MACHINE:imxgpu3d = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp    = "(^$)"
