DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[arm-fb.md5sum] = "e4029c4b547d214a334b16dbd6a39238"
SRC_URI[arm-fb.sha256sum] = "c8c97494c5f7feca6a0593b839c37cf8a641e9f44ca65ab222a702446d69fc5f"

SRC_URI[arm-wayland.md5sum] = "4c5d692567fdef175ed90be031136f90"
SRC_URI[arm-wayland.sha256sum] = "089d3e9236854810356c611c2c1c5d4e216c6442819db4f37fb6cc821fe20718"

SRC_URI[arm-x11.md5sum] = "14aefaa46083aa0a08e363c85496845b"
SRC_URI[arm-x11.sha256sum] = "af81fd5b2efd617961e663b3ceafdb16ede3ef8948b4dfd0e4b3d2b02e4bdb61"

SRC_URI[aarch64-fb.md5sum] = "a86c67409cc830bef63e365d1b15bcc3"
SRC_URI[aarch64-fb.sha256sum] = "a713267a9e4ac87807da75edc1cf198a0aa33923ae6480d7d94e9ad1e72a0857"

SRC_URI[aarch64-wayland.md5sum] = "ee27ca7b1970c9040f3e9412a31ae6ee"
SRC_URI[aarch64-wayland.sha256sum] = "ba4fab13d35aeff2c531ca31e91404112c5f849add382b5819cbf50707eeff92"

SRC_URI[aarch64-x11.md5sum] = "d1d0309260ccb3f3cdd3c9b81656f25e"
SRC_URI[aarch64-x11.sha256sum] = "6a71aad2c403bc94ac68ff090a9c4c3e271377d59f6a38b213927b6f095db556"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
