# Copyright 2025 NXP

SUMMARY = "rutabaga_gfx"
DESCRIPTION = "Handling virtio-gpu protocols with C API"
HOMEPAGE = "https://github.com/google/crosvm/tree/main/rutabaga_gfx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=03dbda889fc4ff3d6d2981a1504ea88b"

DEPENDS = "gfxstream"

SRC_URI = "crate://crates.io/rutabaga_gfx/0.1.3 \
           file://rutabaga-gfx-Cargo.lock \
"

require ${BPN}-crates.inc

SRC_URI[rutabaga_gfx-0.1.3.sha256sum] = "fe2630cf42077f1d55dbf6ce76578c89ed3fc8b9717864d09faf875d00d1a0c2"
S = "${UNPACKDIR}/cargo_home/bitbake/rutabaga_gfx-0.1.3"

inherit cargo pkgconfig cargo-update-recipe-crates

CARGO_BUILD_FLAGS += "--features=gfxstream"

do_configure:prepend() {
    cp ${UNPACKDIR}/rutabaga-gfx-Cargo.lock ${S}/Cargo.lock
}

do_install[noexec]="1"
