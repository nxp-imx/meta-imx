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

inherit pkgconfig cmake features_check

ANY_OF_DISTRO_FEATURES = "x11 wayland"

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
    dest_dir=${D}/opt/${PN}
    install -d $dest_dir
    src_dir=external/openglcts/modules
    for src in cts-runner glcts; do
        install -m 0755 $src_dir/$src $dest_dir
    done
    for src in gl_cts gles2 gles3 gles31; do
        install -d $dest_dir/$src
        # Install data sub-folder
        cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/data $dest_dir/$src
        # Install shaders sub-folder
        case $src in
        gles2|gles3|gles31)
            cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/shaders $dest_dir/$src
            ;;
        esac
        # Install graphicsfuzz sub-folder
        case $src in
        gles3)
            cp -R --no-dereference --preserve=mode,links -v $src_dir/$src/graphicsfuzz $dest_dir/$src
            ;;
        esac
    done
}

FILES_${PN} = "/opt"
