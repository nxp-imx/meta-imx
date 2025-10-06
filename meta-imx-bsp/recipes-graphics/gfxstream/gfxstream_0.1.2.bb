# Copyright 2025 NXP

SUMMARY = "gfxstream for graphics"
DESCRIPTION = "Graphics Streaming Kit is a code generator that makes \
it easier to serialize and forward graphics API calls from one place to another"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c18bc94001e6e45c4727758ff462348"

DEPENDS = "libaemu libdrm virtual/libx11 virtual/egl virtual/libgl"

SRC_URI = "git://android.googlesource.com/platform/hardware/google/gfxstream;protocol=https;branch=main \
           file://0001-host-Fix-gcc15-build-issues.patch"
SRCREV = "23d05703b94035ac045df60823fb1fc4be0fdf1c"

inherit meson pkgconfig

BBCLASSEXTEND = " native nativesdk"
