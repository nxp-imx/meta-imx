SUMMARY = "vhost input backend device"
DESCRIPTION = "A vhost-user backend that emulates a VirtIO input event"
HOMEPAGE = "https://github.com/rust-vmm/vhost-device"
LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE-BSD-3-Clause;md5=2489db1359f496fff34bd393df63947e \
"

SRC_URI += "crate://crates.io/vhost-device-input/0.1.0"
SRC_URI[vhost-device-input-0.1.0.sha256sum] = "f615b0fe4ef19d46e9b0531befabb8b3aa273a979fc6877abe1cd63d19467f00"

inherit cargo
inherit cargo-update-recipe-crates
inherit pkgconfig

include vhost-device-input-crates.inc
