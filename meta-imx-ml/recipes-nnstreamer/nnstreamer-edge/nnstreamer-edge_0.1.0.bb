SUMMARY = "NNStreamer-Edge library"
DESCRIPTION = "Remote source nodes for NNStreamer pipelines without GStreamer dependencies"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=095e13fef457e259d3bc155d0ed859f1"

DEPENDS = "\
    gtest \
"

NNS_EDGE_SRC ?= "git://github.com/nnstreamer/nnstreamer-edge.git;protocol=https"
SRCBRANCH = "lts/0.1.0.b"
SRCREV = "2efc10afd1161a025fa3848aca487fb9a665f3c0"
SRC_URI = "${NNS_EDGE_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE =  " \
    -DENABLE_TEST=ON \
"
