DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b0bab6ff55420d043cf1652c52d788" 

SRC_URI[arm-fb.md5sum] = "eb14b1ed91563a1a3bd65d7ab46add6f"
SRC_URI[arm-fb.sha256sum] = "2f1933432921c5aa0b08178012d2c933a93253c6e7ca4edb762b1cbc0c38e5bb"

SRC_URI[arm-wayland.md5sum] = "86283d807d826e87698aea8b42fdadaf"
SRC_URI[arm-wayland.sha256sum] = "7030202854dea5b424c565f326f33f95b06e1ec5660e61360fab5b86c4934054"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "63033dcfc248be2ed8e183cec78c162e"
SRC_URI[aarch64-fb.sha256sum] = "52108ea47fc0ae47fe50f4875ba0d55064445ec14cfff8fdbdca03c1a9fb2203"

SRC_URI[aarch64-wayland.md5sum] = "2619758dda81cd5b141c0efa9123426a"
SRC_URI[aarch64-wayland.sha256sum] = "d4d3d387f7f8e42328ea63a4ab27d4aa4a73e35895bc3f8dad1852080b8d6a5b"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
