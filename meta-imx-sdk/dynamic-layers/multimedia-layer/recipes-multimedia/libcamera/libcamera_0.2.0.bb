SUMMARY = "Linux libcamera framework"
SECTION = "libs"

LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

LIC_FILES_CHKSUM = "\
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = " \
        git://git.libcamera.org/libcamera/libcamera.git;protocol=https;branch=master \
        file://0001-media_device-Add-bool-return-type-to-unlock.patch \
        file://0002-options-Replace-use-of-VLAs-in-C.patch \
        file://0001-rpi-Use-alloca-instead-of-variable-length-arrays.patch \
        file://0001-ipu3-Use-posix-basename.patch \
"

SRCREV = "89227a428a82e724548399d35c98ea89566f9045"

PE = "1"

S = "${WORKDIR}/git"

DEPENDS = "python3-pyyaml-native python3-jinja2-native python3-ply-native python3-jinja2-native udev gnutls chrpath-native libevent libyaml"
DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'qt', 'qtbase qtbase-native', '', d)}"

PACKAGES =+ "${PN}-gst"

# Disable v4l2 on 32-bit to avoid Y2038 bug
PACKAGECONFIG ??= "${PACKAGECONFIG_V4L2}"
PACKAGECONFIG_V4L2            ?= "v4l2"
PACKAGECONFIG_V4L2:arm:imx-nxp-bsp = ""

PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[v4l2] = "-Dv4l2=true,-Dv4l2=false"

LIBCAMERA_PIPELINES ??= "auto"

EXTRA_OEMESON = " \
    -Dpipelines=${LIBCAMERA_PIPELINES} \
    -Dcam=enabled \
    -Dlc-compliance=disabled \
    -Dtest=false \
    -Ddocumentation=disabled \
"

RDEPENDS:${PN} = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland qt', 'qtwayland', '', d)}"

inherit meson pkgconfig python3native

do_configure:prepend() {
    sed -i -e 's|py_compile=True,||' ${S}/utils/ipc/mojo/public/tools/mojom/mojom/generate/template_expander.py
}

do_install:append() {
    chrpath -d ${D}${libdir}/libcamera.so
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'v4l2', d)}" = "v4l2" ]; then
        chrpath -d ${D}${libexecdir}/libcamera/v4l2-compat.so
    fi
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
FILES:${PN}-gst = "${libdir}/gstreamer-1.0"

# Set _FILE_OFFSET_BITS=32 to get access to both 32 and 64 bit file APIs when support v4l2 on 32bit platform
GLIBC_64BIT_TIME_FLAGS:arm:imx-nxp-bsp = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'v4l2', '', ' -D_TIME_BITS=64 -D_FILE_OFFSET_BITS=64', d)} \
"
