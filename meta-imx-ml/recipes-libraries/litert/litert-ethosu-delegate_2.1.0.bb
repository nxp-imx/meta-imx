# Copyright 2025-2026 NXP
DESCRIPTION = "LiteRT Ethos-u Delegate"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "ethos-u-driver-stack litert-flatbuffers-native ethos-u-vela"

require litert-${PV}.inc

TENSORFLOW_LITE_ETHOSU_DELEGATE_SRC ?= "git://github.com/nxp-imx/tflite-ethosu-delegate-imx.git;protocol=https" 
SRCBRANCH_ethosu = "lf-6.18.20_2.0.0"
SRCREV_ethosu = "f0d1d86e895e455d00068f2d3af02b1f6bb8b9dd" 

SRCREV_FORMAT = "ethosu_tf"

SRC_URI = "${TENSORFLOW_LITE_ETHOSU_DELEGATE_SRC};branch=${SRCBRANCH_ethosu};name=ethosu \
           ${LITERT_SRC};branch=${SRCBRANCH_litert};name=litert;destsuffix=litertgit \
           ${SRC_URI_DEPS} \
"
SRCREV_FORMAT = "ethosu_litert_${SRCREV_FORMAT_DEPS}"

inherit python3native cmake

EXTRA_OECMAKE = " \
     -DBUILD_FOR_LITERT=ON \
     -DTFLITE_HOST_TOOLS_DIR=${STAGING_BINDIR_NATIVE} \
     -DFETCHCONTENT_SOURCE_DIR_LITERT=${UNPACKDIR}/litertgit \
     ${DEPS_CMAKE_FLAGS} \
"
OECMAKE_TARGET_COMPILE = "tensorflow-lite litert_ethosu_delegate"

CXXFLAGS += "-fPIC -ffile-prefix-map=${WORKDIR}="

do_configure[network] = "1"
do_configure:append() {
    # Fix FlatBuffers version mismatch in generated headers
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

COMPATIBLE_MACHINE = "(mx93-nxp-bsp)"
