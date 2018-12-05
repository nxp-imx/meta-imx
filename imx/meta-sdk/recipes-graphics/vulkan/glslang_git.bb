SUMMARY = "An OpenGL and OpenGL ES shader front end and validator."
DESCRIPTION = "Glslang is the official reference compiler front end \
               for the OpenGL ES and OpenGL shading languages. It \
               implements a strict interpretation of the specifications \
               for these languages. It is open and free for anyone to use, \
               either from a command line or programmatically."
SECTION = "graphics"
HOMEPAGE = "https://www.khronos.org/opengles/sdk/tools/Reference-Compiler"

inherit cmake

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://glslang/Include/Types.h;beginline=1;endline=36;md5=26473d85c7f85d955e24663f67a53818"

S = "${WORKDIR}/git"

SRCREV = "1bc601c674aecc2fee0dee8ff7a118db76b4c439"
SRC_URI = "git://github.com/KhronosGroup/glslang \
"

FILES_${PN} += "${libdir}/*"

BBCLASSEXTEND = "native nativesdk"

do_install_append() {
    # Some of the vulkan samples/test require these headers
    install -d ${D}${includedir}/SPIRV
    cp -f ${S}/SPIRV/GlslangToSpv.h ${D}${includedir}/SPIRV
    cp -f ${S}/SPIRV/Logger.h ${D}${includedir}/SPIRV
    cp -f ${S}/SPIRV/SPVRemapper.h ${D}${includedir}/SPIRV
    cp -f ${S}/SPIRV/spvIR.h ${D}${includedir}/SPIRV

    # Remove redundant headers from spirv-headers
    rm -rf ${D}${includedir}/SPIRV/GLSL.std.450.h
    rm -rf ${D}${includedir}/SPIRV/spirv.hpp

    install -d ${D}${includedir}/glslang/Include
    cp -f ${S}/glslang/Include/*.h ${D}${includedir}/glslang/Include
    install -d ${D}${includedir}/glslang/Public
    cp -f ${S}/glslang/Public/*.h ${D}${includedir}/glslang/Public
    install -d ${D}${includedir}/glslang/MachineIndependent
    cp -f ${S}/glslang/MachineIndependent/Versions.h ${D}${includedir}/glslang/MachineIndependent
}
