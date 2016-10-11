DESCRIPTION = "Open Asset Import Library"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"

DEPENDS = "boost"

SRC_URI = "http://sourceforge.net/projects/assimp/files/assimp-3.1/assimp-3.1.1_no_test_models.zip"
SRC_URI[md5sum] = "ccd4788204509da58a3a53c7aeda7a8b"
SRC_URI[sha256sum] = "da9827876f10a8b447270368753392cfd502e70a2e9d1361554e5dfcb1fede9e"

PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/${PN}-${PV}"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake/assimp-3.1/*.cmake"