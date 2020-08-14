SUMMARY = "Intel SSE intrinsics to Arm NEON translator"
DESCRIPTION = "A translator from Intel SSE intrinsics to Arm/Aarch64 NEON implementation"
HOMEPAGE = "https://github.com/DLTcollab/sse2neon"
SECTION = "lib"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7ae2be7fb1637141840314b51970a9f7"

PV = "0.0+git${SRCPV}"

# upstream does not yet publish any release so we have to fetch last working version from GIT
SRCREV = "8ff6315f90c9f733a5f4a3b11793e8e106485c2b"
SRC_URI = "git://github.com/DLTcollab/sse2neon.git;protocol=https \
           file://0001-Use-bitbake-cross-compile-settings.patch"
S = "${WORKDIR}/git"

do_install() {
    install -d ${D}/opt/${BPN}
    install -m 0755 tests/main ${D}/opt/${BPN}

    install -d ${D}${includedir}
    install -m 0644 sse2neon.h ${D}${includedir}
}

FILES_${PN} += "/opt"
