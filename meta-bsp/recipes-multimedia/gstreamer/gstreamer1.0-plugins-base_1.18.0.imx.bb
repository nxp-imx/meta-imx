require recipes-multimedia/gstreamer/gstreamer1.0-plugins-common.inc

LICENSE = "GPLv2+ & LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://github.com/nxp-imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "MM_04.06.02_2108_L5.10.y"
SRCREV = "b52013ba4aa2120c5f94b8caae7f175a8bc16091" 
SRC_URI = "${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
           "

S = "${WORKDIR}/git"

DEPENDS += "iso-codes util-linux zlib"
DEPENDS_append_imxgpu2d = " virtual/libg2d"

inherit use-imx-headers gobject-introspection 

DEFAULT_PREFERENCE = "-1"

PACKAGES_DYNAMIC =+ "^libgst.*"

# opengl packageconfig factored out to make it easy for distros
# and BSP layers to choose OpenGL APIs/platforms/window systems
PACKAGECONFIG_GL ?= "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gles2 egl viv-fb', '', d)}"

PACKAGECONFIG ??= " \
    ${GSTREAMER_ORC} \
    ${PACKAGECONFIG_GL} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'alsa x11', d)} \
    ogg pango png theora vorbis \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland egl', '', d)} \
"

OPENGL_APIS = 'opengl gles2'
OPENGL_PLATFORMS = 'egl'
OPENGL_WINSYS = 'x11 wayland gbm viv-fb'

X11DEPENDS = "virtual/libx11 libsm libxrender libxv"
X11ENABLEOPTS = "-Dx11=enabled -Dxvideo=enabled -Dxshm=enabled"
X11DISABLEOPTS = "-Dx11=disabled -Dxvideo=disabled -Dxshm=disabled"

PACKAGECONFIG[alsa]         = "-Dalsa=enabled,-Dalsa=disabled,alsa-lib"
PACKAGECONFIG[cdparanoia]   = "-Dcdparanoia=enabled,-Dcdparanoia=disabled,cdparanoia"
PACKAGECONFIG[jpeg]         = "-Dgl-jpeg=enabled,-Dgl-jpeg=disabled,jpeg"
PACKAGECONFIG[ogg]          = "-Dogg=enabled,-Dogg=disabled,libogg"
PACKAGECONFIG[opus]         = "-Dopus=enabled,-Dopus=disabled,libopus"
PACKAGECONFIG[pango]        = "-Dpango=enabled,-Dpango=disabled,pango"
PACKAGECONFIG[png]          = "-Dgl-png=enabled,-Dgl-png=disabled,libpng"
PACKAGECONFIG[theora]       = "-Dtheora=enabled,-Dtheora=disabled,libtheora"
PACKAGECONFIG[tremor]       = "-Dtremor=enabled,-Dtremor=disabled,tremor"
PACKAGECONFIG[visual]       = "-Dlibvisual=enabled,-Dlibvisual=disabled,libvisual"
PACKAGECONFIG[vorbis]       = "-Dvorbis=enabled,-Dvorbis=disabled,libvorbis"
PACKAGECONFIG[x11]          = "${X11ENABLEOPTS},${X11DISABLEOPTS},${X11DEPENDS}"

# OpenGL API packageconfigs
PACKAGECONFIG[opengl]       = ",,virtual/libgl libglu"
PACKAGECONFIG[gles2]        = ",,virtual/libgles2"

# OpenGL platform packageconfigs
PACKAGECONFIG[egl]          = ",,virtual/egl"
PACKAGECONFIG[viv-fb]          = ",,virtual/egl virtual/libgles2"

# OpenGL window systems (except for X11)
PACKAGECONFIG[gbm]          = ",,virtual/libgbm libgudev libdrm"
PACKAGECONFIG[wayland]      = ",,wayland-native wayland wayland-protocols libdrm"

EXTRA_OEMESON += " \
    -Dgl-graphene=disabled \
    ${@get_opengl_cmdline_list('gl_api', d.getVar('OPENGL_APIS'), d)} \
    ${@get_opengl_cmdline_list('gl_platform', d.getVar('OPENGL_PLATFORMS'), d)} \
    ${@get_opengl_cmdline_list('gl_winsys', d.getVar('OPENGL_WINSYS'), d)} \
    -Dc_args="${CFLAGS} -I${STAGING_INCDIR_IMX}" \
"

#GTKDOC_MESON_OPTION = "gtk_doc"
GTKDOC_MESON_ENABLE_FLAG = "enabled"
GTKDOC_MESON_DISABLE_FLAG = "disabled"

FILES_${PN} += "${libdir}/gstreamer-1.0/include"
FILES_${MLPREFIX}libgsttag-1.0 += "${datadir}/gst-plugins-base/1.0/license-translations.dict"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"

def get_opengl_cmdline_list(switch_name, options, d):
    selected_options = []
    if bb.utils.contains('DISTRO_FEATURES', 'opengl', True, False, d):
        for option in options.split():
            if bb.utils.contains('PACKAGECONFIG', option, True, False, d):
                selected_options += [option]
    if selected_options:
        return '-D' + switch_name + '=' + ','.join(selected_options)
    else:
        return ''
