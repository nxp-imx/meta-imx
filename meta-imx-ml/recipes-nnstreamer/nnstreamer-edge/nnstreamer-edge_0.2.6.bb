SUMMARY = "NNStreamer-Edge library"
DESCRIPTION = "Remote source nodes for NNStreamer pipelines without GStreamer dependencies"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=095e13fef457e259d3bc155d0ed859f1"

DEPENDS = "\
    gtest \
"

NNS_EDGE_SRC ?= "git://github.com/nnstreamer/nnstreamer-edge.git;protocol=https"
SRCBRANCH = "prod/tizen-9.0"
SRCREV = "e73acb740dce3ecbf8a650f45fab790afb400a95"
SRC_URI = "${NNS_EDGE_SRC};branch=${SRCBRANCH}"

inherit cmake pkgconfig

EXTRA_OECMAKE =  " \
    -DENABLE_TEST=ON \
"

# The build produces a mix of versioned and unversioned libs, so custom packaging is required
FILES_SOLIBSDEV:remove = "${libdir}/lib*${SOLIBSDEV}"
FILES:${PN}     += "${libdir}/libnnstreamer-edge-custom-test${SOLIBSDEV}"
FILES:${PN}-dev += "${libdir}/libnnstreamer-edge${SOLIBSDEV}"
