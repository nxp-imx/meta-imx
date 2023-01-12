DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479" 

SRC_URI[arm-fb.md5sum] = "8b085da9ba7ba14498d3fd15f11d59d8"
SRC_URI[arm-fb.sha256sum] = "d241f4e2be94848037ac1d0fe0d812f576bd6f4f5a1a33699ccb9f20528ce2b0"

SRC_URI[arm-wayland.md5sum] = "b649181cc73f6d8becab1780de515b96"
SRC_URI[arm-wayland.sha256sum] = "d34f9b79b162d497bc1fe1f2c13ce95a34936f55fe2b8f4dc76cc63743c6acda"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "04ca7c307075953d16a436fd05eea4a5"
SRC_URI[aarch64-wayland.sha256sum] = "9ce71461f0c1157e990fccc80233252d173b066f615f1b6d31b79130586ab8ff"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
