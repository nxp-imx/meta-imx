DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "dd1d15418f6c254f6715f693d94bf5a4"
SRC_URI[arm-fb.sha256sum] = "c86365b49e222bc2c57a8ba04386cf83beabbc803d5f431fe19510af6e6a3811"

SRC_URI[arm-wayland.md5sum] = "baa823373e4eb2e1192fd5b4cd44b050"
SRC_URI[arm-wayland.sha256sum] = "d560e294f157eb7e056e9afbee1fd3c2323ba2958e0f542a76f5adf82e315834"

SRC_URI[arm-x11.md5sum] = "ba225dfd79cbf4cf07b95c7af65fe876"
SRC_URI[arm-x11.sha256sum] = "04a26a8508edfff4c49d1cd30054d2fe7c3235f767bbe3ae1cf8d40fd87cc0a6"

SRC_URI[aarch64-fb.md5sum] = "e9d89969997e08feb931295371f7fc92"
SRC_URI[aarch64-fb.sha256sum] = "ed3ce3a58c0b1104ef4e9c2cea9593efa17025284813922210c5e9bab09e85b4"

SRC_URI[aarch64-wayland.md5sum] = "a6da0d302ab11b0253f1fe6e47e92e3a"
SRC_URI[aarch64-wayland.sha256sum] = "ba686ecab76f007683edc61e56e63109f5434d5dfb1c79046650d94898348132"

SRC_URI[aarch64-x11.md5sum] = "7cb50951561f857b5a9730d32c2949f8"
SRC_URI[aarch64-x11.sha256sum] = "d88a230f857aba687ab074562d74b38ef3ccd4fed27657878c121f8f87211b99"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
