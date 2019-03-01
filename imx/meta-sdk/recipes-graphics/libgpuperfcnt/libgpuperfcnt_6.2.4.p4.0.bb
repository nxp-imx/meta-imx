DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "f554464cdf034bacfa2b29b07627bc34"
SRC_URI[arm-fb.sha256sum] = "58c5e8bda097a98471421038332472a9cc4228d3cdb967a411d2ac9600d2457e"

SRC_URI[arm-wayland.md5sum] = "74b79e8e9c2074f0216496daded9bbe3"
SRC_URI[arm-wayland.sha256sum] = "c1ce16983308017956f5455ed8fdd46846fea76035c895e496d3eb62c478c5de"

SRC_URI[arm-x11.md5sum] = "e68f09479dcea82e26d2bf27cd7c7308"
SRC_URI[arm-x11.sha256sum] = "0eb879355f8b2943530f29394acd5e24a3dd3e2c3818c719d7bc94c8d5c2733b"

SRC_URI[aarch64-fb.md5sum] = "052285b97bb46b0442789f25552bea62"
SRC_URI[aarch64-fb.sha256sum] = "d6a544faba1ed323f8e976f7d5e1acd1d87d2f8372f28f85c165dc22ee8119ed"

SRC_URI[aarch64-wayland.md5sum] = "ebe1df980f5f3300578d93e7c07a5439"
SRC_URI[aarch64-wayland.sha256sum] = "5aeaf09e2b0bde7b04aef48ee7d2fe182d877478e1d83ad74563933c6139e393"

SRC_URI[aarch64-x11.md5sum] = "186a79367913b3df310901c537ee8f79"
SRC_URI[aarch64-x11.sha256sum] = "a3da9684a46b32ffbe4a6b0f7afcc110cdd38f43ff33c95c874a5e95e1516f69"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
