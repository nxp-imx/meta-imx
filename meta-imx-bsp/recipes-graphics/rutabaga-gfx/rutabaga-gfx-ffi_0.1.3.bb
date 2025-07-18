# Copyright 2025 NXP

SUMMARY = "FFI bindings for rutabaga_gfx"
DESCRIPTION = "Handling virtio-gpu protocols with C API"
HOMEPAGE = "https://github.com/google/crosvm/tree/main/rutabaga_gfx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=03dbda889fc4ff3d6d2981a1504ea88b"

DEPENDS = "gfxstream"

SRC_URI = "crate://crates.io/rutabaga_gfx_ffi/0.1.3 \
           file://0001-build.rs-Fix-pc-file-to-use-env-variable-in-build_ou.patch \
           file://rutabaga-gfx-Cargo.lock \
"
# FIXME: Should require rutabaga-gfx-ffi-crates.inc
require rutabaga-gfx-crates.inc
SRC_URI:append = "crate://crates.io/rutabaga_gfx/0.1.3 \
                  crate://crates.io/once_cell/1.21.3 \
"

SRC_URI[rutabaga_gfx_ffi-0.1.3.sha256sum] = "a7c28e6912aa1f08d66f955f663e6c0aae9c29ca55d527a7b01e96c1ad734299"
SRC_URI[rutabaga_gfx-0.1.3.sha256sum] = "fe2630cf42077f1d55dbf6ce76578c89ed3fc8b9717864d09faf875d00d1a0c2"
SRC_URI[once_cell-1.21.3.sha256sum] = "42f5e15c9953c5e4ccceeb2e7382a716482c34515315f7b03532b8b4e8393d2d"

S = "${UNPACKDIR}/cargo_home/bitbake/rutabaga_gfx_ffi-${PV}"

inherit cargo pkgconfig cargo-update-recipe-crates

export RUTABAGA_OUT_DIR="${B}/target/${BUILD_DIR}"
CARGO_BUILD_FLAGS += "--offline --features=gfxstream"
CARGO_BUILD_FLAGS:remove = "--frozen"

LIB_NAME = "librutabaga_gfx_ffi.so"
RUTABAGA_VERSION_MAJOR = "0"
RUTABAGA_VERSION = "${PV}"

do_configure:prepend() {
    cp ${UNPACKDIR}/rutabaga-gfx-Cargo.lock ${S}/Cargo.lock
}

do_install() {
    install -d ${D}${includedir}/rutabaga_gfx/
    install -d ${D}${libdir}/pkgconfig

    install -m755 ${B}/target/${CARGO_TARGET_SUBDIR}/deps/${LIB_NAME}  ${D}${libdir}/${LIB_NAME}.${RUTABAGA_VERSION}

    ln -sf ${LIB_NAME}.${RUTABAGA_VERSION} ${D}${libdir}/${LIB_NAME}.${RUTABAGA_VERSION_MAJOR}
    ln -sf ${LIB_NAME}.${RUTABAGA_VERSION} ${D}${libdir}/${LIB_NAME}

    install -m 0644 ${RUTABAGA_OUT_DIR}/rutabaga_gfx_ffi.pc ${D}${libdir}/pkgconfig/
    install -m 0644 ${S}/src/include/rutabaga_gfx_ffi.h ${D}${includedir}/rutabaga_gfx/
}
