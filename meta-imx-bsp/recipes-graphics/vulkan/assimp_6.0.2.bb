DESCRIPTION = "Open Asset Import Library is a portable Open Source library to import \
               various well-known 3D model formats in a uniform manner."
HOMEPAGE = "http://www.assimp.org/"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9d5275cab4fb13ae624d42ce64865de"
DEPENDS = "zlib"

SRC_URI = "git://github.com/assimp/assimp.git;protocol=https;branch=master \
           file://0001-X3D-Fix-invalid-vector-back-usage-6283.patch"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>(\d+(\.\d+)+))"
SRCREV = "fb375dd8c0a032106a2122815fb18dffe0283721"

inherit cmake

EXTRA_OECMAKE = "-DASSIMP_BUILD_ASSIMP_TOOLS=OFF -DASSIMP_BUILD_TESTS=OFF -DASSIMP_LIB_INSTALL_DIR=${baselib}"

do_unpack:append() {
    bb.build.exec_func('remove_non_compliant_source', d)
}

remove_non_compliant_source() {
    # Remove non-compliant files manually. A patch file cannot be used
    # since many of the files are binary.
    rm -rf ${S}/test/models-nonbsd ${S}/scripts/StepImporter/schema_ifc2x3.exp
}

INSANE_SKIP:${PN}-dev = "buildpaths"

BBCLASSEXTEND = "native nativesdk"
