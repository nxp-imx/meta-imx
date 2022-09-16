SUMMARY = "dEQP OpenGL and OpenGL ES Conformance Tests"
DESCRIPTION = "OpenGL and OpenGL ES conformance tests from the Khronos GPU testing suite called \
dEQP (drawElements Quality Program). The tests are expanded versions of the OpenGL \
ES 2.x Conformance Test."
HOMEPAGE = "https://github.com/KhronosGroup/VK-GL-CTS"
SECTION = "graphics"

LICENSE = "Apache-2.0"

DEPENDS = "libpng zlib"

VKGLCTS_SRC ?= "git://github.com/nxp-imx/vk-gl-cts-imx.git;protocol=https"
SRC_URI = "${VKGLCTS_SRC};name=vk-gl-cts;branch=imx-${BP}"
S = "${WORKDIR}/git"

inherit pkgconfig cmake

PACKAGECONFIG ??= " \
    egl \
    gles2 \
    ${@bb.utils.filter('DISTRO_FEATURES', 'opengl wayland x11', d)} \
"

PACKAGECONFIG[egl]     = ",,virtual/egl"
PACKAGECONFIG[gles1]   = ",,virtual/libgles1"
PACKAGECONFIG[gles2]   = ",,virtual/libgles2"
PACKAGECONFIG[opengl]  = ",,virtual/libgl"
PACKAGECONFIG[x11]     = ",,libxcb libx11 libxrandr"
PACKAGECONFIG[wayland] = "-DDEQP_TARGET=wayland,,wayland"

do_install() {
    install -d ${D}/${CTSDIR}
    src_dir=external/openglcts/modules
    for src in cts-runner glcts; do
        install -m 0755 $src_dir/$src ${D}/${CTSDIR}
    done
    for src in gl_cts gles2 gles3 gles31; do
        install -d ${D}/${CTSDIR}/$src
        # Install data sub-folder
        cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/data ${D}/${CTSDIR}/$src
        # Install shaders sub-folder
        case $src in
        gles2|gles3|gles31)
            cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/shaders ${D}/${CTSDIR}/$src
            ;;
        esac
        # Install graphicsfuzz sub-folder
        case $src in
        gles3)
            cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/graphicsfuzz ${D}/${CTSDIR}/$src
            ;;
        esac
    done
}

CTSDIR = "/opt/${BPN}"

FILES:${PN} = "/opt"
