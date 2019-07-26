DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[arm-fb.md5sum] = "348518edd0c1fbf066802a3d60741344"
SRC_URI[arm-fb.sha256sum] = "6c7cf34cd041a537dcd051ead71e392599a7c29fa93703d6a736928bb3cf09f5"

SRC_URI[arm-wayland.md5sum] = "00bbd63b0177cbe149f75fc106e8fc4c"
SRC_URI[arm-wayland.sha256sum] = "5a1fe0e67883ad52b872f3b43303ddcf670b03291ccb625d3186bf2d98fa432a"

SRC_URI[arm-x11.md5sum] = "e04324ebbf5b355b6f16dff16abe8d6d"
SRC_URI[arm-x11.sha256sum] = "ba49b1a638897b613c2285d64d2c78a09764a6e94a0450ff85c7fe5e5422e791"

SRC_URI[aarch64-fb.md5sum] = "0da96c972b0626a6dad860e4ddd187ba"
SRC_URI[aarch64-fb.sha256sum] = "a2e1d2e76f32a4240c99bbdc666f35e0769a3a4925c531b1f3514bbb4fd7ef0d"

SRC_URI[aarch64-wayland.md5sum] = "0a098face3eb7238ac54da07261fa04d"
SRC_URI[aarch64-wayland.sha256sum] = "2d89615e20bc1cc2e4cddecc1cadfe6c6bbb46d4e46e6bc5353722272b0ba39b"

SRC_URI[aarch64-x11.md5sum] = "c707c32ba6ae2877f05966e2a9d4b026"
SRC_URI[aarch64-x11.sha256sum] = "9278e41fe9d04e385e928bfd81683d64f9fc8892bd0a74a4379d0bafef3b029c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
