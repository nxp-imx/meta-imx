SUMMARY = "SPI emulation backend daemon"
DESCRIPTION = "A vhost-user backend that emulates a VirtIO SPI bus"
HOMEPAGE = "https://github.com/rust-vmm/vhost-device"
LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE-BSD-3-Clause;md5=2489db1359f496fff34bd393df63947e \
"

SRC_URI += "crate://crates.io/vhost-device-spi/0.1.0"
SRC_URI[vhost-device-spi-0.1.0.sha256sum] = "f5475087e0eeebc0725b1238be0ded68554cd70bab31952ce90f8d9bc7486ddc"

inherit cargo
inherit cargo-update-recipe-crates
inherit pkgconfig

include vhost-device-spi-crates.inc

CARGO_BUILD_FLAGS += " --features=xen"
