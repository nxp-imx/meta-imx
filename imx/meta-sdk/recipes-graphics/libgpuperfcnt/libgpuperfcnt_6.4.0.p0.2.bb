DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[arm-fb.md5sum] = "7dffb80981a9e3cea7ce4bbd2afc5502"
SRC_URI[arm-fb.sha256sum] = "789d129156b3a1fa7c09202b009243d1b341cc11526d781f3c09c614f5777046"

SRC_URI[arm-wayland.md5sum] = "0d73616bf92d063f4b4b89a8609f1f5c"
SRC_URI[arm-wayland.sha256sum] = "ee99fee6d9297a8d2d3d49e8e0668cb36a171acc46580548616c852363f5b81f"

SRC_URI[arm-x11.md5sum] = "43768381d51aea9142004cba2af8bdaf"
SRC_URI[arm-x11.sha256sum] = "5a2c90092069038ed671c5fbf0ad8c29a866b222316296425c3a639b0092e247"

SRC_URI[aarch64-fb.md5sum] = "2bcd3abb3cf242ceec0de58e70584a69"
SRC_URI[aarch64-fb.sha256sum] = "8b4a650401a34002e62bb53408d4b44c7c5e099932b4ce13c45645bf2d6356cf"

SRC_URI[aarch64-wayland.md5sum] = "cd587eceac0da8642adf335a5f5c7813"
SRC_URI[aarch64-wayland.sha256sum] = "fb98d756ba558eb1b1a15b93f88e13ab3a1960dfc430f506c3cd29f643b41331"

SRC_URI[aarch64-x11.md5sum] = "f197f442b49f3c628215de5d9c89aff9"
SRC_URI[aarch64-x11.sha256sum] = "1099c6609b82199a0c0c98809b845a3d9c4a893281113dfe82348d1b1eed94ab"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
