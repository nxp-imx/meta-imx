# Copyright (C) 2019 Garmin Ltd. or its subsidiaries
# Released under the MIT license (see COPYING.MIT for the terms)

require arm-binary-toolchain.inc

COMPATIBLE_HOST = "(x86_64|aarch64).*-linux"

SUMMARY = "Arm GNU Toolchain - AArch32 bare-metal target (arm-none-eabi)"
LICENSE = "GPL-3.0-with-GCC-exception & GPL-3.0-only"

LIC_FILES_CHKSUM:aarch64 = "file://share/doc/gcc/Copying.html;md5=b58b1e79cb685387c684bf647c848b82"
LIC_FILES_CHKSUM:x86-64 = "file://share/doc/gcc/Copying.html;md5=b58b1e79cb685387c684bf647c848b82"

SRC_URI = "https://developer.arm.com/-/media/Files/downloads/gnu/${PV}/binrel/arm-gnu-toolchain-${PV}-${HOST_ARCH}-${BINNAME}.tar.xz;name=gcc-${HOST_ARCH}"
SRC_URI[gcc-aarch64.sha256sum] = "87330bab085dd8749d4ed0ad633674b9dc48b237b61069e3b481abd364d0a684"
SRC_URI[gcc-x86_64.sha256sum] = "62a63b981fe391a9cbad7ef51b17e49aeaa3e7b0d029b36ca1e9c3b2a9b78823"

S = "${WORKDIR}/arm-gnu-toolchain-${PV}-${HOST_ARCH}-${BINNAME}"

UPSTREAM_CHECK_URI = "https://developer.arm.com/downloads/-/arm-gnu-toolchain-downloads"
UPSTREAM_CHECK_REGEX = "arm-gnu-toolchain-(?P<pver>\d+\.\d*\.[A-z]*\d*).*-${HOST_ARCH}-${BINNAME}\.tar\.\w+"
