DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "e4029c4b547d214a334b16dbd6a39238"
SRC_URI[arm-fb.sha256sum] = "c8c97494c5f7feca6a0593b839c37cf8a641e9f44ca65ab222a702446d69fc5f"

SRC_URI[arm-wayland.md5sum] = "4c5d692567fdef175ed90be031136f90"
SRC_URI[arm-wayland.sha256sum] = "089d3e9236854810356c611c2c1c5d4e216c6442819db4f37fb6cc821fe20718"

SRC_URI[arm-x11.md5sum] = "d2b1591845c47a116dbe3c48f5605af5"
SRC_URI[arm-x11.sha256sum] = "95e79fd0527b0332445524174436a0e886b8569602d92ffaf2496283da50600c"

SRC_URI[aarch64-fb.md5sum] = "e64130a57cc70446126c1fff7af92c74"
SRC_URI[aarch64-fb.sha256sum] = "5ee3f9f012ed41cfae19460ed1a033bf88cab86cff0668ce728dc289c4cb05b2"

SRC_URI[aarch64-wayland.md5sum] = "ee27ca7b1970c9040f3e9412a31ae6ee"
SRC_URI[aarch64-wayland.sha256sum] = "ba4fab13d35aeff2c531ca31e91404112c5f849add382b5819cbf50707eeff92"

SRC_URI[aarch64-x11.md5sum] = "370f8097a2ceac055c4dd0f7124715a5"
SRC_URI[aarch64-x11.sha256sum] = "f3cdaea45c7430e3c3803c952d7961425d88b47bc592a29eea2bb2b02e580e18"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
