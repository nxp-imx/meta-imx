DESCRIPTION = "Open Asset Import Library is a portable Open Source library to import \
               various well-known 3D model formats in a uniform manner."
HOMEPAGE = "http://www.assimp.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cd8c0aedc7a0623476669377d7eeda8"

DEPENDS = "boost virtual/libgl"

SRC_URI = "https://github.com/${BPN}/${BPN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "fc57b024e80ebb13301bd0983826cad3"
SRC_URI[sha256sum] = "d385c3f90876241343f09e45f4e5033a6a05861b971c63d1f6d512371ffdc7bf"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake"
