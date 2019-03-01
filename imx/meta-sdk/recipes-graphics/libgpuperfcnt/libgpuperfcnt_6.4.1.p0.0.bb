DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "dd1d15418f6c254f6715f693d94bf5a4"
SRC_URI[arm-fb.sha256sum] = "c86365b49e222bc2c57a8ba04386cf83beabbc803d5f431fe19510af6e6a3811"

SRC_URI[arm-wayland.md5sum] = "baa823373e4eb2e1192fd5b4cd44b050"
SRC_URI[arm-wayland.sha256sum] = "d560e294f157eb7e056e9afbee1fd3c2323ba2958e0f542a76f5adf82e315834"

SRC_URI[arm-x11.md5sum] = "ba225dfd79cbf4cf07b95c7af65fe876"
SRC_URI[arm-x11.sha256sum] = "04a26a8508edfff4c49d1cd30054d2fe7c3235f767bbe3ae1cf8d40fd87cc0a6"

SRC_URI[aarch64-fb.md5sum] = "1b0f9687b240d9d80487dc9e993f27e1"
SRC_URI[aarch64-fb.sha256sum] = "02034a4239cb854f1319f2ecfd9ea06c2cb01c63bc47cc8c3a1cd4dbf1b24262"

SRC_URI[aarch64-wayland.md5sum] = "a6da0d302ab11b0253f1fe6e47e92e3a"
SRC_URI[aarch64-wayland.sha256sum] = "ba686ecab76f007683edc61e56e63109f5434d5dfb1c79046650d94898348132"

SRC_URI[aarch64-x11.md5sum] = "abd53df873a9f911e6bad58ee916193a"
SRC_URI[aarch64-x11.sha256sum] = "46bb1cb42c7767e9379311d4906f0ae6d31ca72e201a41b0beba9e68affec51b"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
