DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "51cdd4a01f645cc4305e99661f8f6e7d"
SRC_URI[arm-fb.sha256sum] = "ff89161ac45228d32ba6b987052c7713cade7610b443958e4d2bd163af774755"

SRC_URI[arm-wayland.md5sum] = "fc47abd0fb33a8107c7feadd91ebcbed"
SRC_URI[arm-wayland.sha256sum] = "f8727240b2f4a8ad056902048b0a8b17e607dbd4818990bb0e0ca26aeb6c258a"

SRC_URI[arm-x11.md5sum] = "649f7289c1ba7b486970e6b3738fbd35"
SRC_URI[arm-x11.sha256sum] = "fd939611d4eb93ddbdf280f3190428015a2121e256464c5b693e53b91ef9d117"

SRC_URI[aarch64-fb.md5sum] = "b29414c4bbd275c48461beb9d00e5bb0"
SRC_URI[aarch64-fb.sha256sum] = "481eb4ee29c5aa81b2205bf921ba1f392d58c19d62279cd3c8150eee47d18b3d"

SRC_URI[aarch64-wayland.md5sum] = "6ff2700816e1ab23e788870e5912ebf1"
SRC_URI[aarch64-wayland.sha256sum] = "b1ecf1ee28103f14b15ce2245eebdd23188496ff4b75e5f76693dac866bbba76"

SRC_URI[aarch64-x11.md5sum] = "e2492161fba54a66cef45eb716755874"
SRC_URI[aarch64-x11.sha256sum] = "f9a6836afd8111f6ecbdcd05af43d2dca8e6ab005aca98b22fa48fc860134def"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
