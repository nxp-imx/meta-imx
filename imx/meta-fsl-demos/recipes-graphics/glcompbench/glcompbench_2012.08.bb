SUMMARY = "GL Compositing Benchmark"
DESCRIPTION = "A benchmark for GL(ES)2 based compositing operations"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

DEPENDS += "virtual/egl virtual/libgl virtual/libgal-x11 virtual/egl virtual/libgles1 virtual/libgles2 "

inherit pkgconfig waf

SRC_URI = "https://launchpad.net/glcompbench/trunk/2012.08/+download/glcompbench-2012.08.tar.gz \
           file://glbench-compile-fix.patch"

SRC_URI[md5sum] = "c939d9156fe940960098f38707fea827"
SRC_URI[sha256sum] = "b04b738cec06c6786ceafa86e4735fd8b971c078265754854ef356b0379542ee"
