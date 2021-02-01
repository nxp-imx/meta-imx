DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659" 

SRC_URI[arm-fb.md5sum] = "45a75004dc21ecc0b52dc1161b110ab2"
SRC_URI[arm-fb.sha256sum] = "39cb7b2a6045e9f3c5b7b52e316abf94da29f25ac443278f09416e7722ff4b7f"

SRC_URI[arm-wayland.md5sum] = "3c78d29285278e1431c8c7f371235268"
SRC_URI[arm-wayland.sha256sum] = "9f97344698e2971e0e6a79999ee60d16c2666f4177bc686dfc74765f3cda0fe5"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "bb9c36ef55cc98902515645514140e1e"
SRC_URI[aarch64-fb.sha256sum] = "b00d7113cc727daa7dc9f93605154a68f179e3807fe4525062d68af3ec7a8538"

SRC_URI[aarch64-wayland.md5sum] = "e693a99981e3e5318770c10796b90a92"
SRC_URI[aarch64-wayland.sha256sum] = "ceb01b49adb0dd5037bfc5c5bf25229b01d31dd9b383ca1d3bedb049597322a3"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
