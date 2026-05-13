# Copyright 2025-2026 NXP
DESCRIPTION = "TensorFlow Lite Neutron Delegate"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "litert neutron litert-flatbuffers-native"

require litert-${PV}.inc

NEUTRON_DELEGATE_SRC ?= "git://github.com/nxp-imx/tflite-neutron-delegate.git;protocol=https"
SRCBRANCH_neutron = "lf-6.18.20_2.0.0"
SRCREV_neutron = "6b29d116c21095482e38e23feece7e4db71eb6fa"

SRCREV_FORMAT = "neutron_tf"

SRC_URI = "${NEUTRON_DELEGATE_SRC};branch=${SRCBRANCH_neutron};name=neutron \
           ${LITERT_SRC};branch=${SRCBRANCH_litert};name=litert;destsuffix=litertgit \
           ${SRC_URI_DEPS} \
"
inherit python3native cmake

EXTRA_OECMAKE = "-DCMAKE_SYSROOT=${PKG_CONFIG_SYSROOT_DIR}"
EXTRA_OECMAKE += " \
     -DBUILD_FOR_LITERT=ON \
     -DGIT_COMMIT_HASH=${SRCREV_neutron} \
     -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
     -DFETCHCONTENT_SOURCE_DIR_LITERT=${UNPACKDIR}/litertgit \
     ${DEPS_CMAKE_FLAGS} \
"

OECMAKE_TARGET_COMPILE = "tensorflow-lite litert_neutron_delegate"

CXXFLAGS += "-fPIC -ffile-prefix-map=${WORKDIR}="

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

COMPATIBLE_MACHINE = "(mx943-nxp-bsp|mx95-nxp-bsp)"
