require recipes-multimedia/gstreamer/gstreamer1.0-plugins.inc
LICENSE = "GPLv2+ & LGPLv2+ & LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 "

DEPENDS += "libdrm gstreamer1.0-plugins-base jpeg"
DEPENDS_append_imxgpu2d = " virtual/libg2d"

inherit gettext bluetooth

# Re-use patch files from poky
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad:"
# The following PATH has highest priority
# Implement patch overwrite, using the updated patch under this PATH
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

GST1.0-PLUGINS-BAD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-bad.git;protocol=https"
SRCBRANCH = "imx-1.14.x"

SRC_URI = " \
    ${GST1.0-PLUGINS-BAD_SRC};branch=${SRCBRANCH} \
    file://configure-allow-to-disable-libssh2.patch \
    file://fix-maybe-uninitialized-warnings-when-compiling-with-Os.patch \
    file://avoid-including-sys-poll.h-directly.patch \
    file://ensure-valid-sentinels-for-gst_structure_get-etc.patch \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://0001-Makefile.am-don-t-hardcode-libtool-name-when-running.patch \
"

SRCREV = "51dd145b6ab2625a3650e096341b764294d9aaf3"

PV = "1.14.4.imx"

S = "${WORKDIR}/git"

PACKAGECONFIG ??= " \
    ${GSTREAMER_ORC} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'bluez', '', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'directfb vulkan', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'gl', '', d)} \
    bz2 curl dash dtls hls rsvg sbc smoothstreaming sndfile ttml uvch264 webp \
"
PACKAGECONFIG_append_mx6q = " opencv"
PACKAGECONFIG_append_mx6qp = " opencv"
PACKAGECONFIG_append_mx8 = " opencv kms"

#Remove unrecognised configure option for 1.14
PACKAGECONFIG_remove = " gles2"

#Remove vulkan as it's incompatible for i.MX 8M Mini
PACKAGECONFIG_remove_mx8mm = " vulkan"

PACKAGECONFIG[wayland] = "--enable-wayland,--disable-wayland,wayland-native wayland wayland-protocols"

# the gl packageconfig enables OpenGL elements that haven't been ported
# to -base yet. They depend on the gstgl library in -base, so we do
# not add GL dependencies here, since these are taken care of in -base.

PACKAGECONFIG[assrender]       = "--enable-assrender,--disable-assrender,libass"
PACKAGECONFIG[bluez]           = "--enable-bluez,--disable-bluez,${BLUEZ}"
PACKAGECONFIG[bz2]             = "--enable-bz2,--disable-bz2,bzip2"
PACKAGECONFIG[curl]            = "--enable-curl,--disable-curl,curl"
PACKAGECONFIG[dash]            = "--enable-dash,--disable-dash,libxml2"
PACKAGECONFIG[dc1394]          = "--enable-dc1394,--disable-dc1394,libdc1394"
PACKAGECONFIG[directfb]        = "--enable-directfb,--disable-directfb,directfb"
PACKAGECONFIG[dtls]            = "--enable-dtls,--disable-dtls,openssl"
PACKAGECONFIG[faac]            = "--enable-faac,--disable-faac,faac"
PACKAGECONFIG[faad]            = "--enable-faad,--disable-faad,faad2"
PACKAGECONFIG[flite]           = "--enable-flite,--disable-flite,flite-alsa"
PACKAGECONFIG[fluidsynth]      = "--enable-fluidsynth,--disable-fluidsynth,fluidsynth"
PACKAGECONFIG[hls]             = "--enable-hls --with-hls-crypto=nettle,--disable-hls,nettle"
PACKAGECONFIG[gl]              = "--enable-gl,--disable-gl,"
PACKAGECONFIG[kms]             = "--enable-kms,--disable-kms,libdrm"
PACKAGECONFIG[libde265]        = "--enable-libde265,--disable-libde265,libde265"
PACKAGECONFIG[libmms]          = "--enable-libmms,--disable-libmms,libmms"
PACKAGECONFIG[libssh2]         = "--enable-libssh2,--disable-libssh2,libssh2"
PACKAGECONFIG[lcms2]           = "--enable-lcms2,--disable-lcms2,lcms"
PACKAGECONFIG[modplug]         = "--enable-modplug,--disable-modplug,libmodplug"
PACKAGECONFIG[neon]            = "--enable-neon,--disable-neon,neon"
PACKAGECONFIG[openal]          = "--enable-openal,--disable-openal,openal-soft"
PACKAGECONFIG[opencv]          = "--enable-opencv,--disable-opencv,opencv"
PACKAGECONFIG[openh264]        = "--enable-openh264,--disable-openh264,openh264"
PACKAGECONFIG[openjpeg]        = "--enable-openjpeg,--disable-openjpeg,openjpeg"
PACKAGECONFIG[openmpt]         = "--enable-openmpt,--disable-openmpt,libopenmpt"
# the opus encoder/decoder elements are now in the -base package,
# but the opus parser remains in -bad
PACKAGECONFIG[opusparse]       = "--enable-opus,--disable-opus,libopus"
PACKAGECONFIG[resindvd]        = "--enable-resindvd,--disable-resindvd,libdvdread libdvdnav"
PACKAGECONFIG[rsvg]            = "--enable-rsvg,--disable-rsvg,librsvg"
PACKAGECONFIG[rtmp]            = "--enable-rtmp,--disable-rtmp,rtmpdump"
PACKAGECONFIG[sbc]             = "--enable-sbc,--disable-sbc,sbc"
PACKAGECONFIG[smoothstreaming] = "--enable-smoothstreaming,--disable-smoothstreaming,libxml2"
PACKAGECONFIG[sndfile]         = "--enable-sndfile,--disable-sndfile,libsndfile1"
PACKAGECONFIG[srtp]            = "--enable-srtp,--disable-srtp,libsrtp"
PACKAGECONFIG[tinyalsa]        = "--enable-tinyalsa,--disable-tinyalsa,tinyalsa"
PACKAGECONFIG[ttml]            = "--enable-ttml,--disable-ttml,libxml2 pango cairo"
PACKAGECONFIG[uvch264]         = "--enable-uvch264,--disable-uvch264,libusb1 libgudev"
PACKAGECONFIG[voaacenc]        = "--enable-voaacenc,--disable-voaacenc,vo-aacenc"
PACKAGECONFIG[voamrwbenc]      = "--enable-voamrwbenc,--disable-voamrwbenc,vo-amrwbenc"
PACKAGECONFIG[vulkan]          = "--enable-vulkan,--disable-vulkan,vulkan"
PACKAGECONFIG[wayland]         = "--enable-wayland,--disable-wayland,wayland-native wayland wayland-protocols libdrm"
PACKAGECONFIG[webp]            = "--enable-webp,--disable-webp,libwebp"
PACKAGECONFIG[webrtc]          = "--enable-webrtc,--disable-webrtc,libnice"
PACKAGECONFIG[webrtcdsp]       = "--enable-webrtcdsp,--disable-webrtcdsp,webrtc-audio-processing"

