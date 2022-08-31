DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI[arm-fb.md5sum] = "a41150f134f216f189dc162eec364116"
SRC_URI[arm-fb.sha256sum] = "28a68a79618b597970aa6024a60c2afbce1d16e0499b151fec61d626b04f7c96"

SRC_URI[arm-wayland.md5sum] = "accf0059d137f65135b62fba1da47f48"
SRC_URI[arm-wayland.sha256sum] = "4fd7a335b49bcf44f7e4ebf43dc12fbb07a48e7a77acff282b88f0a4739ab7b2"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "8e4ea4de8cc3c14358407fb299f312d0"
SRC_URI[aarch64-wayland.sha256sum] = "5dbbbce0a6e470cae0a5f9c7b32e87056e0808c3cddba5f7bfd0a6918915a4e1"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
