DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "8b59924c4f58243fe68dba94b318cd5a"
SRC_URI[arm-fb.sha256sum] = "8e8c91a47510c3b21f5493e901ec7988185234934b621b235f2cc484c4436005"

SRC_URI[arm-wayland.md5sum] = "2e1fd3832b3e8731f2fdabf03024d2e8"
SRC_URI[arm-wayland.sha256sum] = "a3fa47c731c7a132bd9d0914507292f416360e35a3593afa0131e075fece5271"

SRC_URI[arm-x11.md5sum] = "4470391465b1bab1936f9ae874f741ca"
SRC_URI[arm-x11.sha256sum] = "6552424b1fe14b1b4b391e7789e0d19c35de077d31dde200b6b31f5cbef28fce"

SRC_URI[aarch64-fb.md5sum] = "a1212d5d22c8317de55fb22525e8d761"
SRC_URI[aarch64-fb.sha256sum] = "21753da1a5054ff283914f6c5c4b17e7f73dd047641346e49f460486085efe75"

SRC_URI[aarch64-wayland.md5sum] = "c5497b6b7a5bc6f82ccbc34c517094fb"
SRC_URI[aarch64-wayland.sha256sum] = "33439b3475d2704b7ed9c6b0afd46dedcfe7361a00dbc2a44f12d46f2d3f89bf"

SRC_URI[aarch64-x11.md5sum] = "3fde9aa3e99b0e81577eff436a642a70"
SRC_URI[aarch64-x11.sha256sum] = "0648f033a8b3c99fb911b33143323f8f2db527306630920142a359b90843628d"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
