DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[arm-fb.md5sum] = "a41150f134f216f189dc162eec364116"
SRC_URI[arm-fb.sha256sum] = "28a68a79618b597970aa6024a60c2afbce1d16e0499b151fec61d626b04f7c96"

SRC_URI[arm-wayland.md5sum] = "14e7fb47d79e3c44b0b82660fae41471"
SRC_URI[arm-wayland.sha256sum] = "102ded1c16fe158cb0e209b190f8057f4d54140a2a7b8a58205e3b085e967841"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "74eadf844c48e84f66416b19bcbfe3e8"
SRC_URI[aarch64-wayland.sha256sum] = "cbf40f3ffd7f4a24942837107ead21b67b1aa046ca0b0d48f636de46704dcb61"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
