# This recipe is for the i.MX fork of libcamera. For ease of
# maintenance, the top section is a verbatim copy of an OE-core
# recipe. The second section customizes the recipe for i.MX.

########### meta-openembedded copy ##################
# Upstream hash: 3e67d23808989bb7c47be3e7f5111405e025a74d

SUMMARY = "Linux libcamera framework"
HOMEPAGE = "https://libcamera.org/"
SECTION = "libs"

LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

LIC_FILES_CHKSUM = "\
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = " \
        git://git.libcamera.org/libcamera/libcamera.git;protocol=https;branch=master;tag=v${PV} \
"

SRCREV = "cb7f7fc7223eec2d8cffa7e9d3a7f0ab3d86b59a"

PE = "1"

DEPENDS = "python3-pyyaml-native python3-jinja2-native python3-ply-native python3-jinja2-native udev gnutls chrpath-native libevent libyaml libyuv"
DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'qt', 'qtbase qtbase-native', '', d)}"

PACKAGES =+ "${PN}-compliance ${PN}-gst ${PN}-pycamera"

PACKAGECONFIG ??= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'opengl', d)} \
"

PACKAGECONFIG[dng] = "-Dapps-output-dng=enabled,-Dapps-output-dng=disabled,tiff"
PACKAGECONFIG[dw] = "-Dlibdw=enabled,-Dlibdw=disabled,elfutils,libdw"
PACKAGECONFIG[compliance] = "-Dlc-compliance=enabled,-Dlc-compliance=disabled,gtest"
PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[jpeg] = "-Dcam-jpeg=enabled,-Dcam-jpeg=disabled,libjpeg-turbo"
PACKAGECONFIG[kms] = "-Dcam-output-kms=enabled,-Dcam-output-kms=disabled,libdrm"
PACKAGECONFIG[opengl] = "-Dsoftisp-gpu=enabled,-Dsoftisp-gpu=disabled,virtual/libgl virtual/egl"
PACKAGECONFIG[python] = "-Dpycamera=enabled,-Dpycamera=disabled,python3-pybind11"
PACKAGECONFIG[raspberrypi] = ",,libpisp"
PACKAGECONFIG[sdl] = "-Dcam-output-sdl2=enabled,-Dcam-output-sdl2=disabled,virtual/libsdl2"
PACKAGECONFIG[unwind] = "-Dlibunwind=enabled,-Dlibunwind=disabled,libunwind"
PACKAGECONFIG[vimc] = ",,"

ARM_PIPELINES = "imx8-isi,mali-c55,simple,uvcvideo"
# Raspberry Pi requires the meta-raspberrypi layer
# These values are coming from the project's meson.build file,
# which lists the supported values by arch.
ARM_PIPELINES .= "${@bb.utils.contains('PACKAGECONFIG', 'raspberrypi', ',rpi/pisp,rpi/vc4', '', d)}"
ARM_PIPELINES .= "${@bb.utils.contains('PACKAGECONFIG', 'vimc', ',vimc', '', d)}"

LIBCAMERA_PIPELINES ??= "auto"
LIBCAMERA_PIPELINES:arm ??= "${ARM_PIPELINES}"
LIBCAMERA_PIPELINES:aarch64 ??= "${ARM_PIPELINES}"

EXTRA_OEMESON = " \
    -Dpipelines=${LIBCAMERA_PIPELINES} \
    -Dv4l2=enabled \
    -Dcam=enabled \
    -Dtest=false \
    -Ddocumentation=disabled \
    -Drpi-awb-nn=disabled \
"

RDEPENDS:${PN} = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland qt', 'qtwayland', '', d)}"

inherit meson pkgconfig python3native

do_configure:prepend() {
    sed -i -e 's|py_compile=True,||' ${S}/utils/codegen/ipc/mojo/public/tools/mojom/mojom/generate/template_expander.py
}

do_install:append() {
    chrpath -d ${D}${libdir}/libcamera.so
    chrpath -d ${D}${libexecdir}/libcamera/v4l2-compat.so
}

do_package:append() {
    bb.build.exec_func("do_package_recalculate_ipa_signatures", d)
}

do_package_recalculate_ipa_signatures() {
    local modules
    for module in $(find ${PKGD}/usr/lib/libcamera -name "*.so.sign"); do
        module="${module%.sign}"
        if [ -f "${module}" ] ; then
            modules="${modules} ${module}"
        fi
    done

    ${S}/src/ipa/ipa-sign-install.sh ${B}/src/ipa-priv-key.pem "${modules}"
}

FILES:${PN} += " ${libexecdir}/libcamera/v4l2-compat.so"
FILES:${PN}-compliance = "${bindir}/lc-compliance"
FILES:${PN}-gst = "${libdir}/gstreamer-1.0"
FILES:${PN}-pycamera = "${PYTHON_SITEPACKAGES_DIR}/libcamera"

# libcamera-v4l2 explicitly sets _FILE_OFFSET_BITS=32 to get access to
# both 32 and 64 bit file APIs.
GLIBC_64BIT_TIME_FLAGS = ""

INSANE_SKIP += "32bit-time"

CXXFLAGS += "-Wno-error=array-bounds"
########### End of meta-openembedded copy ###########

########### i.MX overrides ################

SRC_URI:remove = "git://git.libcamera.org/libcamera/libcamera.git;protocol=https;branch=master;tag=v${PV}"
SRC_URI:prepend = "${LIBCAMERA_SRC};branch=${SRCBRANCH} "
LIBCAMERA_SRC ?= "git://github.com/nxp-imx/libcamera.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "cb7f7fc7223eec2d8cffa7e9d3a7f0ab3d86b59a"

PACKAGECONFIG = "dng gst kms python"

ARM_PIPELINES .= ",nxp/neo"

EXTRA_OEMESON += " \
    --python.platlibdir=${PYTHON_SITEPACKAGES_DIR} \
"

# Qt installs native tools to /usr/libexec, but this is not in PATH
PATH:prepend = "${@bb.utils.contains('DISTRO_FEATURES', 'qt', '${STAGING_LIBEXECDIR_NATIVE}:', '', d)}"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp|mx8mm-nxp-bsp|mx8ulp-nxp-bsp|mx8mq-nxp-bsp)"

########### End of i.MX overrides #########
