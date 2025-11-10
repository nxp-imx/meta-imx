SUMMARY = "SCMI access to various entities on the host"
DESCRIPTION = "A vhost-user backend that emulates a VirtIO SCMI device"
HOMEPAGE = "https://github.com/rust-vmm/vhost-device"
LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE-BSD-3-Clause;md5=2489db1359f496fff34bd393df63947e \
"

SRC_URI += "crate://crates.io/vhost-device-scmi/0.4.0"
SRC_URI[vhost-device-scmi-0.4.0.sha256sum] = "3440e1cb8d0d2ec5dda3ccbcdcfd7153dd494576381c2ac974becb9a3368b8a1"

inherit cargo
inherit cargo-update-recipe-crates
inherit pkgconfig

include vhost-device-scmi-crates.inc

CARGO_BUILD_FLAGS += " --features=xen"
