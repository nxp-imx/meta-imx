SUMMARY = "dEQP OpenGL and OpenGL ES Conformance Tests"
DESCRIPTION = "OpenGL and OpenGL ES conformance tests from the Khronos GPU testing suite called \
dEQP (drawElements Quality Program). The tests are expanded versions of the OpenGL \
ES 2.x Conformance Test."
HOMEPAGE = "https://github.com/KhronosGroup/VK-GL-CTS"
LICENSE = "Apache-2.0"
DEPENDS = "libpng zlib"

LIC_FILES_CHKSUM = "file://LICENSE;md5=67d07a07ec29a50a3ded12b2ba952257"

SRCREV = "89051d61768b3aa1a6cbb20a9bbef58d225f4fb0"
SRC_URI = " \
    git://github.com/KhronosGroup/VK-GL-CTS.git;protocol=https \
    file://0001-Add-wayland-build-for-vk-gl-cts-repo.patch \
    file://0002-MGS-4031-Report-NotSupported-for-OpenVG-tests-on-non.patch \
    file://0003-MGS-4913-Fix-eglBindAPI-issue-in-EGL-no_config-test-.patch \
"
S = "${WORKDIR}/git"

inherit pkgconfig cmake distro_features_check

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
    src_dir=external/${PN}/modules
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
