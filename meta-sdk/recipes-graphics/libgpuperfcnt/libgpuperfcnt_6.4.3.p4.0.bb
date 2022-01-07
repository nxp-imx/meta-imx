DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI[arm-fb.md5sum] = "69a3997dfdd6a6a119609f73c6fba018"
SRC_URI[arm-fb.sha256sum] = "957762a732f3780dc71bc922fdeae6283bcee88bee4843afcd7af82a889a1754"

SRC_URI[arm-wayland.md5sum] = "b20508ddddb72adacc97746e4f34d21e"
SRC_URI[arm-wayland.sha256sum] = "c56d42037d240e4a0da6cfb9d3b8385d1c1a873686eecd9b46b0719fb578e914"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "0d4698872559ed1332d649a4b9653b84"
SRC_URI[aarch64-wayland.sha256sum] = "4e7a05760cd32e738bedbc24e91ba37b7268fc8bb34beb64dc77d4cdeac98ee7"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
