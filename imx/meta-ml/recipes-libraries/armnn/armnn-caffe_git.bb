SUMMARY = "Caffe protobuf files - used in ARMNN for Caffe network models"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91d560803ea3d191c457b12834553991"

SRC_URI = "git://github.com/BVLC/caffe.git;branch=${BRANCH}"

PV = "1.0"

BRANCH = "master"
SRCREV = "99bd99795dcdf0b1d3086a8d67ab1782a8a08383"

DEPENDS = "protobuf-native"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    ${STAGING_DIR_NATIVE}/${prefix}/bin/protoc -I ${S}/src/caffe/proto --cpp_out=src/caffe/proto ${S}/src/caffe/proto/caffe.proto
}

do_install() {
    install -d ${D}${datadir}/${BPN}/caffe/proto/
    for file in ${S}/src/caffe/proto/caffe.pb.*
    do
        install -m 0644 $file ${D}${datadir}/${BPN}/caffe/proto/
    done
}
