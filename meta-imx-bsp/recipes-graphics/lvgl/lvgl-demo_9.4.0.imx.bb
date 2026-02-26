SUMMARY = "LVGL Demo Application for Linux graphics stack"
HOMEPAGE = "https://github.com/lvgl/lv_port_linux"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=802d3d83ae80ef5f343050bf96cce3a4 \
                    file://lvgl/LICENCE.txt;md5=4570b6241b4fced1d1d18eb691a0e083"

DEPENDS = "python3-pcpp-native"

PV .= "+git"

SRC_URI = "\
	git://github.com/lvgl/lv_port_linux.git;protocol=https;branch=release/v9.4;name=demo \
	git://github.com/nxp-mcuxpresso/lvgl.git;protocol=https;branch=release/nxp-v9.4.0;name=lvgl;subdir=${S}/lvgl \
	file://0001-feat-cmake-Fix-multilib-install.patch \
	file://0001-fix-Use-LV_USE_DEMO_WIDGETS-properly-in-main.c.patch"

SRCREV_demo = "71050624acd8a52ab7d365d0d12acf9bf5fe41db"
SRCREV_lvgl = "46b15c64b23cdd2b048f06c4830cc1700a4fd529"
SRCREV_FORMAT = "demo_lvgl"

inherit cmake pkgconfig

require lv-conf.inc

PACKAGECONFIG ?= "g2d wayland"

export SDKTARGETSYSROOT = "${STAGING_DIR_NATIVE}"

EXTRA_OECMAKE += "-DLIB_INSTALL_DIR=${baselib}"

KCONFIG_CONFIG_ROOTDIR = "${S}/lvgl"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/bin/lvglsim ${D}${bindir}
}
