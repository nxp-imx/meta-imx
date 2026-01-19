SUMMARY = "Collection of additional Wayland protocols"
DESCRIPTION = "Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c7b12b6702da38ca028ace54aae3d484 \
                    file://stable/presentation-time/presentation-time.xml;endline=26;md5=4646cd7d9edc9fa55db941f2d3a7dc53"

SRC_URI = "https://gitlab.freedesktop.org/wayland/wayland-protocols/-/releases/${IMX_BASE_VERSION}/downloads/wayland-protocols-${IMX_BASE_VERSION}.tar.xz \
           file://0001-linux-dmabuf-support-passing-buffer-DTRC-meta-to-com.patch"
IMX_BASE_VERSION = "${@'.'.join((d.getVar('PV') or '').split('.')[:2])}"
SRC_URI[sha256sum] = "4d2b2a9e3e099d017dc8107bf1c334d27bb87d9e4aff19a0c8d856d17cd41ef0"
S = "${UNPACKDIR}/${BPN}-${IMX_BASE_VERSION}"

UPSTREAM_CHECK_URI = "https://gitlab.freedesktop.org/wayland/wayland-protocols/-/tags"
UPSTREAM_CHECK_REGEX = "releases/(?P<pver>.+)"

DEPENDS += "wayland-native"

# NOTE: For i.MX drop allarch since the recipe is SOCARCH
#inherit meson pkgconfig allarch
inherit meson pkgconfig

EXTRA_OEMESON += "-Dtests=false"

BBCLASSEXTEND = "native nativesdk"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6-nxp-bsp|mx7-nxp-bsp|mx8-nxp-bsp|mx9-nxp-bsp)"
