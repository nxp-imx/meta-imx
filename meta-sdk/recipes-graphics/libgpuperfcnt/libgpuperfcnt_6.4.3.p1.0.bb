DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[arm-fb.md5sum] = "205217a2c8d5a668d6421cad1700825e"
SRC_URI[arm-fb.sha256sum] = "2f2559aba2dcbb5fcace95d95833d2056f96aea776038016b65105121f06d858"

SRC_URI[arm-wayland.md5sum] = "52272beae2033116a01f4a0435e9b296"
SRC_URI[arm-wayland.sha256sum] = "5273465493842178d2fa09efdf741e631cfca3ffdb7641b3355525bcc27e17bd"

SRC_URI[arm-x11.md5sum] = "080da25b789b782b724d37668bd3a2f1"
SRC_URI[arm-x11.sha256sum] = "fa958ba043d48141d33250241367f9b1a4a2ecd0811ac5035a8a1c29b84daceb"

SRC_URI[aarch64-fb.md5sum] = "9e49e4490a4d5a57e9282c916f65dad9"
SRC_URI[aarch64-fb.sha256sum] = "a6ffa5c49158fe6add4035f31219f25d51f990a2f469751f5ba5369fe883f17d"

SRC_URI[aarch64-wayland.md5sum] = "9ec8eabf710ed67ca53f62bb866ad219"
SRC_URI[aarch64-wayland.sha256sum] = "8344b86fade0960020fc4913482023d972200599580dfcfc82b16cd8409c3d91"

SRC_URI[aarch64-x11.md5sum] = "17be5c07065d4474e134a40abe04a787"
SRC_URI[aarch64-x11.sha256sum] = "8dfaed20b3f194a073bd8f425dbee4b049bece796d2a518272f8845ae4baec5b"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
