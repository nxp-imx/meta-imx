# Copyright 2025 NXP

SUMMARY = "Android Emulator utility library"
DESCRIPTION = "This is a utility library for common functions used in the Android Emulator. External projects (gfxstream, QEMU) may use to perform C++ functions."
HOMEPAGE = "https://android.googlesource.com/platform/hardware/google/aemu"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff39be111c2cce0426721beaa1211c63"

SRC_URI = "git://android.googlesource.com/platform/hardware/google/aemu;protocol=https;branch=main"
SRCREV = "dd8b929c247ce9872c775e0e5ddc4300011d0e82"
S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = " \
	-DAEMU_COMMON_GEN_PKGCONFIG=ON \
	-DENABLE_VKCEREAL_TESTS=OFF \
	-DAEMU_COMMON_BUILD_CONFIG=gfxstream"

BBCLASSEXTEND = "native nativesdk"