# these plugins have no corresponding library in OE-core or meta-openembedded:
#   openni2 winks direct3d directsound winscreencap acm apple_media iqa
#   android_media avc bs2b chromaprint daala dts fdkaac gme gsm kate ladspa
#   lv2 mpeg2enc mplex msdk musepack nvenc ofa opensles soundtouch
#   spandsp spc teletextdec vdpau wasapi x265 zbar

EXTRA_OECONF += " \
    --enable-decklink \
    --enable-dvb \
    --enable-fbdev \
    --enable-ipcpipeline \
    --enable-netsim \
    --enable-shm \
    --enable-vcd \
    --disable-acm \
    --disable-android_media \
    --disable-aom \
    --disable-apple_media \
    --disable-avc \
    --disable-bs2b \
    --disable-chromaprint \
    --disable-daala \
    --disable-direct3d \
    --disable-directsound \
    --disable-dts \
    --disable-fdk_aac \
    --disable-gme \
    --disable-gsm \
    --disable-iqa \
    --disable-kate \
    --disable-ladspa \
    --disable-lv2 \
    --disable-mpeg2enc \
    --disable-mplex \
    --disable-msdk \
    --disable-musepack \
    --disable-nvenc \
    --disable-ofa \
    --disable-openexr \
    --disable-openni2 \
    --disable-opensles \
    --disable-soundtouch \
    --disable-spandsp \
    --disable-spc \
    --disable-srt \
    --disable-teletextdec \
    --disable-vdpau \
    --disable-wasapi \
    --disable-wildmidi \
    --disable-winks \
    --disable-winscreencap \
    --disable-x265 \
    --disable-zbar \
    ${@bb.utils.contains("TUNE_FEATURES", "mx32", "--disable-yadif", "", d)} \
"
# Disable introspection to fix [GstGL-1.0.gir] Error
EXTRA_OECONF_append = " --disable-introspection"

EXTRA_OECONF_remove = " --disable-sdl --disable-nas --disable-libvisual --disable-xvid --disable-mimic \
                        --disable-pvr --disable-sdltest --disable-wininet --disable-timidity \
                        --disable-linsys --disable-sndio --disable-apexsink \
                        --disable-libssh2 --disable-qt --disable-schro --disable-cocoa --disable-gtk3 \
                        --enable-egl --disable-opengl --disable-gles2 \
"

EXTRA_OECONF_remove = "WAYLAND_PROTOCOLS_SYSROOT_DIR=${RECIPE_SYSROOT}"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

# Fix libgstbadion-1.0.so.0 which is under built directory cannot be found
do_compile_prepend () {
    export GIR_EXTRA_LIBS_PATH="${B}/gst-libs/gst/ion/.libs"
}

export OPENCV_PREFIX = "${STAGING_DIR_TARGET}${prefix}"

ARM_INSTRUCTION_SET_armv4 = "arm"
ARM_INSTRUCTION_SET_armv5 = "arm"

FILES_${PN}-freeverb += "${datadir}/gstreamer-${LIBV}/presets/GstFreeverb.prs"
FILES_${PN}-opencv += "${datadir}/gst-plugins-bad/${LIBV}/opencv*"
FILES_${PN}-voamrwbenc += "${datadir}/gstreamer-${LIBV}/presets/GstVoAmrwbEnc.prs"

PACKAGE_ARCH_imxpxp = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx8 = "${MACHINE_SOCARCH}"
