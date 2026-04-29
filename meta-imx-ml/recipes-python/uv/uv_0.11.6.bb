SUMMARY = "uv - An extremely fast Python package manager, written in Rust"
DESCRIPTION = "uv is a fast Python package installer and resolver written in Rust by Astral."
HOMEPAGE = "https://github.com/astral-sh/uv"
LICENSE = "MIT | Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://LICENSE-MIT;md5=45674e482567aa99fe883d3270b11184 \
"

SRC_URI = "git://github.com/astral-sh/uv.git;protocol=https;branch=main"
SRCREV = "65950801cc3c609b65be34938bb407ab6e30a9fe"

S = "${UNPACKDIR}/${BPN}-${PV}"

inherit cargo pkgconfig

CARGO_BUILD_FLAGS = "--release"

# Disable BitBake vendoring - let Cargo fetch dependencies from network
CARGO_DISABLE_BITBAKE_VENDORING = "1"

DEPENDS += "\
    openssl \
    zlib \
"

RDEPENDS:${PN} += "\
    python3-core \
"

do_compile[network] = "1"

# Convert Yocto target to Cargo target triple format for linker env var
CARGO_TARGET_SUBDIR = "${@d.getVar('RUST_TARGET_SYS').replace('-', '_')}"

do_compile() {
    export OPENSSL_DIR="${STAGING_DIR_TARGET}${prefix}"
    export OPENSSL_LIB_DIR="${STAGING_DIR_TARGET}${libdir}"
    export OPENSSL_INCLUDE_DIR="${STAGING_DIR_TARGET}${includedir}"

    export HTTP_PROXY="${HTTP_PROXY}"
    export HTTPS_PROXY="${HTTPS_PROXY}"
    export http_proxy="${http_proxy}"
    export https_proxy="${https_proxy}"
    export NO_PROXY="${NO_PROXY}"
    export no_proxy="${no_proxy}"

    cd ${S}
    oe_cargo_build --target ${RUST_TARGET_SYS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/target/${RUST_TARGET_SYS}/release/uv ${D}${bindir}
    install -m 0755 ${B}/target/${RUST_TARGET_SYS}/release/uvx ${D}${bindir}
}

FILES:${PN} += "${bindir}/uv"

INSANE_SKIP:${PN} += "already-stripped"

